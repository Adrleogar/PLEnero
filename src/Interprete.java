
public class Interprete extends AnasintBaseVisitor{


    /*
    1. Sacar el valor de TODAS las operaciones
    2. Añadir cada modificacion de cada variable al almacen de variables
    3. Evaluar las comparaciones
    4. Sacar la última posicion
    5. Realizar las iteraciones TENIENDO EN CUENTA LA RUPTURA
    6. Evaluar si una secuencia está vacía o no
    7. Evaluar cada expresión Booleana

    *. Visitar CADA sentencia dedicada en el Anasint. (Puede crear más objetivos)

     */


    /*Objetivo 6: Evaluar si una secuencia está vacía o no
    {funcion f (visita vacío) devuelve var}
    Boolean var = vacíoFuncionLlamada(IDENTIFICADOR)?
     */
    public Boolean visitVacio(Anasint.VacioContext ctx) {
        Boolean res = false;
        VariableP var = AnasemListener.mapaVariables.get(ctx.IDENTIFICADOR());
        if(var.Valores.isEmpty()){
            res = true;
        }
        return res;
    }

    /* Objetivo 7:Evaluar cada expresión Booleana
    {funcion (visita expr_bool) devuelve var}
    Boolean var=varEvaluarExpr
     */

    @Override
    public Boolean visitExpr_bool(Anasint.Expr_boolContext ctx) {
        Boolean res = false;

        if(ctx.getText().equals("T")) {
            res = true;
        } else if(ctx.getText().equals("F")){
            res = false;
        } else if(ctx.getChild(0).getText().equals("VACIO")){
            res = (Boolean) visit(ctx.vacio());
        } else {
            res = (Boolean) visit(ctx.comparacion());
        }
        return res;
    }


}
