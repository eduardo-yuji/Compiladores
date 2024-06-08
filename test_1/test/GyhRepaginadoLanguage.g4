grammar GyhRepaginadoLanguage;

@header{
	import java.util.*;
}

@members{
	private String _nomeVar; 
	private String _tipoVar;
	private String _valorVar;
	
	private Simbolo _simboloVar;
	
	private String _varCondicao
	//======
	private GeraCodigo prog = new GeraCodigo(); 
	
	private ArrayList<Comando> listCmd = new ArrayList<Comando>(); 
	//======
	
	private TabelaSimbolo _tabelaSimbolo = new TabelaSimbolo();
	
	public void imprimeTabelaSimbolo(TabelaSimbolo tabela){
		for(Simbolo s: tabela.getTabela().values()){
			System.out.println(s.toString());
		}
	}
}

//Gramatica

programa: IniDelim PCDec FimDelim listaDeclaracoes 
		  IniDelim PCProg FimDelim listaComandos 
		  { prog.setTabela(_tabelaSimbolo);
		  	prog.setComando(listCmd);
		    prog.geradorCodigo();
		    imprimeTabelaSimbolo(_tabelaSimbolo); System.out.println("\nAnalise Sintatica finalizada com sucesso! "); };

listaDeclaracoes: declaracao (listaDeclaracoes)?;

declaracao: Var IniDelim (PCInt | PCReal) FimDelim
			{ _nomeVar= _input.LT(-4).getText();
			  _tipoVar= _input.LT(-2).getText();
			  _valorVar= null;
			  
			  if(_tabelaSimbolo.exists(_nomeVar)==false){
			  		_simboloVar=new Simbolo(_nomeVar, _tipoVar, _valorVar);
			  		_tabelaSimbolo.setTabela(_simboloVar);	
			  }	
			  else{
			  	System.out.println("Erro semantico >> redeclaracao de variavel: "+_nomeVar);
			  }	  
			};//declaracao de variáveis

expressaoAritmetica: termoAritmetico 	 
		('+' termoAritmetico )?; 

termoAritmetico: fatorAritmetico 
				('*' fatorAritmetico  )?; //arrumar isso aqui!!!!

fatorAritmetico: NumInt| NumReal | Var; //arrumar isso aqui!!!!; 

expressaoRelacional: (termoRelacional operadorBooleano {_varCondicao+=" "+_input.LT(-1).getText()+" ";})* termoRelacional; // MEIO TORTINHO

termoRelacional: expressaoAritmetica    {_varCondicao+=_varExp; _varExp="";}
				 OpRel                  {_varCondicao+=_input.LT(-1).getText();}
				 expressaoAritmetica    {_varCondicao+=_varExp; _varExp="";} 
				 | 
				 AbrePar                {_varCondicao+=" ( ";}
				 expressaoRelacional 
				 FechaPar               {_varCondicao+=" ) ";};


operadorBooleano: 'or'| 'and';

listaComandos: comando (listaComandos)?;

comando: comandoAtribuicao 
       | comandoEntrada 
       | comandoSaida 
       | comandoCondicao 
       | comandoRepeticao 
       | subAlgoritmo;

comandoAtribuicao: Var Atrib expressaoAritmetica;

comandoEntrada: PCLer Var
                {
                  if(!_tabelaSimbolo.exists(_input.LT(-1).getText())) {
                    System.out.println("Erro semântico >> variável não declarada: " + _input.LT(-1).getText());
                  } else {
                    ComandoLeitura cmd = new ComandoLeitura();
                    cmd.setId(_input.LT(-1).getText());
                    listCmd.add(cmd);
                  }
                };

comandoSaida: PCImprimir (Var | Cadeia)
              {
                ComandoEscrita cmd = new ComandoEscrita();
                cmd.setTexto(_input.LT(-1).getText());
                listCmd.add(cmd);
              };

comandoCondicao: PCSe expressaoRelacional PCEntao comando (PCSenao comando)?;

comandoRepeticao: PCEnqto expressaoRelacional PCEntao comando;

subAlgoritmo: PCIni listaComandos PCFim;


//==========


FimDelim: ']';
IniDelim: '[';
Atrib: '<<';
OpRel: '>=' | '<=' | '>' | '<' | '<>' | '==';
AbrePar: '(';
FechaPar: ')';
OpBoolE: 'and';
OpBoolOu: 'or';
PCProg: 'prog';
PCDec:  'dec';
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

Cadeia:  '"' ( [0-9] | [a-z] | [A-Z] | OpRel | Atrib )* '"';

NumInt: [0-9]+;

NumReal: [0-9]+ '.' [0-9]+;

WS: (' ' | '\n' | '\t')->skip;

Comentario: '#' ~('\n')* ->skip;






