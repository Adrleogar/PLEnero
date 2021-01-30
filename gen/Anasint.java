// Generated from C:/Users/carli/Proyecto PL Convocatoria/PLEnero/src\Anasint.g4 by ANTLR 4.9
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
		HACER=21, ULTIMA_POSICION=22, VACIA=23, COMPARADORES=24, IGUAL=25, GUION=26, 
		COMA=27, PYC=28, CA=29, CC=30, LA=31, LC=32, DPS=33, PA=34, PC=35, RUPTURA=36, 
		MOSTRAR=37, COMENTARIO_BLOQUE=38, COMENTARIO_LINEA=39, IDENTIFICADOR=40;
	public static final int
		RULE_sentencia = 0, RULE_variables = 1, RULE_tipo = 2, RULE_declaraciones = 3, 
		RULE_instrucciones = 4, RULE_operacion = 5, RULE_ultima_posicion = 6, 
		RULE_operaciones = 7, RULE_secuencia = 8, RULE_acceso_secuencia = 9, RULE_expr = 10, 
		RULE_exprs = 11, RULE_asignacion = 12, RULE_condicional = 13, RULE_expr_bool = 14, 
		RULE_comparacion = 15, RULE_vacia = 16, RULE_iteracion = 17, RULE_mostrar = 18, 
		RULE_ruptura = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentencia", "variables", "tipo", "declaraciones", "instrucciones", "operacion", 
			"ultima_posicion", "operaciones", "secuencia", "acceso_secuencia", "expr", 
			"exprs", "asignacion", "condicional", "expr_bool", "comparacion", "vacia", 
			"iteracion", "mostrar", "ruptura"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'PROGRAMA'", "'VARIABLES'", "'SUBPROGRAMAS'", 
			"'INSTRUCCIONES'", "'NUM'", null, "'SEQ'", "'*'", null, "'T'", "'F'", 
			"'si'", "'entonces'", "'sino'", "'fsi'", "'mientras'", "'fmientras'", 
			"'hacer'", "'ultima_posicion'", "'vacia'", null, "'='", "'-'", "','", 
			"';'", "'['", "']'", "'{'", "'}'", "':'", "'('", "')'", "'ruptura'", 
			"'mostrar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "PROGRAMA", "VARIABLES", "SUBPROGRAMAS", 
			"INSTRUCCIONES", "NUM", "ENTERO", "SEQ", "OP_MULT", "OP_SR", "CIERTO", 
			"FALSO", "SI", "ENTONCES", "SINO", "FSI", "MIENTRAS", "FMIENTRAS", "HACER", 
			"ULTIMA_POSICION", "VACIA", "COMPARADORES", "IGUAL", "GUION", "COMA", 
			"PYC", "CA", "CC", "LA", "LC", "DPS", "PA", "PC", "RUPTURA", "MOSTRAR", 
			"COMENTARIO_BLOQUE", "COMENTARIO_LINEA", "IDENTIFICADOR"
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
			setState(40);
			match(PROGRAMA);
			setState(41);
			variables();
			setState(42);
			match(SUBPROGRAMAS);
			setState(43);
			match(INSTRUCCIONES);
			setState(44);
			instrucciones();
			setState(45);
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
			setState(47);
			match(VARIABLES);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR) {
				{
				{
				setState(48);
				declaraciones();
				}
				}
				setState(53);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
		public TerminalNode SEQ() { return getToken(Anasint.SEQ, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(NUM);
				}
				break;
			case SEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(SEQ);
				setState(56);
				match(PA);
				setState(57);
				match(NUM);
				setState(58);
				match(PC);
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(Anasint.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(Anasint.IDENTIFICADOR, i);
		}
		public TerminalNode DPS() { return getToken(Anasint.DPS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PYC() { return getToken(Anasint.PYC, 0); }
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
		enterRule(_localctx, 6, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IDENTIFICADOR);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(62);
				match(COMA);
				setState(63);
				match(IDENTIFICADOR);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(DPS);
			setState(70);
			tipo();
			setState(71);
			match(PYC);
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
		public List<TerminalNode> PYC() { return getTokens(Anasint.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(Anasint.PYC, i);
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
		public List<MostrarContext> mostrar() {
			return getRuleContexts(MostrarContext.class);
		}
		public MostrarContext mostrar(int i) {
			return getRuleContext(MostrarContext.class,i);
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
		enterRule(_localctx, 8, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << SI) | (1L << MIENTRAS) | (1L << ULTIMA_POSICION) | (1L << RUPTURA) | (1L << MOSTRAR) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(73);
					operacion(0);
					setState(74);
					match(PYC);
					}
					break;
				case 2:
					{
					setState(76);
					asignacion();
					setState(77);
					match(PYC);
					}
					break;
				case 3:
					{
					setState(79);
					condicional();
					setState(80);
					match(PYC);
					}
					break;
				case 4:
					{
					setState(82);
					iteracion();
					setState(83);
					match(PYC);
					}
					break;
				case 5:
					{
					setState(85);
					ruptura();
					setState(86);
					match(PYC);
					}
					break;
				case 6:
					{
					setState(88);
					mostrar();
					setState(89);
					match(PYC);
					}
					break;
				}
				}
				setState(95);
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
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	 
		public OperacionContext() { }
		public void copyFrom(OperacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VisitEnteroContext extends OperacionContext {
		public TerminalNode ENTERO() { return getToken(Anasint.ENTERO, 0); }
		public VisitEnteroContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVisitEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVisitEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVisitEntero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitOperacionMultiplicacionContext extends OperacionContext {
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode OP_MULT() { return getToken(Anasint.OP_MULT, 0); }
		public VisitOperacionMultiplicacionContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVisitOperacionMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVisitOperacionMultiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVisitOperacionMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitOperacionSumRestContext extends OperacionContext {
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode OP_SR() { return getToken(Anasint.OP_SR, 0); }
		public VisitOperacionSumRestContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVisitOperacionSumRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVisitOperacionSumRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVisitOperacionSumRest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitIdentificadorContext extends OperacionContext {
		public TerminalNode IDENTIFICADOR() { return getToken(Anasint.IDENTIFICADOR, 0); }
		public VisitIdentificadorContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVisitIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVisitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVisitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitAccesoContext extends OperacionContext {
		public Acceso_secuenciaContext acceso_secuencia() {
			return getRuleContext(Acceso_secuenciaContext.class,0);
		}
		public VisitAccesoContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVisitAcceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVisitAcceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVisitAcceso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitUltimaPosContext extends OperacionContext {
		public Ultima_posicionContext ultima_posicion() {
			return getRuleContext(Ultima_posicionContext.class,0);
		}
		public VisitUltimaPosContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVisitUltimaPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVisitUltimaPos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVisitUltimaPos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		return operacion(0);
	}

	private OperacionContext operacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionContext _localctx = new OperacionContext(_ctx, _parentState);
		OperacionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_operacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new VisitEnteroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97);
				match(ENTERO);
				}
				break;
			case 2:
				{
				_localctx = new VisitIdentificadorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(IDENTIFICADOR);
				}
				break;
			case 3:
				{
				_localctx = new VisitUltimaPosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				ultima_posicion();
				}
				break;
			case 4:
				{
				_localctx = new VisitAccesoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				acceso_secuencia();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new VisitOperacionSumRestContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(103);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(104);
						match(OP_SR);
						setState(106); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(105);
								operacion(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(108); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new VisitOperacionMultiplicacionContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(110);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(111);
						match(OP_MULT);
						setState(113); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(112);
								operacion(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(115); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Ultima_posicionContext extends ParserRuleContext {
		public TerminalNode ULTIMA_POSICION() { return getToken(Anasint.ULTIMA_POSICION, 0); }
		public TerminalNode CA() { return getToken(Anasint.CA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(Anasint.IDENTIFICADOR, 0); }
		public TerminalNode CC() { return getToken(Anasint.CC, 0); }
		public Ultima_posicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultima_posicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterUltima_posicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitUltima_posicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitUltima_posicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ultima_posicionContext ultima_posicion() throws RecognitionException {
		Ultima_posicionContext _localctx = new Ultima_posicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ultima_posicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ULTIMA_POSICION);
			setState(123);
			match(CA);
			setState(124);
			match(IDENTIFICADOR);
			setState(125);
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
		enterRule(_localctx, 14, RULE_operaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			operacion(0);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(128);
				match(COMA);
				setState(129);
				operacion(0);
				}
				}
				setState(134);
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
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
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
		enterRule(_localctx, 16, RULE_secuencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(PA);
			setState(136);
			operaciones();
			setState(137);
			match(PC);
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

	public static class Acceso_secuenciaContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(Anasint.IDENTIFICADOR, 0); }
		public TerminalNode CA() { return getToken(Anasint.CA, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode CC() { return getToken(Anasint.CC, 0); }
		public Acceso_secuenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso_secuencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAcceso_secuencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAcceso_secuencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAcceso_secuencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acceso_secuenciaContext acceso_secuencia() throws RecognitionException {
		Acceso_secuenciaContext _localctx = new Acceso_secuenciaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_acceso_secuencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IDENTIFICADOR);
			setState(140);
			match(CA);
			setState(141);
			operacion(0);
			setState(142);
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
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case ULTIMA_POSICION:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				operacion(0);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
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
		enterRule(_localctx, 22, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expr();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(149);
				match(COMA);
				setState(150);
				expr();
				}
				}
				setState(155);
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
		enterRule(_localctx, 24, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IDENTIFICADOR);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(157);
				match(COMA);
				setState(158);
				match(IDENTIFICADOR);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(IGUAL);
			{
			setState(165);
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
		enterRule(_localctx, 26, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(SI);
			setState(168);
			match(PA);
			setState(169);
			expr_bool();
			setState(170);
			match(PC);
			setState(171);
			match(ENTONCES);
			setState(172);
			instrucciones();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(173);
				match(SINO);
				setState(174);
				instrucciones();
				}
			}

			setState(177);
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
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public VaciaContext vacia() {
			return getRuleContext(VaciaContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_expr_bool);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CIERTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(CIERTO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(FALSO);
				}
				break;
			case ENTERO:
			case ULTIMA_POSICION:
			case PA:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				comparacion();
				}
				break;
			case VACIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				vacia();
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

	public static class ComparacionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARADORES() { return getToken(Anasint.COMPARADORES, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			expr();
			setState(186);
			match(COMPARADORES);
			setState(187);
			expr();
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

	public static class VaciaContext extends ParserRuleContext {
		public TerminalNode VACIA() { return getToken(Anasint.VACIA, 0); }
		public TerminalNode CA() { return getToken(Anasint.CA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(Anasint.IDENTIFICADOR, 0); }
		public TerminalNode CC() { return getToken(Anasint.CC, 0); }
		public VaciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVacia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVacia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaciaContext vacia() throws RecognitionException {
		VaciaContext _localctx = new VaciaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_vacia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(VACIA);
			setState(190);
			match(CA);
			setState(191);
			match(IDENTIFICADOR);
			setState(192);
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
		enterRule(_localctx, 34, RULE_iteracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(MIENTRAS);
			setState(195);
			match(PA);
			setState(196);
			expr_bool();
			setState(197);
			match(PC);
			setState(198);
			match(HACER);
			setState(199);
			instrucciones();
			setState(200);
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

	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(Anasint.MOSTRAR, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(Anasint.IDENTIFICADOR, 0); }
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(MOSTRAR);
			setState(203);
			match(PA);
			setState(204);
			match(IDENTIFICADOR);
			setState(205);
			match(PC);
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
		enterRule(_localctx, 38, RULE_ruptura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return operacion_sempred((OperacionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacion_sempred(OperacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\7\5"+
		"C\n\5\f\5\16\5F\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7h\n\7\3\7\3\7\3\7\6\7m\n\7\r\7\16\7n\3\7\3\7\3\7\6\7t"+
		"\n\7\r\7\16\7u\7\7x\n\7\f\7\16\7{\13\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\5\f\u0095\n\f\3\r\3\r\3\r\7\r\u009a\n\r\f\r\16\r\u009d\13"+
		"\r\3\16\3\16\3\16\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\5\20\u00ba\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\2\3\f\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"\2\2\2\u00d7\2*\3\2\2\2\4\61\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\n_\3\2\2\2"+
		"\fg\3\2\2\2\16|\3\2\2\2\20\u0081\3\2\2\2\22\u0089\3\2\2\2\24\u008d\3\2"+
		"\2\2\26\u0094\3\2\2\2\30\u0096\3\2\2\2\32\u009e\3\2\2\2\34\u00a9\3\2\2"+
		"\2\36\u00b9\3\2\2\2 \u00bb\3\2\2\2\"\u00bf\3\2\2\2$\u00c4\3\2\2\2&\u00cc"+
		"\3\2\2\2(\u00d1\3\2\2\2*+\7\6\2\2+,\5\4\3\2,-\7\b\2\2-.\7\t\2\2./\5\n"+
		"\6\2/\60\7\2\2\3\60\3\3\2\2\2\61\65\7\7\2\2\62\64\5\b\5\2\63\62\3\2\2"+
		"\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2"+
		"\28>\7\n\2\29:\7\f\2\2:;\7$\2\2;<\7\n\2\2<>\7%\2\2=8\3\2\2\2=9\3\2\2\2"+
		">\7\3\2\2\2?D\7*\2\2@A\7\35\2\2AC\7*\2\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7#\2\2HI\5\6\4\2IJ\7\36\2\2J\t\3\2\2"+
		"\2KL\5\f\7\2LM\7\36\2\2M^\3\2\2\2NO\5\32\16\2OP\7\36\2\2P^\3\2\2\2QR\5"+
		"\34\17\2RS\7\36\2\2S^\3\2\2\2TU\5$\23\2UV\7\36\2\2V^\3\2\2\2WX\5(\25\2"+
		"XY\7\36\2\2Y^\3\2\2\2Z[\5&\24\2[\\\7\36\2\2\\^\3\2\2\2]K\3\2\2\2]N\3\2"+
		"\2\2]Q\3\2\2\2]T\3\2\2\2]W\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`\13\3\2\2\2a_\3\2\2\2bc\b\7\1\2ch\7\13\2\2dh\7*\2\2eh\5\16\b\2fh"+
		"\5\24\13\2gb\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2hy\3\2\2\2ij\f\b\2\2"+
		"jl\7\16\2\2km\5\f\7\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2ox\3\2\2"+
		"\2pq\f\7\2\2qs\7\r\2\2rt\5\f\7\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2vx\3\2\2\2wi\3\2\2\2wp\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\r\3\2"+
		"\2\2{y\3\2\2\2|}\7\30\2\2}~\7\37\2\2~\177\7*\2\2\177\u0080\7 \2\2\u0080"+
		"\17\3\2\2\2\u0081\u0086\5\f\7\2\u0082\u0083\7\35\2\2\u0083\u0085\5\f\7"+
		"\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\21\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7$\2\2\u008a"+
		"\u008b\5\20\t\2\u008b\u008c\7%\2\2\u008c\23\3\2\2\2\u008d\u008e\7*\2\2"+
		"\u008e\u008f\7\37\2\2\u008f\u0090\5\f\7\2\u0090\u0091\7 \2\2\u0091\25"+
		"\3\2\2\2\u0092\u0095\5\f\7\2\u0093\u0095\5\22\n\2\u0094\u0092\3\2\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\27\3\2\2\2\u0096\u009b\5\26\f\2\u0097\u0098"+
		"\7\35\2\2\u0098\u009a\5\26\f\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\31\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a3\7*\2\2\u009f\u00a0\7\35\2\2\u00a0\u00a2\7*\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\33\2\2\u00a7"+
		"\u00a8\5\30\r\2\u00a8\33\3\2\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\7$\2"+
		"\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad\7%\2\2\u00ad\u00ae\7\22\2\2\u00ae"+
		"\u00b1\5\n\6\2\u00af\u00b0\7\23\2\2\u00b0\u00b2\5\n\6\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\24\2\2\u00b4"+
		"\35\3\2\2\2\u00b5\u00ba\7\17\2\2\u00b6\u00ba\7\20\2\2\u00b7\u00ba\5 \21"+
		"\2\u00b8\u00ba\5\"\22\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\37\3\2\2\2\u00bb\u00bc\5\26\f"+
		"\2\u00bc\u00bd\7\32\2\2\u00bd\u00be\5\26\f\2\u00be!\3\2\2\2\u00bf\u00c0"+
		"\7\31\2\2\u00c0\u00c1\7\37\2\2\u00c1\u00c2\7*\2\2\u00c2\u00c3\7 \2\2\u00c3"+
		"#\3\2\2\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\7$\2\2\u00c6\u00c7\5\36\20"+
		"\2\u00c7\u00c8\7%\2\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca\5\n\6\2\u00ca\u00cb"+
		"\7\26\2\2\u00cb%\3\2\2\2\u00cc\u00cd\7\'\2\2\u00cd\u00ce\7$\2\2\u00ce"+
		"\u00cf\7*\2\2\u00cf\u00d0\7%\2\2\u00d0\'\3\2\2\2\u00d1\u00d2\7&\2\2\u00d2"+
		")\3\2\2\2\22\65=D]_gnuwy\u0086\u0094\u009b\u00a3\u00b1\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}