// Generated from .\GyhRepaginadoLanguage.g4 by ANTLR 4.7.2

    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GyhRepaginadoLanguageLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FimDelim", "IniDelim", "AbrePar", "FechaPar", "OpAritMult", "OpAritDiv", 
			"OpAritSoma", "OpAritSub", "Atrib", "OpRel", "OpBoolE", "OpBoolOu", "PCProg", 
			"PCDec", "PCInt", "PCReal", "PCLer", "PCImprimir", "PCSe", "PCSenao", 
			"PCEntao", "PCEnqto", "PCIni", "PCFim", "Var", "Cadeia", "NumInt", "NumReal", 
			"WS", "Comentario"
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


	    private String _nomeVar; 
	    private String _tipoVar;
	    private String _valorVar;
	    private Simbolo _simboloVar;
	    
	    private String _expVar;
	    private String _varExpressao;

	    private String _varCondicao;
	    private ArrayList<Comando> _cmdIf = new ArrayList<Comando>();
	    private ArrayList<Comando> _cmdElse = new ArrayList<Comando>();
	    private ArrayList<Comando> _cmdRep = new ArrayList<Comando>();
	    

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


	public GyhRepaginadoLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GyhRepaginadoLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00d2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\\\n\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\7\32\u00a6\n\32"+
		"\f\32\16\32\u00a9\13\32\3\33\3\33\3\33\3\33\7\33\u00af\n\33\f\33\16\33"+
		"\u00b2\13\33\3\33\3\33\3\34\6\34\u00b7\n\34\r\34\16\34\u00b8\3\35\6\35"+
		"\u00bc\n\35\r\35\16\35\u00bd\3\35\3\35\6\35\u00c2\n\35\r\35\16\35\u00c3"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u00cc\n\37\f\37\16\37\u00cf\13\37"+
		"\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= \3\2\b\4\2>>@@\3\2C\\\5\2\62;C\\c|\3\2\62;\4\2\13\f"+
		"\"\"\3\2\f\f\2\u00dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2"+
		"\tE\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2"+
		"\25[\3\2\2\2\27]\3\2\2\2\31a\3\2\2\2\33d\3\2\2\2\35i\3\2\2\2\37m\3\2\2"+
		"\2!u\3\2\2\2#{\3\2\2\2%\u0080\3\2\2\2\'\u0086\3\2\2\2)\u0089\3\2\2\2+"+
		"\u008e\3\2\2\2-\u0093\3\2\2\2/\u0099\3\2\2\2\61\u009f\3\2\2\2\63\u00a3"+
		"\3\2\2\2\65\u00aa\3\2\2\2\67\u00b6\3\2\2\29\u00bb\3\2\2\2;\u00c5\3\2\2"+
		"\2=\u00c9\3\2\2\2?@\7_\2\2@\4\3\2\2\2AB\7]\2\2B\6\3\2\2\2CD\7*\2\2D\b"+
		"\3\2\2\2EF\7+\2\2F\n\3\2\2\2GH\7,\2\2H\f\3\2\2\2IJ\7\61\2\2J\16\3\2\2"+
		"\2KL\7-\2\2L\20\3\2\2\2MN\7/\2\2N\22\3\2\2\2OP\7>\2\2PQ\7>\2\2Q\24\3\2"+
		"\2\2RS\7@\2\2S\\\7?\2\2TU\7>\2\2U\\\7?\2\2VW\7>\2\2W\\\7@\2\2XY\7?\2\2"+
		"Y\\\7?\2\2Z\\\t\2\2\2[R\3\2\2\2[T\3\2\2\2[V\3\2\2\2[X\3\2\2\2[Z\3\2\2"+
		"\2\\\26\3\2\2\2]^\7c\2\2^_\7p\2\2_`\7f\2\2`\30\3\2\2\2ab\7q\2\2bc\7t\2"+
		"\2c\32\3\2\2\2de\7r\2\2ef\7t\2\2fg\7q\2\2gh\7i\2\2h\34\3\2\2\2ij\7f\2"+
		"\2jk\7g\2\2kl\7e\2\2l\36\3\2\2\2mn\7k\2\2no\7p\2\2op\7v\2\2pq\7g\2\2q"+
		"r\7i\2\2rs\7g\2\2st\7t\2\2t \3\2\2\2uv\7h\2\2vw\7n\2\2wx\7q\2\2xy\7c\2"+
		"\2yz\7v\2\2z\"\3\2\2\2{|\7t\2\2|}\7g\2\2}~\7c\2\2~\177\7f\2\2\177$\3\2"+
		"\2\2\u0080\u0081\7r\2\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7v\2\2\u0085&\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088"+
		"\7h\2\2\u0088(\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c"+
		"\7u\2\2\u008c\u008d\7g\2\2\u008d*\3\2\2\2\u008e\u008f\7v\2\2\u008f\u0090"+
		"\7j\2\2\u0090\u0091\7g\2\2\u0091\u0092\7p\2\2\u0092,\3\2\2\2\u0093\u0094"+
		"\7y\2\2\u0094\u0095\7j\2\2\u0095\u0096\7k\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7g\2\2\u0098.\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7t\2\2\u009d\u009e\7v\2\2\u009e\60\3\2\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7f\2\2\u00a2\62\3\2\2\2\u00a3"+
		"\u00a7\t\3\2\2\u00a4\u00a6\t\4\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\64\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00b0\7$\2\2\u00ab\u00af\t\4\2\2\u00ac\u00af\5\25\13\2"+
		"\u00ad\u00af\5\23\n\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4\66\3\2\2\2"+
		"\u00b5\u00b7\t\5\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b98\3\2\2\2\u00ba\u00bc\t\5\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\7\60\2\2\u00c0\u00c2\t\5\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4:\3\2\2\2\u00c5\u00c6\t\6\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\b\36\2\2\u00c8<\3\2\2\2\u00c9\u00cd\7%\2\2\u00ca\u00cc\n\7\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\b\37\2\2\u00d1"+
		">\3\2\2\2\f\2[\u00a5\u00a7\u00ae\u00b0\u00b8\u00bd\u00c3\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}