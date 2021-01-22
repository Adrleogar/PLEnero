// Generated from C:/Users/adria/IdeaProjects/apoyoPL/src\Analex.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, PROGRAMA=4, VARIABLES=5, SUBPROGRAMAS=6, 
		INSTRUCCIONES=7, NUM=8, ENTERO=9, SEQ=10, OP_MULT=11, OP_SR=12, CIERTO=13, 
		FALSO=14, SI=15, ENTONCES=16, SINO=17, FSI=18, MIENTRAS=19, FMIENTRAS=20, 
		HACER=21, COMPARADORES=22, IGUAL=23, GUION=24, COMA=25, PYC=26, CA=27, 
		CC=28, LA=29, LC=30, DPS=31, PA=32, PC=33, COMENTARIO_BLOQUE=34, COMENTARIO_LINEA=35, 
		IDENTIFICADOR=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "PROGRAMA", "VARIABLES", 
			"SUBPROGRAMAS", "INSTRUCCIONES", "NUM", "ENTERO", "SEQ", "OP_MULT", "OP_SR", 
			"CIERTO", "FALSO", "SI", "ENTONCES", "SINO", "FSI", "MIENTRAS", "FMIENTRAS", 
			"HACER", "COMPARADORES", "IGUAL", "GUION", "COMA", "PYC", "CA", "CC", 
			"LA", "LC", "DPS", "PA", "PC", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA", 
			"IDENTIFICADOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'PROGRAMA'", "'VARIABLES'", "'SUBPROGRAMAS'", 
			"'INSTRUCCIONES'", "'NUM'", null, "'SEQ'", "'*'", null, "'T'", "'F'", 
			"'si'", "'entonces'", "'sino'", "'fsi'", "'mientras'", "'fmientras'", 
			"'hacer'", null, "'='", "'-'", "','", "';'", "'['", "']'", "'{'", "'}'", 
			"':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "PROGRAMA", "VARIABLES", "SUBPROGRAMAS", 
			"INSTRUCCIONES", "NUM", "ENTERO", "SEQ", "OP_MULT", "OP_SR", "CIERTO", 
			"FALSO", "SI", "ENTONCES", "SINO", "FSI", "MIENTRAS", "FMIENTRAS", "HACER", 
			"COMPARADORES", "IGUAL", "GUION", "COMA", "PYC", "CA", "CC", "LA", "LC", 
			"DPS", "PA", "PC", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA", "IDENTIFICADOR"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0113\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\5\4Y\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f\u0096\n\f\r\f\16"+
		"\f\u0097\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00dd"+
		"\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\5%\u00f7\n%\3%\3%\3%\3%\3%\3&\3&\3&"+
		"\3&\7&\u0102\n&\f&\16&\u0105\13&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u010f"+
		"\n\'\f\'\16\'\u0112\13\'\3\u0103\2(\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b"+
		"\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27"+
		"\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&\3\2\6\3\2\62;"+
		"\4\2C\\c|\4\2--//\4\2>>@@\2\u011b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5S\3\2\2\2\7X"+
		"\3\2\2\2\t^\3\2\2\2\13`\3\2\2\2\rb\3\2\2\2\17k\3\2\2\2\21u\3\2\2\2\23"+
		"\u0082\3\2\2\2\25\u0090\3\2\2\2\27\u0095\3\2\2\2\31\u0099\3\2\2\2\33\u009d"+
		"\3\2\2\2\35\u009f\3\2\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2"+
		"\2%\u00a8\3\2\2\2\'\u00b1\3\2\2\2)\u00b6\3\2\2\2+\u00ba\3\2\2\2-\u00c3"+
		"\3\2\2\2/\u00cd\3\2\2\2\61\u00dc\3\2\2\2\63\u00de\3\2\2\2\65\u00e0\3\2"+
		"\2\2\67\u00e2\3\2\2\29\u00e4\3\2\2\2;\u00e6\3\2\2\2=\u00e8\3\2\2\2?\u00ea"+
		"\3\2\2\2A\u00ec\3\2\2\2C\u00ee\3\2\2\2E\u00f0\3\2\2\2G\u00f2\3\2\2\2I"+
		"\u00f4\3\2\2\2K\u00fd\3\2\2\2M\u010a\3\2\2\2OP\7\"\2\2PQ\3\2\2\2QR\b\2"+
		"\2\2R\4\3\2\2\2ST\7\13\2\2TU\3\2\2\2UV\b\3\2\2V\6\3\2\2\2WY\7\17\2\2X"+
		"W\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\f\2\2[\\\3\2\2\2\\]\b\4\2\2]\b\3\2\2"+
		"\2^_\t\2\2\2_\n\3\2\2\2`a\t\3\2\2a\f\3\2\2\2bc\7R\2\2cd\7T\2\2de\7Q\2"+
		"\2ef\7I\2\2fg\7T\2\2gh\7C\2\2hi\7O\2\2ij\7C\2\2j\16\3\2\2\2kl\7X\2\2l"+
		"m\7C\2\2mn\7T\2\2no\7K\2\2op\7C\2\2pq\7D\2\2qr\7N\2\2rs\7G\2\2st\7U\2"+
		"\2t\20\3\2\2\2uv\7U\2\2vw\7W\2\2wx\7D\2\2xy\7R\2\2yz\7T\2\2z{\7Q\2\2{"+
		"|\7I\2\2|}\7T\2\2}~\7C\2\2~\177\7O\2\2\177\u0080\7C\2\2\u0080\u0081\7"+
		"U\2\2\u0081\22\3\2\2\2\u0082\u0083\7K\2\2\u0083\u0084\7P\2\2\u0084\u0085"+
		"\7U\2\2\u0085\u0086\7V\2\2\u0086\u0087\7T\2\2\u0087\u0088\7W\2\2\u0088"+
		"\u0089\7E\2\2\u0089\u008a\7E\2\2\u008a\u008b\7K\2\2\u008b\u008c\7Q\2\2"+
		"\u008c\u008d\7P\2\2\u008d\u008e\7G\2\2\u008e\u008f\7U\2\2\u008f\24\3\2"+
		"\2\2\u0090\u0091\7P\2\2\u0091\u0092\7W\2\2\u0092\u0093\7O\2\2\u0093\26"+
		"\3\2\2\2\u0094\u0096\5\t\5\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\30\3\2\2\2\u0099\u009a\7U\2\2"+
		"\u009a\u009b\7G\2\2\u009b\u009c\7S\2\2\u009c\32\3\2\2\2\u009d\u009e\7"+
		",\2\2\u009e\34\3\2\2\2\u009f\u00a0\t\4\2\2\u00a0\36\3\2\2\2\u00a1\u00a2"+
		"\7V\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7H\2\2\u00a4\"\3\2\2\2\u00a5\u00a6"+
		"\7u\2\2\u00a6\u00a7\7k\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa"+
		"\7p\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\u00ae\7e\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7u\2\2\u00b0&\3\2\2\2\u00b1"+
		"\u00b2\7u\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7q\2\2"+
		"\u00b5(\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7k\2"+
		"\2\u00b9*\3\2\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7"+
		"g\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7c\2\2\u00c1\u00c2\7u\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7o\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7p\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7u\2\2"+
		"\u00cc.\3\2\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7e\2"+
		"\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7t\2\2\u00d2\60\3\2\2\2\u00d3\u00dd"+
		"\t\5\2\2\u00d4\u00d5\7@\2\2\u00d5\u00dd\7?\2\2\u00d6\u00d7\7>\2\2\u00d7"+
		"\u00dd\7?\2\2\u00d8\u00d9\7?\2\2\u00d9\u00dd\7?\2\2\u00da\u00db\7#\2\2"+
		"\u00db\u00dd\7?\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d6"+
		"\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\62\3\2\2\2\u00de"+
		"\u00df\7?\2\2\u00df\64\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1\66\3\2\2\2\u00e2"+
		"\u00e3\7.\2\2\u00e38\3\2\2\2\u00e4\u00e5\7=\2\2\u00e5:\3\2\2\2\u00e6\u00e7"+
		"\7]\2\2\u00e7<\3\2\2\2\u00e8\u00e9\7_\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7"+
		"}\2\2\u00eb@\3\2\2\2\u00ec\u00ed\7\177\2\2\u00edB\3\2\2\2\u00ee\u00ef"+
		"\7<\2\2\u00efD\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1F\3\2\2\2\u00f2\u00f3\7"+
		"+\2\2\u00f3H\3\2\2\2\u00f4\u00f6\7\61\2\2\u00f5\u00f7\13\2\2\2\u00f6\u00f5"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9"+
		"\u00fa\7\61\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b%\2\2\u00fcJ\3\2\2\2"+
		"\u00fd\u00fe\7\61\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0103\3\2\2\2\u0100\u0102"+
		"\13\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0104\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107"+
		"\5\7\4\2\u0107\u0108\3\2\2\2\u0108\u0109\b&\2\2\u0109L\3\2\2\2\u010a\u0110"+
		"\5\13\6\2\u010b\u010f\5\13\6\2\u010c\u010f\5\t\5\2\u010d\u010f\7a\2\2"+
		"\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111N\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\n\2X\u0097\u00dc\u00f6\u0103\u010e\u0110\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}