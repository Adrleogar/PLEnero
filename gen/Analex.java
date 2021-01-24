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
		COMA=27, PYC=28, CA=29, CC=30, LA=31, LC=32, DPS=33, PA=34, PC=35, RUPTURA=36, 
		COMENTARIO_BLOQUE=37, COMENTARIO_LINEA=38, IDENTIFICADOR=39;
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
			"COMA", "PYC", "CA", "CC", "LA", "LC", "DPS", "PA", "PC", "RUPTURA", 
			"COMENTARIO_BLOQUE", "COMENTARIO_LINEA", "IDENTIFICADOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'PROGRAMA'", "'VARIABLES'", "'SUBPROGRAMAS'", 
			"'INSTRUCCIONES'", "'NUM'", null, "'SEQ'", "'*'", null, "'T'", "'F'", 
			"'si'", "'entonces'", "'sino'", "'fsi'", "'mientras'", "'fmientras'", 
			"'hacer'", "'ULTIMAPOSICION'", "'VACIO'", null, "'='", "'-'", "','", 
			"';'", "'['", "']'", "'{'", "'}'", "':'", "'('", "')'", "'RUPTURA'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "PROGRAMA", "VARIABLES", "SUBPROGRAMAS", 
			"INSTRUCCIONES", "NUM", "ENTERO", "SEQ", "OP_MULT", "OP_SR", "CIERTO", 
			"FALSO", "SI", "ENTONCES", "SINO", "FSI", "MIENTRAS", "FMIENTRAS", "HACER", 
			"ULTIMAPOSICION", "VACIO", "COMPARADORES", "IGUAL", "GUION", "COMA", 
			"PYC", "CA", "CC", "LA", "LC", "DPS", "PA", "PC", "RUPTURA", "COMENTARIO_BLOQUE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u013b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4_\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6"+
		"\f\u009c\n\f\r\f\16\f\u009d\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u00fd\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\5("+
		"\u011f\n(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u012a\n)\f)\16)\u012d\13)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\7*\u0137\n*\f*\16*\u013a\13*\3\u012b\2+\3\3\5\4\7"+
		"\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21"+
		"%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!"+
		"E\"G#I$K%M&O\'Q(S)\3\2\6\3\2\62;\4\2C\\c|\4\2--//\4\2>>@@\2\u0146\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5Y\3\2\2\2\7^\3\2\2"+
		"\2\td\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2\17q\3\2\2\2\21{\3\2\2\2\23\u0088"+
		"\3\2\2\2\25\u0096\3\2\2\2\27\u009b\3\2\2\2\31\u009f\3\2\2\2\33\u00a3\3"+
		"\2\2\2\35\u00a5\3\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2#\u00ab\3\2\2\2"+
		"%\u00ae\3\2\2\2\'\u00b7\3\2\2\2)\u00bc\3\2\2\2+\u00c0\3\2\2\2-\u00c9\3"+
		"\2\2\2/\u00d3\3\2\2\2\61\u00d9\3\2\2\2\63\u00e8\3\2\2\2\65\u00fc\3\2\2"+
		"\2\67\u00fe\3\2\2\29\u0100\3\2\2\2;\u0102\3\2\2\2=\u0104\3\2\2\2?\u0106"+
		"\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E\u010c\3\2\2\2G\u010e\3\2\2\2I"+
		"\u0110\3\2\2\2K\u0112\3\2\2\2M\u0114\3\2\2\2O\u011c\3\2\2\2Q\u0125\3\2"+
		"\2\2S\u0132\3\2\2\2UV\7\"\2\2VW\3\2\2\2WX\b\2\2\2X\4\3\2\2\2YZ\7\13\2"+
		"\2Z[\3\2\2\2[\\\b\3\2\2\\\6\3\2\2\2]_\7\17\2\2^]\3\2\2\2^_\3\2\2\2_`\3"+
		"\2\2\2`a\7\f\2\2ab\3\2\2\2bc\b\4\2\2c\b\3\2\2\2de\t\2\2\2e\n\3\2\2\2f"+
		"g\t\3\2\2g\f\3\2\2\2hi\7R\2\2ij\7T\2\2jk\7Q\2\2kl\7I\2\2lm\7T\2\2mn\7"+
		"C\2\2no\7O\2\2op\7C\2\2p\16\3\2\2\2qr\7X\2\2rs\7C\2\2st\7T\2\2tu\7K\2"+
		"\2uv\7C\2\2vw\7D\2\2wx\7N\2\2xy\7G\2\2yz\7U\2\2z\20\3\2\2\2{|\7U\2\2|"+
		"}\7W\2\2}~\7D\2\2~\177\7R\2\2\177\u0080\7T\2\2\u0080\u0081\7Q\2\2\u0081"+
		"\u0082\7I\2\2\u0082\u0083\7T\2\2\u0083\u0084\7C\2\2\u0084\u0085\7O\2\2"+
		"\u0085\u0086\7C\2\2\u0086\u0087\7U\2\2\u0087\22\3\2\2\2\u0088\u0089\7"+
		"K\2\2\u0089\u008a\7P\2\2\u008a\u008b\7U\2\2\u008b\u008c\7V\2\2\u008c\u008d"+
		"\7T\2\2\u008d\u008e\7W\2\2\u008e\u008f\7E\2\2\u008f\u0090\7E\2\2\u0090"+
		"\u0091\7K\2\2\u0091\u0092\7Q\2\2\u0092\u0093\7P\2\2\u0093\u0094\7G\2\2"+
		"\u0094\u0095\7U\2\2\u0095\24\3\2\2\2\u0096\u0097\7P\2\2\u0097\u0098\7"+
		"W\2\2\u0098\u0099\7O\2\2\u0099\26\3\2\2\2\u009a\u009c\5\t\5\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\30\3\2\2\2\u009f\u00a0\7U\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7S\2\2\u00a2"+
		"\32\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\t\4\2\2\u00a6"+
		"\36\3\2\2\2\u00a7\u00a8\7V\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7H\2\2\u00aa"+
		"\"\3\2\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7k\2\2\u00ad$\3\2\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7q\2\2"+
		"\u00b2\u00b3\7p\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6"+
		"\7u\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7p\2\2\u00ba\u00bb\7q\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be"+
		"\7u\2\2\u00be\u00bf\7k\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7u\2\2\u00c8,\3\2\2\2\u00c9"+
		"\u00ca\7h\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1"+
		"\7c\2\2\u00d1\u00d2\7u\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5"+
		"\7c\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7t\2\2\u00d8"+
		"\60\3\2\2\2\u00d9\u00da\7W\2\2\u00da\u00db\7N\2\2\u00db\u00dc\7V\2\2\u00dc"+
		"\u00dd\7K\2\2\u00dd\u00de\7O\2\2\u00de\u00df\7C\2\2\u00df\u00e0\7R\2\2"+
		"\u00e0\u00e1\7Q\2\2\u00e1\u00e2\7U\2\2\u00e2\u00e3\7K\2\2\u00e3\u00e4"+
		"\7E\2\2\u00e4\u00e5\7K\2\2\u00e5\u00e6\7Q\2\2\u00e6\u00e7\7P\2\2\u00e7"+
		"\62\3\2\2\2\u00e8\u00e9\7X\2\2\u00e9\u00ea\7C\2\2\u00ea\u00eb\7E\2\2\u00eb"+
		"\u00ec\7K\2\2\u00ec\u00ed\7Q\2\2\u00ed\64\3\2\2\2\u00ee\u00fd\t\5\2\2"+
		"\u00ef\u00f0\7@\2\2\u00f0\u00fd\7?\2\2\u00f1\u00f2\7>\2\2\u00f2\u00fd"+
		"\7?\2\2\u00f3\u00f4\7?\2\2\u00f4\u00fd\7?\2\2\u00f5\u00f6\7#\2\2\u00f6"+
		"\u00fd\7?\2\2\u00f7\u00f8\7(\2\2\u00f8\u00fd\7(\2\2\u00f9\u00fa\7~\2\2"+
		"\u00fa\u00fd\7~\2\2\u00fb\u00fd\7#\2\2\u00fc\u00ee\3\2\2\2\u00fc\u00ef"+
		"\3\2\2\2\u00fc\u00f1\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc"+
		"\u00f7\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\66\3\2\2"+
		"\2\u00fe\u00ff\7?\2\2\u00ff8\3\2\2\2\u0100\u0101\7/\2\2\u0101:\3\2\2\2"+
		"\u0102\u0103\7.\2\2\u0103<\3\2\2\2\u0104\u0105\7=\2\2\u0105>\3\2\2\2\u0106"+
		"\u0107\7]\2\2\u0107@\3\2\2\2\u0108\u0109\7_\2\2\u0109B\3\2\2\2\u010a\u010b"+
		"\7}\2\2\u010bD\3\2\2\2\u010c\u010d\7\177\2\2\u010dF\3\2\2\2\u010e\u010f"+
		"\7<\2\2\u010fH\3\2\2\2\u0110\u0111\7*\2\2\u0111J\3\2\2\2\u0112\u0113\7"+
		"+\2\2\u0113L\3\2\2\2\u0114\u0115\7T\2\2\u0115\u0116\7W\2\2\u0116\u0117"+
		"\7R\2\2\u0117\u0118\7V\2\2\u0118\u0119\7W\2\2\u0119\u011a\7T\2\2\u011a"+
		"\u011b\7C\2\2\u011bN\3\2\2\2\u011c\u011e\7\61\2\2\u011d\u011f\13\2\2\2"+
		"\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\7,\2\2\u0121\u0122\7\61\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b(\2\2\u0124"+
		"P\3\2\2\2\u0125\u0126\7\61\2\2\u0126\u0127\7\61\2\2\u0127\u012b\3\2\2"+
		"\2\u0128\u012a\13\2\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012e\u012f\5\7\4\2\u012f\u0130\3\2\2\2\u0130\u0131\b)\2\2\u0131"+
		"R\3\2\2\2\u0132\u0138\5\13\6\2\u0133\u0137\5\13\6\2\u0134\u0137\5\t\5"+
		"\2\u0135\u0137\7a\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"T\3\2\2\2\u013a\u0138\3\2\2\2\n\2^\u009d\u00fc\u011e\u012b\u0136\u0138"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}