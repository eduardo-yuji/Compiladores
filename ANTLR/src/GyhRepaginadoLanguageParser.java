// Generated from GyhRepaginadoLanguage.g4 by ANTLR 4.7.2

	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GyhRepaginadoLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FimDelim=1, IniDelim=2, AbrePar=3, FechaPar=4, OpAritMult=5, OpAritDiv=6, 
		OpAritSoma=7, OpAritSub=8, Atrib=9, OpRel=10, OpBoolE=11, OpBoolOu=12, 
		PCProg=13, PCDec=14, PCInt=15, PCReal=16, PCLer=17, PCImprimir=18, PCSe=19, 
		PCSenao=20, PCEntao=21, PCEnqto=22, PCIni=23, PCFim=24, Var=25, Cadeia=26, 
		NumInt=27, NumReal=28, WS=29, Comentario=30;
	public static final int
		RULE_programa = 0, RULE_listaDeclaracoes = 1, RULE_declaracao = 2, RULE_expressaoAritmetica = 3, 
		RULE_termoAritmetico = 4, RULE_fatorAritmetico = 5, RULE_expressaoRelacional = 6, 
		RULE_termoRelacional = 7, RULE_listaComandos = 8, RULE_comando = 9, RULE_comandoAtribuicao = 10, 
		RULE_comandoEntrada = 11, RULE_comandoSaida = 12, RULE_comandoCondicao = 13, 
		RULE_comandoRepeticao = 14, RULE_subAlgoritmo = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "listaDeclaracoes", "declaracao", "expressaoAritmetica", 
			"termoAritmetico", "fatorAritmetico", "expressaoRelacional", "termoRelacional", 
			"listaComandos", "comando", "comandoAtribuicao", "comandoEntrada", "comandoSaida", 
			"comandoCondicao", "comandoRepeticao", "subAlgoritmo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "']'", "'['", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'<<'", 
			null, "'and'", "'or'", "'prog'", "'dec'", "'integer'", "'float'", "'read'", 
			"'print'", "'if'", "'else'", "'then'", "'while'", "'start'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FimDelim", "IniDelim", "AbrePar", "FechaPar", "OpAritMult", "OpAritDiv", 
			"OpAritSoma", "OpAritSub", "Atrib", "OpRel", "OpBoolE", "OpBoolOu", "PCProg", 
			"PCDec", "PCInt", "PCReal", "PCLer", "PCImprimir", "PCSe", "PCSenao", 
			"PCEntao", "PCEnqto", "PCIni", "PCFim", "Var", "Cadeia", "NumInt", "NumReal", 
			"WS", "Comentario"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GyhRepaginadoLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public GyhRepaginadoLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<TerminalNode> IniDelim() { return getTokens(GyhRepaginadoLanguageParser.IniDelim); }
		public TerminalNode IniDelim(int i) {
			return getToken(GyhRepaginadoLanguageParser.IniDelim, i);
		}
		public TerminalNode PCDec() { return getToken(GyhRepaginadoLanguageParser.PCDec, 0); }
		public List<TerminalNode> FimDelim() { return getTokens(GyhRepaginadoLanguageParser.FimDelim); }
		public TerminalNode FimDelim(int i) {
			return getToken(GyhRepaginadoLanguageParser.FimDelim, i);
		}
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public TerminalNode PCProg() { return getToken(GyhRepaginadoLanguageParser.PCProg, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(IniDelim);
			setState(33);
			match(PCDec);
			setState(34);
			match(FimDelim);
			setState(35);
			listaDeclaracoes();
			setState(36);
			match(IniDelim);
			setState(37);
			match(PCProg);
			setState(38);
			match(FimDelim);
			setState(39);
			listaComandos();
			 
			              prog.setTabela(_tabelaSimbolo);
			              prog.setComando(listCmd);
			              prog.geradorCodigo();
			              imprimeTabelaSimbolo(_tabelaSimbolo); 
			              imprimeComando(listCmd);
			              System.out.println("\nAnálise Sintática finalizada com sucesso! "); 
			          
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitListaDeclaracoes(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				declaracao();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Var );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GyhRepaginadoLanguageParser.Var, 0); }
		public TerminalNode IniDelim() { return getToken(GyhRepaginadoLanguageParser.IniDelim, 0); }
		public TerminalNode FimDelim() { return getToken(GyhRepaginadoLanguageParser.FimDelim, 0); }
		public TerminalNode PCInt() { return getToken(GyhRepaginadoLanguageParser.PCInt, 0); }
		public TerminalNode PCReal() { return getToken(GyhRepaginadoLanguageParser.PCReal, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(Var);
			setState(48);
			match(IniDelim);
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==PCInt || _la==PCReal) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(50);
			match(FimDelim);
			 _nomeVar= _input.LT(-4).getText();
						  _tipoVar= _input.LT(-2).getText();
						  _valorVar= null;
						  
						  if(_tabelaSimbolo.exists(_nomeVar)==false){
						  		_simboloVar=new Simbolo(_nomeVar, _tipoVar, _valorVar);
						  		_tabelaSimbolo.setTabela(_simboloVar);	
						  }	
						  else{
						  	System.out.println("Erro semantico >> redeclaracao de variavel: "+_nomeVar);
						  }	  
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public List<TermoAritmeticoContext> termoAritmetico() {
			return getRuleContexts(TermoAritmeticoContext.class);
		}
		public TermoAritmeticoContext termoAritmetico(int i) {
			return getRuleContext(TermoAritmeticoContext.class,i);
		}
		public List<TerminalNode> OpAritSoma() { return getTokens(GyhRepaginadoLanguageParser.OpAritSoma); }
		public TerminalNode OpAritSoma(int i) {
			return getToken(GyhRepaginadoLanguageParser.OpAritSoma, i);
		}
		public List<TerminalNode> OpAritSub() { return getTokens(GyhRepaginadoLanguageParser.OpAritSub); }
		public TerminalNode OpAritSub(int i) {
			return getToken(GyhRepaginadoLanguageParser.OpAritSub, i);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			termoAritmetico();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpAritSoma || _la==OpAritSub) {
				{
				{
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==OpAritSoma || _la==OpAritSub) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55);
				termoAritmetico();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoAritmeticoContext extends ParserRuleContext {
		public List<FatorAritmeticoContext> fatorAritmetico() {
			return getRuleContexts(FatorAritmeticoContext.class);
		}
		public FatorAritmeticoContext fatorAritmetico(int i) {
			return getRuleContext(FatorAritmeticoContext.class,i);
		}
		public List<TerminalNode> OpAritMult() { return getTokens(GyhRepaginadoLanguageParser.OpAritMult); }
		public TerminalNode OpAritMult(int i) {
			return getToken(GyhRepaginadoLanguageParser.OpAritMult, i);
		}
		public List<TerminalNode> OpAritDiv() { return getTokens(GyhRepaginadoLanguageParser.OpAritDiv); }
		public TerminalNode OpAritDiv(int i) {
			return getToken(GyhRepaginadoLanguageParser.OpAritDiv, i);
		}
		public TermoAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterTermoAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitTermoAritmetico(this);
		}
	}

	public final TermoAritmeticoContext termoAritmetico() throws RecognitionException {
		TermoAritmeticoContext _localctx = new TermoAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_termoAritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			fatorAritmetico();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpAritMult || _la==OpAritDiv) {
				{
				{
				setState(62);
				_la = _input.LA(1);
				if ( !(_la==OpAritMult || _la==OpAritDiv) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				fatorAritmetico();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorAritmeticoContext extends ParserRuleContext {
		public TerminalNode NumInt() { return getToken(GyhRepaginadoLanguageParser.NumInt, 0); }
		public TerminalNode NumReal() { return getToken(GyhRepaginadoLanguageParser.NumReal, 0); }
		public TerminalNode Var() { return getToken(GyhRepaginadoLanguageParser.Var, 0); }
		public TerminalNode AbrePar() { return getToken(GyhRepaginadoLanguageParser.AbrePar, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GyhRepaginadoLanguageParser.FechaPar, 0); }
		public FatorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterFatorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitFatorAritmetico(this);
		}
	}

	public final FatorAritmeticoContext fatorAritmetico() throws RecognitionException {
		FatorAritmeticoContext _localctx = new FatorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fatorAritmetico);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(NumInt);
				}
				break;
			case NumReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(NumReal);
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(Var);
				}
				break;
			case AbrePar:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(AbrePar);
				setState(73);
				expressaoAritmetica();
				setState(74);
				match(FechaPar);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public List<TermoRelacionalContext> termoRelacional() {
			return getRuleContexts(TermoRelacionalContext.class);
		}
		public TermoRelacionalContext termoRelacional(int i) {
			return getRuleContext(TermoRelacionalContext.class,i);
		}
		public List<TerminalNode> OpBoolOu() { return getTokens(GyhRepaginadoLanguageParser.OpBoolOu); }
		public TerminalNode OpBoolOu(int i) {
			return getToken(GyhRepaginadoLanguageParser.OpBoolOu, i);
		}
		public List<TerminalNode> OpBoolE() { return getTokens(GyhRepaginadoLanguageParser.OpBoolE); }
		public TerminalNode OpBoolE(int i) {
			return getToken(GyhRepaginadoLanguageParser.OpBoolE, i);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitExpressaoRelacional(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressaoRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			termoRelacional();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpBoolE || _la==OpBoolOu) {
				{
				{
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==OpBoolE || _la==OpBoolOu) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(80);
				termoRelacional();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public TerminalNode OpRel() { return getToken(GyhRepaginadoLanguageParser.OpRel, 0); }
		public TerminalNode AbrePar() { return getToken(GyhRepaginadoLanguageParser.AbrePar, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GyhRepaginadoLanguageParser.FechaPar, 0); }
		public TermoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterTermoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitTermoRelacional(this);
		}
	}

	public final TermoRelacionalContext termoRelacional() throws RecognitionException {
		TermoRelacionalContext _localctx = new TermoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_termoRelacional);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				expressaoAritmetica();
				setState(87);
				match(OpRel);
				setState(88);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(AbrePar);
				setState(91);
				expressaoRelacional();
				setState(92);
				match(FechaPar);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitListaComandos(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaComandos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(96);
					comando();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public ComandoAtribuicaoContext comandoAtribuicao() {
			return getRuleContext(ComandoAtribuicaoContext.class,0);
		}
		public ComandoEntradaContext comandoEntrada() {
			return getRuleContext(ComandoEntradaContext.class,0);
		}
		public ComandoSaidaContext comandoSaida() {
			return getRuleContext(ComandoSaidaContext.class,0);
		}
		public ComandoCondicaoContext comandoCondicao() {
			return getRuleContext(ComandoCondicaoContext.class,0);
		}
		public ComandoRepeticaoContext comandoRepeticao() {
			return getRuleContext(ComandoRepeticaoContext.class,0);
		}
		public SubAlgoritmoContext subAlgoritmo() {
			return getRuleContext(SubAlgoritmoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				comandoAtribuicao();
				}
				break;
			case PCLer:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				comandoEntrada();
				}
				break;
			case PCImprimir:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				comandoSaida();
				}
				break;
			case PCSe:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				comandoCondicao();
				}
				break;
			case PCEnqto:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				comandoRepeticao();
				}
				break;
			case PCIni:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				subAlgoritmo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoAtribuicaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GyhRepaginadoLanguageParser.Var, 0); }
		public TerminalNode Atrib() { return getToken(GyhRepaginadoLanguageParser.Atrib, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ComandoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitComandoAtribuicao(this);
		}
	}

	public final ComandoAtribuicaoContext comandoAtribuicao() throws RecognitionException {
		ComandoAtribuicaoContext _localctx = new ComandoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandoAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Var);
			setState(110);
			match(Atrib);
			setState(111);
			expressaoAritmetica();

			                    _nomeVar= _input.LT(-3).getText();
			                    if(_tabelaSimbolo.exists(_nomeVar)==false){
			                      System.out.println("Erro semantico >> Variavel nao declarada: "+_nomeVar);	
			                    } else {
			                      _valorVar = _input.LT(-1).getText();
			                      //ComandoAtrib cmd = new ComandoAtrib(_nomeVar,_valorVar);
			                      //listCmd.add(cmd);
			                    }
			                  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoEntradaContext extends ParserRuleContext {
		public TerminalNode PCLer() { return getToken(GyhRepaginadoLanguageParser.PCLer, 0); }
		public TerminalNode Var() { return getToken(GyhRepaginadoLanguageParser.Var, 0); }
		public ComandoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterComandoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitComandoEntrada(this);
		}
	}

	public final ComandoEntradaContext comandoEntrada() throws RecognitionException {
		ComandoEntradaContext _localctx = new ComandoEntradaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(PCLer);
			setState(115);
			match(Var);

			                  if(!_tabelaSimbolo.exists(_input.LT(-1).getText())) {
			                    System.out.println("Erro semântico >> variável não declarada: " + _input.LT(-1).getText());
			                  } else {
			                    ComandoLeitura cmd = new ComandoLeitura();
			                    cmd.setId(_input.LT(-1).getText());
			                    listCmd.add(cmd);
			                  }
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoSaidaContext extends ParserRuleContext {
		public TerminalNode PCImprimir() { return getToken(GyhRepaginadoLanguageParser.PCImprimir, 0); }
		public TerminalNode Var() { return getToken(GyhRepaginadoLanguageParser.Var, 0); }
		public TerminalNode Cadeia() { return getToken(GyhRepaginadoLanguageParser.Cadeia, 0); }
		public ComandoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterComandoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitComandoSaida(this);
		}
	}

	public final ComandoSaidaContext comandoSaida() throws RecognitionException {
		ComandoSaidaContext _localctx = new ComandoSaidaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comandoSaida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(PCImprimir);
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Cadeia) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoCondicaoContext extends ParserRuleContext {
		public TerminalNode PCSe() { return getToken(GyhRepaginadoLanguageParser.PCSe, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode PCEntao() { return getToken(GyhRepaginadoLanguageParser.PCEntao, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> PCSenao() { return getTokens(GyhRepaginadoLanguageParser.PCSenao); }
		public TerminalNode PCSenao(int i) {
			return getToken(GyhRepaginadoLanguageParser.PCSenao, i);
		}
		public ComandoCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterComandoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitComandoCondicao(this);
		}
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandoCondicao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(PCSe);
			setState(123);
			expressaoRelacional();
			setState(124);
			match(PCEntao);
			setState(125);
			comando();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					match(PCSenao);
					setState(127);
					comando();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoRepeticaoContext extends ParserRuleContext {
		public TerminalNode PCEnqto() { return getToken(GyhRepaginadoLanguageParser.PCEnqto, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode PCEntao() { return getToken(GyhRepaginadoLanguageParser.PCEntao, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ComandoRepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterComandoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitComandoRepeticao(this);
		}
	}

	public final ComandoRepeticaoContext comandoRepeticao() throws RecognitionException {
		ComandoRepeticaoContext _localctx = new ComandoRepeticaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comandoRepeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(PCEnqto);
			setState(134);
			expressaoRelacional();
			setState(135);
			match(PCEntao);
			setState(136);
			listaComandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubAlgoritmoContext extends ParserRuleContext {
		public TerminalNode PCIni() { return getToken(GyhRepaginadoLanguageParser.PCIni, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode PCFim() { return getToken(GyhRepaginadoLanguageParser.PCFim, 0); }
		public SubAlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAlgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).enterSubAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhRepaginadoLanguageListener ) ((GyhRepaginadoLanguageListener)listener).exitSubAlgoritmo(this);
		}
	}

	public final SubAlgoritmoContext subAlgoritmo() throws RecognitionException {
		SubAlgoritmoContext _localctx = new SubAlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(PCIni);
			setState(139);
			listaComandos();
			setState(140);
			match(PCFim);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3.\n\3\r\3\16\3/\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3\6\7\6C\n\6\f\6"+
		"\16\6F\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\7\bT\n\b"+
		"\f\b\16\bW\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\n\6\nd\n\n"+
		"\r\n\16\ne\3\13\3\13\3\13\3\13\3\13\3\13\5\13n\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7"+
		"\17\u0083\n\17\f\17\16\17\u0086\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\7"+
		"\3\2\21\22\3\2\t\n\3\2\7\b\3\2\r\16\3\2\33\34\2\u008f\2\"\3\2\2\2\4-\3"+
		"\2\2\2\6\61\3\2\2\2\b\67\3\2\2\2\n?\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20"+
		"`\3\2\2\2\22c\3\2\2\2\24m\3\2\2\2\26o\3\2\2\2\30t\3\2\2\2\32x\3\2\2\2"+
		"\34|\3\2\2\2\36\u0087\3\2\2\2 \u008c\3\2\2\2\"#\7\4\2\2#$\7\20\2\2$%\7"+
		"\3\2\2%&\5\4\3\2&\'\7\4\2\2\'(\7\17\2\2()\7\3\2\2)*\5\22\n\2*+\b\2\1\2"+
		"+\3\3\2\2\2,.\5\6\4\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3"+
		"\2\2\2\61\62\7\33\2\2\62\63\7\4\2\2\63\64\t\2\2\2\64\65\7\3\2\2\65\66"+
		"\b\4\1\2\66\7\3\2\2\2\67<\5\n\6\289\t\3\2\29;\5\n\6\2:8\3\2\2\2;>\3\2"+
		"\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2\2><\3\2\2\2?D\5\f\7\2@A\t\4\2\2AC\5"+
		"\f\7\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\13\3\2\2\2FD\3\2\2\2G"+
		"O\7\35\2\2HO\7\36\2\2IO\7\33\2\2JK\7\5\2\2KL\5\b\5\2LM\7\6\2\2MO\3\2\2"+
		"\2NG\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2O\r\3\2\2\2PU\5\20\t\2QR\t\5"+
		"\2\2RT\5\20\t\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\17\3\2\2\2WU"+
		"\3\2\2\2XY\5\b\5\2YZ\7\f\2\2Z[\5\b\5\2[a\3\2\2\2\\]\7\5\2\2]^\5\16\b\2"+
		"^_\7\6\2\2_a\3\2\2\2`X\3\2\2\2`\\\3\2\2\2a\21\3\2\2\2bd\5\24\13\2cb\3"+
		"\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\23\3\2\2\2gn\5\26\f\2hn\5\30\r\2"+
		"in\5\32\16\2jn\5\34\17\2kn\5\36\20\2ln\5 \21\2mg\3\2\2\2mh\3\2\2\2mi\3"+
		"\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\25\3\2\2\2op\7\33\2\2pq\7\13\2\2"+
		"qr\5\b\5\2rs\b\f\1\2s\27\3\2\2\2tu\7\23\2\2uv\7\33\2\2vw\b\r\1\2w\31\3"+
		"\2\2\2xy\7\24\2\2yz\t\6\2\2z{\b\16\1\2{\33\3\2\2\2|}\7\25\2\2}~\5\16\b"+
		"\2~\177\7\27\2\2\177\u0084\5\24\13\2\u0080\u0081\7\26\2\2\u0081\u0083"+
		"\5\24\13\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\35\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7\30\2\2\u0088\u0089\5\16\b\2\u0089\u008a\7\27\2\2\u008a\u008b\5\22\n"+
		"\2\u008b\37\3\2\2\2\u008c\u008d\7\31\2\2\u008d\u008e\5\22\n\2\u008e\u008f"+
		"\7\32\2\2\u008f!\3\2\2\2\13/<DNU`em\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}