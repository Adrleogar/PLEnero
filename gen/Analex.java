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
		HACER=21, ULTIMAPOSICION=22, VACIO=23, COMPARADORES=24, IGUAL=25, GUION=26, 
		COMA=27, PYC=28, CA=29, CC=30, LA=31, LC=32, DPS=33, PA=34, PC=35, COMENTARIO_BLOQUE=36, 
		COMENTARIO_LINEA=37, IDENTIFICADOR=38;
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
			"HACER", "ULTIMAPOSICION", "VACIO", "COMPARADORES", "IGUAL", "GUION", 
			"COMA", "PYC", "CA", "CC", "LA", "LC", "DPS", "PA", "PC", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA", "IDENTIFICADOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'PROGRAMA'", "'VARIABLES'", "'SUBPROGRAMAS'", 
			"'INSTRUCCIONES'", "'NUM'", null, "'SEQ'", "'*'", null, "'T'", "'F'", 
			"'si'", "'entonces'", "'sino'", "'fsi'", "'mientras'", "'fmientras'", 
			"'hacer'", "'ULTIMAPOSICION'", "'VACIO'", null, "'='", "'-'", "','", 
			"';'", "'['", "']'", "'{'", "'}'", "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "PROGRAMA", "VARIABLES", "SUBPROGRAMAS", 
			"INSTRUCCIONES", "NUM", "ENTERO", "SEQ", "OP_MULT", "OP_SR", "CIERTO", 
			"FALSO", "SI", "ENTONCES", "SINO", "FSI", "MIENTRAS", "FMIENTRAS", "HACER", 
			"ULTIMAPOSICION", "VACIO", "COMPARADORES", "IGUAL", "GUION", "COMA", 
			"PYC", "CA", "CC", "LA", "LC", "DPS", "PA", "PC", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA", "IDENTIFICADOR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0131\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\5\4]\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f\u009a"+
		"\n\f\r\f\16\f\u009b\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00fb"+
		"\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\5\'\u0115\n\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\7(\u0120\n(\f(\16(\u0123\13(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u012d\n)"+
		"\f)\16)\u0130\13)\3\u0121\2*\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25"+
		"\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30"+
		"\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(\3\2\6\3\2\62;\4"+
		"\2C\\c|\4\2--//\4\2>>@@\2\u013c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3"+
		"\2\2\2\5W\3\2\2\2\7\\\3\2\2\2\tb\3\2\2\2\13d\3\2\2\2\rf\3\2\2\2\17o\3"+
		"\2\2\2\21y\3\2\2\2\23\u0086\3\2\2\2\25\u0094\3\2\2\2\27\u0099\3\2\2\2"+
		"\31\u009d\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2\37\u00a5\3\2\2\2!"+
		"\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ac\3\2\2\2\'\u00b5\3\2\2\2)\u00ba\3"+
		"\2\2\2+\u00be\3\2\2\2-\u00c7\3\2\2\2/\u00d1\3\2\2\2\61\u00d7\3\2\2\2\63"+
		"\u00e6\3\2\2\2\65\u00fa\3\2\2\2\67\u00fc\3\2\2\29\u00fe\3\2\2\2;\u0100"+
		"\3\2\2\2=\u0102\3\2\2\2?\u0104\3\2\2\2A\u0106\3\2\2\2C\u0108\3\2\2\2E"+
		"\u010a\3\2\2\2G\u010c\3\2\2\2I\u010e\3\2\2\2K\u0110\3\2\2\2M\u0112\3\2"+
		"\2\2O\u011b\3\2\2\2Q\u0128\3\2\2\2ST\7\"\2\2TU\3\2\2\2UV\b\2\2\2V\4\3"+
		"\2\2\2WX\7\13\2\2XY\3\2\2\2YZ\b\3\2\2Z\6\3\2\2\2[]\7\17\2\2\\[\3\2\2\2"+
		"\\]\3\2\2\2]^\3\2\2\2^_\7\f\2\2_`\3\2\2\2`a\b\4\2\2a\b\3\2\2\2bc\t\2\2"+
		"\2c\n\3\2\2\2de\t\3\2\2e\f\3\2\2\2fg\7R\2\2gh\7T\2\2hi\7Q\2\2ij\7I\2\2"+
		"jk\7T\2\2kl\7C\2\2lm\7O\2\2mn\7C\2\2n\16\3\2\2\2op\7X\2\2pq\7C\2\2qr\7"+
		"T\2\2rs\7K\2\2st\7C\2\2tu\7D\2\2uv\7N\2\2vw\7G\2\2wx\7U\2\2x\20\3\2\2"+
		"\2yz\7U\2\2z{\7W\2\2{|\7D\2\2|}\7R\2\2}~\7T\2\2~\177\7Q\2\2\177\u0080"+
		"\7I\2\2\u0080\u0081\7T\2\2\u0081\u0082\7C\2\2\u0082\u0083\7O\2\2\u0083"+
		"\u0084\7C\2\2\u0084\u0085\7U\2\2\u0085\22\3\2\2\2\u0086\u0087\7K\2\2\u0087"+
		"\u0088\7P\2\2\u0088\u0089\7U\2\2\u0089\u008a\7V\2\2\u008a\u008b\7T\2\2"+
		"\u008b\u008c\7W\2\2\u008c\u008d\7E\2\2\u008d\u008e\7E\2\2\u008e\u008f"+
		"\7K\2\2\u008f\u0090\7Q\2\2\u0090\u0091\7P\2\2\u0091\u0092\7G\2\2\u0092"+
		"\u0093\7U\2\2\u0093\24\3\2\2\2\u0094\u0095\7P\2\2\u0095\u0096\7W\2\2\u0096"+
		"\u0097\7O\2\2\u0097\26\3\2\2\2\u0098\u009a\5\t\5\2\u0099\u0098\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\30"+
		"\3\2\2\2\u009d\u009e\7U\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7S\2\2\u00a0"+
		"\32\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\t\4\2\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a6\7V\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7H\2\2\u00a8"+
		"\"\3\2\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7k\2\2\u00ab$\3\2\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7q\2\2"+
		"\u00b0\u00b1\7p\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4"+
		"\7u\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8"+
		"\7p\2\2\u00b8\u00b9\7q\2\2\u00b9(\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc"+
		"\7u\2\2\u00bc\u00bd\7k\2\2\u00bd*\3\2\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7u\2\2\u00c6,\3\2\2\2\u00c7"+
		"\u00c8\7h\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb\u00cc\7p\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00d0\7u\2\2\u00d0.\3\2\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3"+
		"\7c\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7t\2\2\u00d6"+
		"\60\3\2\2\2\u00d7\u00d8\7W\2\2\u00d8\u00d9\7N\2\2\u00d9\u00da\7V\2\2\u00da"+
		"\u00db\7K\2\2\u00db\u00dc\7O\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de\7R\2\2"+
		"\u00de\u00df\7Q\2\2\u00df\u00e0\7U\2\2\u00e0\u00e1\7K\2\2\u00e1\u00e2"+
		"\7E\2\2\u00e2\u00e3\7K\2\2\u00e3\u00e4\7Q\2\2\u00e4\u00e5\7P\2\2\u00e5"+
		"\62\3\2\2\2\u00e6\u00e7\7X\2\2\u00e7\u00e8\7C\2\2\u00e8\u00e9\7E\2\2\u00e9"+
		"\u00ea\7K\2\2\u00ea\u00eb\7Q\2\2\u00eb\64\3\2\2\2\u00ec\u00fb\t\5\2\2"+
		"\u00ed\u00ee\7@\2\2\u00ee\u00fb\7?\2\2\u00ef\u00f0\7>\2\2\u00f0\u00fb"+
		"\7?\2\2\u00f1\u00f2\7?\2\2\u00f2\u00fb\7?\2\2\u00f3\u00f4\7#\2\2\u00f4"+
		"\u00fb\7?\2\2\u00f5\u00f6\7(\2\2\u00f6\u00fb\7(\2\2\u00f7\u00f8\7~\2\2"+
		"\u00f8\u00fb\7~\2\2\u00f9\u00fb\7#\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00ed"+
		"\3\2\2\2\u00fa\u00ef\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa"+
		"\u00f5\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\66\3\2\2"+
		"\2\u00fc\u00fd\7?\2\2\u00fd8\3\2\2\2\u00fe\u00ff\7/\2\2\u00ff:\3\2\2\2"+
		"\u0100\u0101\7.\2\2\u0101<\3\2\2\2\u0102\u0103\7=\2\2\u0103>\3\2\2\2\u0104"+
		"\u0105\7]\2\2\u0105@\3\2\2\2\u0106\u0107\7_\2\2\u0107B\3\2\2\2\u0108\u0109"+
		"\7}\2\2\u0109D\3\2\2\2\u010a\u010b\7\177\2\2\u010bF\3\2\2\2\u010c\u010d"+
		"\7<\2\2\u010dH\3\2\2\2\u010e\u010f\7*\2\2\u010fJ\3\2\2\2\u0110\u0111\7"+
		"+\2\2\u0111L\3\2\2\2\u0112\u0114\7\61\2\2\u0113\u0115\13\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7,\2\2\u0117"+
		"\u0118\7\61\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b\'\2\2\u011aN\3\2\2\2"+
		"\u011b\u011c\7\61\2\2\u011c\u011d\7\61\2\2\u011d\u0121\3\2\2\2\u011e\u0120"+
		"\13\2\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125"+
		"\5\7\4\2\u0125\u0126\3\2\2\2\u0126\u0127\b(\2\2\u0127P\3\2\2\2\u0128\u012e"+
		"\5\13\6\2\u0129\u012d\5\13\6\2\u012a\u012d\5\t\5\2\u012b\u012d\7a\2\2"+
		"\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0130"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012fR\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\n\2\\\u009b\u00fa\u0114\u0121\u012c\u012e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}