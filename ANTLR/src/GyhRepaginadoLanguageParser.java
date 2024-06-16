// Generated from .\GyhRepaginadoLanguage.g4 by ANTLR 4.7.2

    import java.util.*;
    import java.util.Stack;

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
	    
	    private String _expVar;
	    private String _varExpressao;

	    private String _varCondicao;
	    private String _varCondicaoRep;
	    private String _varCondicaoCond;
	    private ArrayList<Comando> _cmdIf = new ArrayList<Comando>();
	    private ArrayList<Comando> _cmdElse = new ArrayList<Comando>();
	    private ArrayList<Comando> _cmdRep = new ArrayList<Comando>();
	    
	    private Stack<String> _varCondicaoStack = new Stack<>();
	    private Stack<String> _varExpressaoStack = new Stack<>();
	    private Stack<ArrayList<Comando>> stack = new Stack<>();

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
			_nomeVar = _input.LT(-1).getText();
			setState(49);
			match(IniDelim);
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==PCInt || _la==PCReal) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_tipoVar = _input.LT(-1).getText();
			setState(52);
			match(FimDelim);
			 
			                _valorVar = null;
			                if(!_tabelaSimbolo.exists(_nomeVar)){
			                    _simboloVar = new Simbolo(_nomeVar, _tipoVar, _valorVar);
			                    _tabelaSimbolo.setTabela(_simboloVar);    
			                } else {
			                    System.out.println("Erro semantico >> redeclaracao de variavel: " + _nomeVar);
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
			setState(55);
			termoAritmetico();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpAritSoma || _la==OpAritSub) {
				{
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpAritSoma:
					{
					setState(56);
					match(OpAritSoma);
					_varExpressao += " + "; 
					}
					break;
				case OpAritSub:
					{
					setState(58);
					match(OpAritSub);
					_varExpressao += " - "; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62);
				termoAritmetico();
				}
				}
				setState(67);
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
			setState(68);
			fatorAritmetico();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpAritMult || _la==OpAritDiv) {
				{
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpAritMult:
					{
					setState(69);
					match(OpAritMult);
					_varExpressao += " * "; 
					}
					break;
				case OpAritDiv:
					{
					setState(71);
					match(OpAritDiv);
					_varExpressao += " / "; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75);
				fatorAritmetico();
				}
				}
				setState(80);
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(NumInt);
				_varExpressao += _input.LT(-1).getText();
				}
				break;
			case NumReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(NumReal);
				_varExpressao += _input.LT(-1).getText();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(Var);
				_varExpressao += _input.LT(-1).getText();
				}
				break;
			case AbrePar:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(87);
				match(AbrePar);
				_varExpressao += "("; 
				setState(89);
				expressaoAritmetica();
				setState(90);
				match(FechaPar);
				_varExpressao += ")"; 
				}
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
			setState(95);
			termoRelacional();
			 _varCondicao += " ";_varCondicao+= _varExpressao; _varExpressao=""; 
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpBoolE || _la==OpBoolOu) {
				{
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpBoolOu:
					{
					setState(97);
					match(OpBoolOu);
					 _varCondicao += " ||";
					}
					break;
				case OpBoolE:
					{
					setState(99);
					match(OpBoolE);
					 _varCondicao += " &&";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103);
				termoRelacional();
				 _varCondicao += " ";_varCondicao+= _varExpressao; _varExpressao=""; 
				}
				}
				setState(110);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 _varExpressao = "";
				{
				setState(112);
				expressaoAritmetica();
				 _varCondicao += " "; _varCondicao+=_input.LT(-1).getText(); _varExpressao = "";
				setState(114);
				match(OpRel);
				 _varCondicao += " "; _varCondicao+=_input.LT(-1).getText(); _varExpressao = "";
				setState(116);
				expressaoAritmetica();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 _varExpressao = "";
				{
				setState(119);
				match(AbrePar);
				 _varCondicao = "("; 
				setState(121);
				expressaoRelacional();
				setState(122);
				match(FechaPar);
				 _varCondicao += ")"; 
				}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				comando();
				listCmd.addAll(listCmdAux); listCmdAux.removeAll(listCmdAux);
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLer) | (1L << PCImprimir) | (1L << PCSe) | (1L << PCEnqto) | (1L << PCIni) | (1L << Var))) != 0) );
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
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(134);
				comandoAtribuicao();
				}
				break;
			case PCLer:
				{
				setState(135);
				comandoEntrada();
				}
				break;
			case PCImprimir:
				{
				setState(136);
				comandoSaida();
				}
				break;
			case PCSe:
				{
				setState(137);
				comandoCondicao();
				}
				break;
			case PCEnqto:
				{
				setState(138);
				comandoRepeticao();
				}
				break;
			case PCIni:
				{
				setState(139);
				subAlgoritmo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(142);
			match(Var);
			_nomeVar = (_input.LT(-1).getText());
			                                    if (!_tabelaSimbolo.exists(_nomeVar)){
			                                        System.out.println("Erro semantico >> Variavel nao declarada: " + _nomeVar);    
			                                    } else {
			                                        _expVar = _input.LT(-1).getText();}
			                                    
			setState(144);
			match(Atrib);
			_varExpressao = "";
			setState(146);
			expressaoAritmetica();
			ComandoAtribuicao cmd = new ComandoAtribuicao(_expVar, _varExpressao, _tabelaSimbolo); listCmdAux.add(cmd);
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
			setState(149);
			match(PCLer);
			setState(150);
			match(Var);

			                if (!_tabelaSimbolo.exists(_input.LT(-1).getText())) {
			                    System.out.println("Erro semântico >> variável não declarada: " + _input.LT(-1).getText());
			                } else {
			                    ComandoLeitura cmd = new ComandoLeitura();
			                    cmd.setId(_input.LT(-1).getText());
			                    cmd.setTipo(_tabelaSimbolo);
			                    listCmdAux.add(cmd);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(PCImprimir);
			ComandoEscrita cmd = new ComandoEscrita();
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(155);
				match(Var);

				                                String texto = _input.LT(-1).getText();
				                                if (!_tabelaSimbolo.exists(texto)) {
				                                    System.out.println("Erro semântico >> variável não declarada: " + texto);
				                                } else {
				                                    cmd.setTexto(texto);
				                                    cmd.setTabela(_tabelaSimbolo);
				                                }
				                            
				}
				break;
			case Cadeia:
				{
				setState(157);
				match(Cadeia);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			                                String texto = _input.LT(-1).getText();
			                                cmd.setTexto(texto);
			                            
			listCmdAux.add(cmd);
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
		public TerminalNode PCSenao() { return getToken(GyhRepaginadoLanguageParser.PCSenao, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			_varExpressao="";_varCondicao="";
			setState(164);
			match(PCSe);
			setState(165);
			expressaoRelacional();
			 _varCondicaoStack.push(_varCondicao);
			setState(167);
			match(PCEntao);
			 stack.push(listCmdAux); listCmdAux = new ArrayList<Comando>();
			setState(169);
			comando();
			 _cmdIf = listCmdAux; listCmdAux = stack.pop();
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(171);
				match(PCSenao);
				 stack.push(listCmdAux); listCmdAux = new ArrayList<Comando>();
				setState(173);
				comando();
				 _cmdElse = listCmdAux; listCmdAux = stack.pop();
				}
				break;
			}
			 _varCondicaoCond = _varCondicaoStack.pop();
			                                     ComandoCondicao cmd = new ComandoCondicao(_varCondicaoCond, _cmdIf, _cmdElse);
			                                        listCmdAux.add(cmd);
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
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
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
			_varExpressao="";_varCondicao="";
			setState(181);
			match(PCEnqto);
			setState(182);
			expressaoRelacional();
			 _varCondicaoStack.push(_varCondicao);
			setState(184);
			match(PCEntao);
			stack.push(listCmdAux); listCmdAux = new ArrayList<Comando>();
			setState(186);
			comando();
			 _varCondicaoRep = _varCondicaoStack.pop();
			                                        _cmdRep = listCmdAux; listCmdAux = stack.pop();
			                                        ComandoRepeticao cmd = new ComandoRepeticao(_varCondicaoRep, _cmdRep); listCmdAux.add(cmd);
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
		public TerminalNode PCFim() { return getToken(GyhRepaginadoLanguageParser.PCFim, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(PCIni);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				comando();
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLer) | (1L << PCImprimir) | (1L << PCSe) | (1L << PCEnqto) | (1L << PCIni) | (1L << Var))) != 0) );
			setState(195);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3.\n\3\r\3\16\3/\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\7\5B\n\5\f\5\16\5E\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\6\7\6O\n\6\f\6\16\6R\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bh\n\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\n\3\n\3\n\6\n\u0085"+
		"\n\n\r\n\16\n\u0086\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00a1\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00b3\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\6\21\u00c2\n\21\r\21\16\21\u00c3\3\21\3"+
		"\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\21\22"+
		"\2\u00cb\2\"\3\2\2\2\4-\3\2\2\2\6\61\3\2\2\2\b9\3\2\2\2\nF\3\2\2\2\f_"+
		"\3\2\2\2\16a\3\2\2\2\20\177\3\2\2\2\22\u0084\3\2\2\2\24\u008e\3\2\2\2"+
		"\26\u0090\3\2\2\2\30\u0097\3\2\2\2\32\u009b\3\2\2\2\34\u00a5\3\2\2\2\36"+
		"\u00b6\3\2\2\2 \u00bf\3\2\2\2\"#\7\4\2\2#$\7\20\2\2$%\7\3\2\2%&\5\4\3"+
		"\2&\'\7\4\2\2\'(\7\17\2\2()\7\3\2\2)*\5\22\n\2*+\b\2\1\2+\3\3\2\2\2,."+
		"\5\6\4\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61\62"+
		"\7\33\2\2\62\63\b\4\1\2\63\64\7\4\2\2\64\65\t\2\2\2\65\66\b\4\1\2\66\67"+
		"\7\3\2\2\678\b\4\1\28\7\3\2\2\29C\5\n\6\2:;\7\t\2\2;?\b\5\1\2<=\7\n\2"+
		"\2=?\b\5\1\2>:\3\2\2\2><\3\2\2\2?@\3\2\2\2@B\5\n\6\2A>\3\2\2\2BE\3\2\2"+
		"\2CA\3\2\2\2CD\3\2\2\2D\t\3\2\2\2EC\3\2\2\2FP\5\f\7\2GH\7\7\2\2HL\b\6"+
		"\1\2IJ\7\b\2\2JL\b\6\1\2KG\3\2\2\2KI\3\2\2\2LM\3\2\2\2MO\5\f\7\2NK\3\2"+
		"\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\13\3\2\2\2RP\3\2\2\2ST\7\35\2\2T`"+
		"\b\7\1\2UV\7\36\2\2V`\b\7\1\2WX\7\33\2\2X`\b\7\1\2YZ\7\5\2\2Z[\b\7\1\2"+
		"[\\\5\b\5\2\\]\7\6\2\2]^\b\7\1\2^`\3\2\2\2_S\3\2\2\2_U\3\2\2\2_W\3\2\2"+
		"\2_Y\3\2\2\2`\r\3\2\2\2ab\5\20\t\2bn\b\b\1\2cd\7\16\2\2dh\b\b\1\2ef\7"+
		"\r\2\2fh\b\b\1\2gc\3\2\2\2ge\3\2\2\2hi\3\2\2\2ij\5\20\t\2jk\b\b\1\2km"+
		"\3\2\2\2lg\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\17\3\2\2\2pn\3\2\2\2"+
		"qr\b\t\1\2rs\5\b\5\2st\b\t\1\2tu\7\f\2\2uv\b\t\1\2vw\5\b\5\2w\u0080\3"+
		"\2\2\2xy\b\t\1\2yz\7\5\2\2z{\b\t\1\2{|\5\16\b\2|}\7\6\2\2}~\b\t\1\2~\u0080"+
		"\3\2\2\2\177q\3\2\2\2\177x\3\2\2\2\u0080\21\3\2\2\2\u0081\u0082\5\24\13"+
		"\2\u0082\u0083\b\n\1\2\u0083\u0085\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\23\3\2\2\2\u0088"+
		"\u008f\5\26\f\2\u0089\u008f\5\30\r\2\u008a\u008f\5\32\16\2\u008b\u008f"+
		"\5\34\17\2\u008c\u008f\5\36\20\2\u008d\u008f\5 \21\2\u008e\u0088\3\2\2"+
		"\2\u008e\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008d\3\2\2\2\u008f\25\3\2\2\2\u0090\u0091\7\33\2\2\u0091"+
		"\u0092\b\f\1\2\u0092\u0093\7\13\2\2\u0093\u0094\b\f\1\2\u0094\u0095\5"+
		"\b\5\2\u0095\u0096\b\f\1\2\u0096\27\3\2\2\2\u0097\u0098\7\23\2\2\u0098"+
		"\u0099\7\33\2\2\u0099\u009a\b\r\1\2\u009a\31\3\2\2\2\u009b\u009c\7\24"+
		"\2\2\u009c\u00a0\b\16\1\2\u009d\u009e\7\33\2\2\u009e\u00a1\b\16\1\2\u009f"+
		"\u00a1\7\34\2\2\u00a0\u009d\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\u00a3\b\16\1\2\u00a3\u00a4\b\16\1\2\u00a4\33\3\2\2\2\u00a5"+
		"\u00a6\b\17\1\2\u00a6\u00a7\7\25\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9"+
		"\b\17\1\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab\b\17\1\2\u00ab\u00ac\5\24\13"+
		"\2\u00ac\u00b2\b\17\1\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\b\17\1\2\u00af"+
		"\u00b0\5\24\13\2\u00b0\u00b1\b\17\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\17\1\2"+
		"\u00b5\35\3\2\2\2\u00b6\u00b7\b\20\1\2\u00b7\u00b8\7\30\2\2\u00b8\u00b9"+
		"\5\16\b\2\u00b9\u00ba\b\20\1\2\u00ba\u00bb\7\27\2\2\u00bb\u00bc\b\20\1"+
		"\2\u00bc\u00bd\5\24\13\2\u00bd\u00be\b\20\1\2\u00be\37\3\2\2\2\u00bf\u00c1"+
		"\7\31\2\2\u00c0\u00c2\5\24\13\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2"+
		"\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\7\32\2\2\u00c6!\3\2\2\2\20/>CKP_gn\177\u0086\u008e\u00a0\u00b2\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}