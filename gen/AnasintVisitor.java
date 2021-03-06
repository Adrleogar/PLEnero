// Generated from C:/Users/carli/Proyecto PL Convocatoria/PLEnero/src\Anasint.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Anasint}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnasintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Anasint#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(Anasint.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Anasint.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(Anasint.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VisitEntero}
	 * labeled alternative in {@link Anasint#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitEntero(Anasint.VisitEnteroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VisitOperacionMultiplicacion}
	 * labeled alternative in {@link Anasint#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitOperacionMultiplicacion(Anasint.VisitOperacionMultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VisitOperacionSumRest}
	 * labeled alternative in {@link Anasint#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitOperacionSumRest(Anasint.VisitOperacionSumRestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VisitIdentificador}
	 * labeled alternative in {@link Anasint#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitIdentificador(Anasint.VisitIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VisitAcceso}
	 * labeled alternative in {@link Anasint#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitAcceso(Anasint.VisitAccesoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VisitUltimaPos}
	 * labeled alternative in {@link Anasint#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitUltimaPos(Anasint.VisitUltimaPosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#ultima_posicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUltima_posicion(Anasint.Ultima_posicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(Anasint.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuencia(Anasint.SecuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#acceso_secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceso_secuencia(Anasint.Acceso_secuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Anasint.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(Anasint.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool(Anasint.Expr_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(Anasint.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#vacia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacia(Anasint.VaciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracion(Anasint.IteracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(Anasint.MostrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuptura(Anasint.RupturaContext ctx);
}