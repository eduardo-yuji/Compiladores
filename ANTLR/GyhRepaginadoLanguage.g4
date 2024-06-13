grammar GyhRepaginadoLanguage;

@header{
    import java.util.*;
}

@members{
    private String _nomeVar; 
    private String _tipoVar;
    private String _valorVar;
    private Simbolo _simboloVar;
    
    private String _expVar;
    private String _varExpressao;

    private String _varCondicao;
    private ArrayList<Comando> _cmdV = new ArrayList<Comando>();
    private ArrayList<Comando> _cmdF = new ArrayList<Comando>();;

    private GeraCodigo prog = new GeraCodigo(); 
    private ArrayList<Comando> listCmd = new ArrayList<Comando>(); 
    private ArrayList<Comando> listCmdAux = new ArrayList<Comando>(); 
    private TabelaSimbolo _tabelaSimbolo = new TabelaSimbolo();
    
    public void imprimeTabelaSimbolo(TabelaSimbolo tabela) {
        for (Simbolo s : tabela.getTabela().values()) {
            System.out.println(s.toString());
        }
    }

    public void imprimeComando(List<Comando> comandos) {
        for (Comando c : comandos) {
            System.out.println(c.toString());
        }
    }
}

//------------------------------------------------Gramatica------------------------------------------------

programa: IniDelim PCDec FimDelim listaDeclaracoes IniDelim PCProg FimDelim listaComandos 
    { 
        prog.setTabela(_tabelaSimbolo);
        prog.setComando(listCmd);
        prog.geradorCodigo();
        imprimeTabelaSimbolo(_tabelaSimbolo); 
        imprimeComando(listCmd);
        System.out.println("\nAnálise Sintática finalizada com sucesso! "); 
    };

listaDeclaracoes: (declaracao)+;

declaracao: Var                 {_nomeVar = _input.LT(-1).getText();}
            IniDelim 
            (PCInt | PCReal)    {_tipoVar = _input.LT(-1).getText();}
            FimDelim
            { 
                _valorVar = null;
                if(!_tabelaSimbolo.exists(_nomeVar)){
                    _simboloVar = new Simbolo(_nomeVar, _tipoVar, _valorVar);
                    _tabelaSimbolo.setTabela(_simboloVar);    
                } else {
                    System.out.println("Erro semantico >> redeclaracao de variavel: " + _nomeVar);
                }    
            };

expressaoAritmetica: termoAritmetico (
                    ('+'   {_varExpressao += " + "; } 
                    |'-'   {_varExpressao += " - "; }
                    ) termoAritmetico)*; 

termoAritmetico: fatorAritmetico (
                    ('*' {_varExpressao += " * "; }
                    |'/' {_varExpressao += " / "; }
                    ) fatorAritmetico)*;

fatorAritmetico: NumInt              {_varExpressao += _input.LT(-1).getText();}
                | NumReal            {_varExpressao += _input.LT(-1).getText();}
                | Var                {_varExpressao += _input.LT(-1).getText();}
                | (AbrePar           {_varCondicao+= "("; } 
                expressaoAritmetica 
                FechaPar             {_varCondicao+= ")"; }
                );

expressaoRelacional: termoRelacional    { _varCondicao+= " ";_varCondicao+= _varExpressao; _varExpressao=""; }
                    ((OpBoolOu          { _varCondicao+= " "; _varCondicao+=_input.LT(-1).getText(); }
                    | OpBoolE           { _varCondicao+= " "; _varCondicao+=_input.LT(-1).getText(); }
                    ) termoRelacional   
                    )*;

termoRelacional:                                  { _varExpressao = "";}
                (expressaoAritmetica              { _varCondicao+= " "; _varCondicao+=_input.LT(-1).getText(); _varExpressao = "";}
                OpRel                             { _varCondicao+= " "; _varCondicao+=_input.LT(-1).getText(); _varExpressao = "";}
                expressaoAritmetica)|             { _varExpressao = "";}
                (AbrePar                          { _varCondicao= "("; }
                expressaoRelacional               
                FechaPar                          { _varCondicao+= ")"; });

listaComandos:(comando
                {
                    listCmd.addAll(listCmdAux);
                    listCmdAux.removeAll(listCmdAux);
                }
            )+
;

comando: comandoAtribuicao | comandoEntrada | comandoSaida | comandoCondicao | comandoRepeticao | subAlgoritmo;

    comandoAtribuicao:  Var             {_nomeVar = (_input.LT(-1).getText());
                                        if (!_tabelaSimbolo.exists(_nomeVar)){
                                            System.out.println("Erro semantico >> Variavel nao declarada: " + _nomeVar);    
                                        } else {
                                            _expVar = _input.LT(-1).getText();}
                                        }
                    Atrib               {_varExpressao = "";}
                    expressaoAritmetica {ComandoAtribuicao cmd = new ComandoAtribuicao(_expVar, _varExpressao); listCmdAux.add(cmd);};

comandoEntrada: PCLer Var
            {
                if (!_tabelaSimbolo.exists(_input.LT(-1).getText())) {
                    System.out.println("Erro semântico >> variável não declarada: " + _input.LT(-1).getText());
                } else {
                    String _tipo ="";
                    ComandoLeitura cmd = new ComandoLeitura();
                    cmd.setId(_input.LT(-1).getText());
                    cmd.setTipo(_tipo);
                    listCmdAux.add(cmd);
                }
            };

comandoSaida: PCImprimir    {ComandoEscrita cmd = new ComandoEscrita();}
            (Var            {
                                String texto = _input.LT(-1).getText();
                                if (!_tabelaSimbolo.exists(texto)) {
                                    System.out.println("Erro semântico >> variável não declarada: " + texto);
                                } else {
                                    cmd.setTexto(texto);
                                }
                            }
            |Cadeia)        {
                                String texto = _input.LT(-1).getText();
                                cmd.setTexto(texto);
                            }
                            {listCmdAux.add(cmd);};

comandoCondicao: PCSe               {_varExpressao= ""; _varCondicao= "";}
                expressaoRelacional
                PCEntao
                comando             { _cmdV.addAll(listCmdAux); listCmdAux.removeAll(listCmdAux);}
                (PCSenao comando    { _cmdF.addAll(listCmdAux); listCmdAux.removeAll(listCmdAux);}
                )*
                {
                    ComandoCondicao cmd = new ComandoCondicao(_varCondicao, _cmdV, _cmdF);
                    listCmdAux.add(cmd);
                };

comandoRepeticao: PCEnqto   { _varExpressao= ""; _varCondicao= "";}
                    expressaoRelacional PCEntao comando           
                    {
                        _cmdV.addAll(listCmdAux); listCmdAux.removeAll(listCmdAux);
                        ComandoRepeticao cmd = new ComandoRepeticao(_varCondicao, _cmdV);
                        listCmdAux.add(cmd);
                    };

subAlgoritmo: PCIni comando+ PCFim;

//------------------------------------------------Tokens------------------------------------------------

FimDelim: ']';
IniDelim: '[';
AbrePar: '(';
FechaPar: ')';
OpAritMult: '*';
OpAritDiv: '/';
OpAritSoma: '+';
OpAritSub: '-';
Atrib: '<<';
OpRel: '>=' | '<=' | '>' | '<' | '<>' | '==';
OpBoolE: 'and';
OpBoolOu: 'or';
PCProg: 'prog';
PCDec: 'dec';
PCInt: 'integer';
PCReal: 'float'; 
PCLer: 'read';
PCImprimir: 'print';
PCSe: 'if';
PCSenao: 'else';
PCEntao: 'then';
PCEnqto: 'while';
PCIni: 'start';
PCFim: 'end';

Var: [A-Z] ( [0-9] | [a-z] | [A-Z] )*;
Cadeia: '"' ( [0-9] | [a-z] | [A-Z] | OpRel | Atrib )* '"';
NumInt: [0-9]+;
NumReal: [0-9]+ '.' [0-9]+;

WS: (' ' | '\n' | '\t') -> skip;
Comentario: '#' ~('\n')* -> skip;
