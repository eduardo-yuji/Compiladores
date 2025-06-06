// Generated from GyhRepaginadoLanguage.g4 by ANTLR 4.7.2

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
		T__0=1, T__1=2, FimDelim=3, IniDelim=4, Atrib=5, OpRel=6, AbrePar=7, FechaPar=8, 
		OpBoolE=9, OpBoolOu=10, PCProg=11, PCDec=12, PCInt=13, PCReal=14, PCLer=15, 
		PCImprimir=16, PCSe=17, PCSenao=18, PCEntao=19, PCEnqto=20, PCIni=21, 
		PCFim=22, Var=23, Cadeia=24, NumInt=25, NumReal=26, WS=27, Comentario=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "FimDelim", "IniDelim", "Atrib", "OpRel", "AbrePar", 
			"FechaPar", "OpBoolE", "OpBoolOu", "PCProg", "PCDec", "PCInt", "PCReal", 
			"PCLer", "PCImprimir", "PCSe", "PCSenao", "PCEntao", "PCEnqto", "PCIni", 
			"PCFim", "Var", "Cadeia", "NumInt", "NumReal", "WS", "Comentario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'*'", "']'", "'['", "'<<'", null, "'('", "')'", "'and'", 
			"'or'", "'prog'", "'dec'", "'integer'", "'float'", "'read'", "'print'", 
			"'if'", "'else'", "'then'", "'while'", "'start'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FimDelim", "IniDelim", "Atrib", "OpRel", "AbrePar", 
			"FechaPar", "OpBoolE", "OpBoolOu", "PCProg", "PCDec", "PCInt", "PCReal", 
			"PCLer", "PCImprimir", "PCSe", "PCSenao", "PCEntao", "PCEnqto", "PCIni", 
			"PCFim", "Var", "Cadeia", "NumInt", "NumReal", "WS", "Comentario"
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
		
		private String _varCondicao;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00ca\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\7\30\u009e\n\30\f\30\16\30\u00a1\13\30\3\31\3\31\3\31\3\31"+
		"\7\31\u00a7\n\31\f\31\16\31\u00aa\13\31\3\31\3\31\3\32\6\32\u00af\n\32"+
		"\r\32\16\32\u00b0\3\33\6\33\u00b4\n\33\r\33\16\33\u00b5\3\33\3\33\6\33"+
		"\u00ba\n\33\r\33\16\33\u00bb\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u00c4"+
		"\n\35\f\35\16\35\u00c7\13\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\b\4\2>>@@\3\2C\\\5\2\62;"+
		"C\\c|\3\2\62;\4\2\13\f\"\"\3\2\f\f\2\u00d5\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2"+
		"\tA\3\2\2\2\13C\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2"+
		"\25Y\3\2\2\2\27\\\3\2\2\2\31a\3\2\2\2\33e\3\2\2\2\35m\3\2\2\2\37s\3\2"+
		"\2\2!x\3\2\2\2#~\3\2\2\2%\u0081\3\2\2\2\'\u0086\3\2\2\2)\u008b\3\2\2\2"+
		"+\u0091\3\2\2\2-\u0097\3\2\2\2/\u009b\3\2\2\2\61\u00a2\3\2\2\2\63\u00ae"+
		"\3\2\2\2\65\u00b3\3\2\2\2\67\u00bd\3\2\2\29\u00c1\3\2\2\2;<\7-\2\2<\4"+
		"\3\2\2\2=>\7,\2\2>\6\3\2\2\2?@\7_\2\2@\b\3\2\2\2AB\7]\2\2B\n\3\2\2\2C"+
		"D\7>\2\2DE\7>\2\2E\f\3\2\2\2FG\7@\2\2GP\7?\2\2HI\7>\2\2IP\7?\2\2JP\t\2"+
		"\2\2KL\7>\2\2LP\7@\2\2MN\7?\2\2NP\7?\2\2OF\3\2\2\2OH\3\2\2\2OJ\3\2\2\2"+
		"OK\3\2\2\2OM\3\2\2\2P\16\3\2\2\2QR\7*\2\2R\20\3\2\2\2ST\7+\2\2T\22\3\2"+
		"\2\2UV\7c\2\2VW\7p\2\2WX\7f\2\2X\24\3\2\2\2YZ\7q\2\2Z[\7t\2\2[\26\3\2"+
		"\2\2\\]\7r\2\2]^\7t\2\2^_\7q\2\2_`\7i\2\2`\30\3\2\2\2ab\7f\2\2bc\7g\2"+
		"\2cd\7e\2\2d\32\3\2\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2hi\7g\2\2ij\7i\2\2j"+
		"k\7g\2\2kl\7t\2\2l\34\3\2\2\2mn\7h\2\2no\7n\2\2op\7q\2\2pq\7c\2\2qr\7"+
		"v\2\2r\36\3\2\2\2st\7t\2\2tu\7g\2\2uv\7c\2\2vw\7f\2\2w \3\2\2\2xy\7r\2"+
		"\2yz\7t\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2}\"\3\2\2\2~\177\7k\2\2\177\u0080"+
		"\7h\2\2\u0080$\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7u\2\2\u0084\u0085\7g\2\2\u0085&\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088"+
		"\7j\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a(\3\2\2\2\u008b\u008c"+
		"\7y\2\2\u008c\u008d\7j\2\2\u008d\u008e\7k\2\2\u008e\u008f\7n\2\2\u008f"+
		"\u0090\7g\2\2\u0090*\3\2\2\2\u0091\u0092\7u\2\2\u0092\u0093\7v\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095\u0096\7v\2\2\u0096,\3\2\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\u009a\7f\2\2\u009a.\3\2\2\2\u009b"+
		"\u009f\t\3\2\2\u009c\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\60\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a8\7$\2\2\u00a3\u00a7\t\4\2\2\u00a4\u00a7\5\r\7\2\u00a5"+
		"\u00a7\5\13\6\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7$\2\2\u00ac\62\3\2\2\2"+
		"\u00ad\u00af\t\5\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\64\3\2\2\2\u00b2\u00b4\t\5\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\7\60\2\2\u00b8\u00ba\t\5\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\66\3\2\2\2\u00bd\u00be\t\6\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\b\34\2\2\u00c08\3\2\2\2\u00c1\u00c5\7%\2\2\u00c2\u00c4\n\7\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\b\35\2\2\u00c9"+
		":\3\2\2\2\f\2O\u009d\u009f\u00a6\u00a8\u00b0\u00b5\u00bb\u00c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}