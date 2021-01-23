// Generated from C:/Users/adria/IdeaProjects/apoyoPL/src\Anasint.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(Anasint.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(Anasint.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Anasint.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Anasint.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(Anasint.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(Anasint.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(Anasint.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(Anasint.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(Anasint.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(Anasint.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#ultima_posicion}.
	 * @param ctx the parse tree
	 */
	void enterUltima_posicion(Anasint.Ultima_posicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#ultima_posicion}.
	 * @param ctx the parse tree
	 */
	void exitUltima_posicion(Anasint.Ultima_posicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(Anasint.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(Anasint.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#secuencia}.
	 * @param ctx the parse tree
	 */
	void enterSecuencia(Anasint.SecuenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#secuencia}.
	 * @param ctx the parse tree
	 */
	void exitSecuencia(Anasint.SecuenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Anasint.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Anasint.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(Anasint.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(Anasint.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr_bool}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool(Anasint.Expr_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr_bool}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool(Anasint.Expr_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#vacio}.
	 * @param ctx the parse tree
	 */
	void enterVacio(Anasint.VacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#vacio}.
	 * @param ctx the parse tree
	 */
	void exitVacio(Anasint.VacioContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 */
	void enterIteracion(Anasint.IteracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 */
	void exitIteracion(Anasint.IteracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 */
	void enterRuptura(Anasint.RupturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 */
	void exitRuptura(Anasint.RupturaContext ctx);
}