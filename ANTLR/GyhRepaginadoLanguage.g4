grammar GyhRepaginadoLanguage;

@header{
    import java.util.*;
}

@members{
    private String _nomeVar; 
    private String _tipoVar;
    private String _valorVar;
    private Simbolo _simboloVar;
    private String _varCondicao;
    private String _varExp;

    private GeraCodigo prog = new GeraCodigo(); 
    private ArrayList<Comando> listCmd = new ArrayList<Comando>(); 
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

programa: 
    IniDelim PCDec FimDelim listaDeclaracoes IniDelim PCProg FimDelim listaComandos 
    { 
        prog.setTabela(_tabelaSimbolo);
        prog.setComando(listCmd);
        prog.geradorCodigo();
        imprimeTabelaSimbolo(_tabelaSimbolo); 
        imprimeComando(listCmd);
        System.out.println("\nAnálise Sintática finalizada com sucesso! "); 
    }
;

listaDeclaracoes: 
    (declaracao)+
;

declaracao: 
    Var IniDelim (PCInt | PCReal) FimDelim
    { 
        _nomeVar = _input.LT(-4).getText();
        _tipoVar = _input.LT(-2).getText();
        _valorVar = null;
        
        if(!_tabelaSimbolo.exists(_nomeVar)){
            _simboloVar = new Simbolo(_nomeVar, _tipoVar, _valorVar);
            _tabelaSimbolo.setTabela(_simboloVar);    
        } else {
            System.out.println("Erro semantico >> redeclaracao de variavel: " + _nomeVar);
        }    
    }
;

expressaoAritmetica: 
    termoAritmetico (('+' | '-') termoAritmetico)?
; 

termoAritmetico: 
    fatorAritmetico (('*' | '/') fatorAritmetico)*
;

fatorAritmetico: 
    NumInt | NumReal | Var | (AbrePar expressaoAritmetica FechaPar)
;

expressaoRelacional: 
    termoRelacional ((OpBoolOu | OpBoolE) termoRelacional)*
;

termoRelacional: 
    (expressaoAritmetica OpRel expressaoAritmetica) | (AbrePar expressaoRelacional FechaPar)
;

listaComandos: 
    (comando)+
;

comando: 
    comandoAtribuicao | comandoEntrada | comandoSaida | comandoCondicao | comandoRepeticao | subAlgoritmo
;

comandoAtribuicao: 
    Var Atrib expressaoAritmetica
    {
        _nomeVar = _input.LT(-3).getText();
        if (!_tabelaSimbolo.exists(_nomeVar)){
            System.out.println("Erro semantico >> Variavel nao declarada: " + _nomeVar);    
        } else {
            _valorVar = _input.LT(-1).getText();
            ComandoAtribuicao cmd = new ComandoAtribuicao(_nomeVar, _valorVar);
            listCmd.add(cmd);
        }
    }
;

comandoEntrada: 
    PCLer Var
    {
        if (!_tabelaSimbolo.exists(_input.LT(-1).getText())) {
            System.out.println("Erro semântico >> variável não declarada: " + _input.LT(-1).getText());
        } else {
            ComandoLeitura cmd = new ComandoLeitura();
            cmd.setId(_input.LT(-1).getText());
            cmd.setTipo(_input.LT(-1).getText());
            listCmd.add(cmd);
        }
    }
;

comandoSaida: 
    PCImprimir (Var | Cadeia)
    {
        ComandoEscrita cmd = new ComandoEscrita();
        String texto = _input.LT(-1).getText();
        if (texto.startsWith("\"") && texto.endsWith("\"")) {
            // É uma cadeia de caracteres
            cmd.setTexto(texto.substring(1, texto.length() - 1)); // Remove as aspas
        } else {
            // É uma variável
            if (!_tabelaSimbolo.exists(texto)) {
                System.out.println("Erro semântico >> variável não declarada: " + texto);
            } else {
                cmd.setTexto(texto);
            }
        }
        listCmd.add(cmd);
    }
;

comandoCondicao: 
    PCSe expressaoRelacional PCEntao comando (PCSenao comando)*
    {
        ComandoCondicao cmd = new ComandoCondicao();
        listCmd.add(cmd);
    }
;

comandoRepeticao: 
    PCEnqto expressaoRelacional PCEntao listaComandos
    {
        ComandoRepeticao cmd = new ComandoRepeticao();
        listCmd.add(cmd);
    }
;

subAlgoritmo: 
    PCIni listaComandos PCFim
;

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
