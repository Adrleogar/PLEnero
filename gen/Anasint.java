// Generated from C:/Users/adria/IdeaProjects/apoyoPL/src\Anasint.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Anasint extends Parser {
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
		IDENTIFICADOR=36, RUPTURA=37;
	public static final int
		RULE_sentencia = 0, RULE_variables = 1, RULE_declaraciones = 2, RULE_instrucciones = 3, 
		RULE_operacion = 4, RULE_operaciones = 5, RULE_secuencia = 6, RULE_expr = 7, 
		RULE_exprs = 8, RULE_asignacion = 9, RULE_condicional = 10, RULE_expr_bool = 11, 
		RULE_iteracion = 12, RULE_ruptura = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentencia", "variables", "declaraciones", "instrucciones", "operacion", 
			"operaciones", "secuencia", "expr", "exprs", "asignacion", "condicional", 
			"expr_bool", "iteracion", "ruptura"
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
			"DPS", "PA", "PC", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA", "IDENTIFICADOR", 
			"RUPTURA"
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
	public String getGrammarFileName() { return "Anasint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Anasint(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SentenciaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(Anasint.PROGRAMA, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode SUBPROGRAMAS() { return getToken(Anasint.SUBPROGRAMAS, 0); }
		public TerminalNode INSTRUCCIONES() { return getToken(Anasint.INSTRUCCIONES, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Anasint.EOF, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(PROGRAMA);
			setState(29);
			variables();
			setState(30);
			match(SUBPROGRAMAS);
			setState(31);
			match(INSTRUCCIONES);
			setState(32);
			instrucciones();
			setState(33);
			match(EOF);
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VARIABLES() { return getToken(Anasint.VARIABLES, 0); }
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(VARIABLES);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR) {
				{
				{
				setState(36);
				declaraciones();
				}
				}
				setState(41);
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(Anasint.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(Anasint.IDENTIFICADOR, i);
		}
		public TerminalNode DPS() { return getToken(Anasint.DPS, 0); }
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
		public TerminalNode SEQ() { return getToken(Anasint.SEQ, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(IDENTIFICADOR);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(43);
				match(COMA);
				setState(44);
				match(IDENTIFICADOR);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(DPS);
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(51);
				match(NUM);
				}
				break;
			case SEQ:
				{
				setState(52);
				match(SEQ);
				setState(53);
				match(PA);
				setState(54);
				match(NUM);
				setState(55);
				match(PC);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<TerminalNode> PC() { return getTokens(Anasint.PC); }
		public TerminalNode PC(int i) {
			return getToken(Anasint.PC, i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public List<IteracionContext> iteracion() {
			return getRuleContexts(IteracionContext.class);
		}
		public IteracionContext iteracion(int i) {
			return getRuleContext(IteracionContext.class,i);
		}
		public List<RupturaContext> ruptura() {
			return getRuleContexts(RupturaContext.class);
		}
		public RupturaContext ruptura(int i) {
			return getRuleContext(RupturaContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << SI) | (1L << MIENTRAS) | (1L << IDENTIFICADOR) | (1L << RUPTURA))) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(58);
					operacion();
					setState(59);
					match(PC);
					}
					break;
				case 2:
					{
					setState(61);
					asignacion();
					setState(62);
					match(PC);
					}
					break;
				case 3:
					{
					setState(64);
					condicional();
					setState(65);
					match(PC);
					}
					break;
				case 4:
					{
					setState(67);
					iteracion();
					setState(68);
					match(PC);
					}
					break;
				case 5:
					{
					setState(70);
					ruptura();
					setState(71);
					match(PC);
					}
					break;
				}
				}
				setState(77);
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

	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode OP_SR() { return getToken(Anasint.OP_SR, 0); }
		public TerminalNode ENTERO() { return getToken(Anasint.ENTERO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(Anasint.IDENTIFICADOR, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode OP_MULT() { return getToken(Anasint.OP_MULT, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operacion);
		int _la;
		try {
			int _alt;
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				_la = _input.LA(1);
				if ( !(_la==ENTERO || _la==IDENTIFICADOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(79);
				match(OP_SR);
				setState(81); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(80);
						operacion();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(83); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==ENTERO || _la==IDENTIFICADOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(86);
				match(OP_MULT);
				setState(88); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						operacion();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(90); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==ENTERO || _la==IDENTIFICADOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class OperacionesContext extends ParserRuleContext {
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			operacion();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(96);
				match(COMA);
				setState(97);
				operacion();
				}
				}
				setState(102);
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

	public static class SecuenciaContext extends ParserRuleContext {
		public TerminalNode CA() { return getToken(Anasint.CA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode CC() { return getToken(Anasint.CC, 0); }
		public SecuenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secuencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSecuencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSecuencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSecuencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecuenciaContext secuencia() throws RecognitionException {
		SecuenciaContext _localctx = new SecuenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_secuencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(CA);
			setState(104);
			operaciones();
			setState(105);
			match(CC);
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

	public static class ExprContext extends ParserRuleContext {
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public SecuenciaContext secuencia() {
			return getRuleContext(SecuenciaContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				operacion();
				}
				break;
			case CA:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				secuencia();
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			expr();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(112);
				match(COMA);
				setState(113);
				expr();
				}
				}
				setState(118);
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

	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(Anasint.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(Anasint.IDENTIFICADOR, i);
		}
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENTIFICADOR);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(120);
				match(COMA);
				setState(121);
				match(IDENTIFICADOR);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(IGUAL);
			{
			setState(128);
			exprs();
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(Anasint.SI, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public TerminalNode ENTONCES() { return getToken(Anasint.ENTONCES, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public TerminalNode FSI() { return getToken(Anasint.FSI, 0); }
		public TerminalNode SINO() { return getToken(Anasint.SINO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(SI);
			setState(131);
			match(PA);
			setState(132);
			expr_bool();
			setState(133);
			match(PC);
			setState(134);
			match(ENTONCES);
			setState(135);
			instrucciones();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(136);
				match(SINO);
				setState(137);
				instrucciones();
				}
			}

			setState(140);
			match(FSI);
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

	public static class Expr_boolContext extends ParserRuleContext {
		public TerminalNode CIERTO() { return getToken(Anasint.CIERTO, 0); }
		public TerminalNode FALSO() { return getToken(Anasint.FALSO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARADORES() { return getToken(Anasint.COMPARADORES, 0); }
		public Expr_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpr_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpr_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpr_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_boolContext expr_bool() throws RecognitionException {
		Expr_boolContext _localctx = new Expr_boolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_bool);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CIERTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(CIERTO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(FALSO);
				}
				break;
			case ENTERO:
			case CA:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				expr();
				setState(145);
				match(COMPARADORES);
				setState(146);
				expr();
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

	public static class IteracionContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(Anasint.MIENTRAS, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public TerminalNode HACER() { return getToken(Anasint.HACER, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode FMIENTRAS() { return getToken(Anasint.FMIENTRAS, 0); }
		public IteracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterIteracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitIteracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitIteracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteracionContext iteracion() throws RecognitionException {
		IteracionContext _localctx = new IteracionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iteracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(MIENTRAS);
			setState(151);
			match(PA);
			setState(152);
			expr_bool();
			setState(153);
			match(PC);
			setState(154);
			match(HACER);
			setState(155);
			instrucciones();
			setState(156);
			match(FMIENTRAS);
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

	public static class RupturaContext extends ParserRuleContext {
		public TerminalNode RUPTURA() { return getToken(Anasint.RUPTURA, 0); }
		public RupturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruptura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRuptura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRuptura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRuptura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RupturaContext ruptura() throws RecognitionException {
		RupturaContext _localctx = new RupturaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ruptura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(RUPTURA);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\6\3\6\3\6\6\6T\n\6"+
		"\r\6\16\6U\3\6\3\6\3\6\6\6[\n\6\r\6\16\6\\\3\6\5\6`\n\6\3\7\3\7\3\7\7"+
		"\7e\n\7\f\7\16\7h\13\7\3\b\3\b\3\b\3\b\3\t\3\t\5\tp\n\t\3\n\3\n\3\n\7"+
		"\nu\n\n\f\n\16\nx\13\n\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008d\n\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3"+
		"\4\2\13\13&&\2\u00a7\2\36\3\2\2\2\4%\3\2\2\2\6,\3\2\2\2\bM\3\2\2\2\n_"+
		"\3\2\2\2\fa\3\2\2\2\16i\3\2\2\2\20o\3\2\2\2\22q\3\2\2\2\24y\3\2\2\2\26"+
		"\u0084\3\2\2\2\30\u0096\3\2\2\2\32\u0098\3\2\2\2\34\u00a0\3\2\2\2\36\37"+
		"\7\6\2\2\37 \5\4\3\2 !\7\b\2\2!\"\7\t\2\2\"#\5\b\5\2#$\7\2\2\3$\3\3\2"+
		"\2\2%)\7\7\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5"+
		"\3\2\2\2+)\3\2\2\2,\61\7&\2\2-.\7\33\2\2.\60\7&\2\2/-\3\2\2\2\60\63\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64:\7!\2"+
		"\2\65;\7\n\2\2\66\67\7\f\2\2\678\7\"\2\289\7\n\2\29;\7#\2\2:\65\3\2\2"+
		"\2:\66\3\2\2\2;\7\3\2\2\2<=\5\n\6\2=>\7#\2\2>L\3\2\2\2?@\5\24\13\2@A\7"+
		"#\2\2AL\3\2\2\2BC\5\26\f\2CD\7#\2\2DL\3\2\2\2EF\5\32\16\2FG\7#\2\2GL\3"+
		"\2\2\2HI\5\34\17\2IJ\7#\2\2JL\3\2\2\2K<\3\2\2\2K?\3\2\2\2KB\3\2\2\2KE"+
		"\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OM\3\2\2\2"+
		"PQ\t\2\2\2QS\7\16\2\2RT\5\n\6\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2V`\3\2\2\2WX\t\2\2\2XZ\7\r\2\2Y[\5\n\6\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]`\3\2\2\2^`\t\2\2\2_P\3\2\2\2_W\3\2\2\2_^\3\2\2\2`\13"+
		"\3\2\2\2af\5\n\6\2bc\7\33\2\2ce\5\n\6\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2g\r\3\2\2\2hf\3\2\2\2ij\7\35\2\2jk\5\f\7\2kl\7\36\2\2l\17\3"+
		"\2\2\2mp\5\n\6\2np\5\16\b\2om\3\2\2\2on\3\2\2\2p\21\3\2\2\2qv\5\20\t\2"+
		"rs\7\33\2\2su\5\20\t\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\23\3\2"+
		"\2\2xv\3\2\2\2y~\7&\2\2z{\7\33\2\2{}\7&\2\2|z\3\2\2\2}\u0080\3\2\2\2~"+
		"|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7"+
		"\31\2\2\u0082\u0083\5\22\n\2\u0083\25\3\2\2\2\u0084\u0085\7\21\2\2\u0085"+
		"\u0086\7\"\2\2\u0086\u0087\5\30\r\2\u0087\u0088\7#\2\2\u0088\u0089\7\22"+
		"\2\2\u0089\u008c\5\b\5\2\u008a\u008b\7\23\2\2\u008b\u008d\5\b\5\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\24"+
		"\2\2\u008f\27\3\2\2\2\u0090\u0097\7\17\2\2\u0091\u0097\7\20\2\2\u0092"+
		"\u0093\5\20\t\2\u0093\u0094\7\30\2\2\u0094\u0095\5\20\t\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0097"+
		"\31\3\2\2\2\u0098\u0099\7\25\2\2\u0099\u009a\7\"\2\2\u009a\u009b\5\30"+
		"\r\2\u009b\u009c\7#\2\2\u009c\u009d\7\27\2\2\u009d\u009e\5\b\5\2\u009e"+
		"\u009f\7\26\2\2\u009f\33\3\2\2\2\u00a0\u00a1\7\'\2\2\u00a1\35\3\2\2\2"+
		"\20)\61:KMU\\_fov~\u008c\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}