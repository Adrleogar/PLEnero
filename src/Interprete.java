import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class Interprete extends AnasintBaseVisitor {

    /*
    1. Sacar el valor de TODAS las operaciones HECHO
    2. Añadir cada modificacion de cada variable al almacén de variables FALTA ESTE
    3. Evaluar las comparaciones HECHO
    4. Sacar la última posicion HECHO
    5. Realizar las iteraciones TENIENDO EN CUENTA LA RUPTURA HECHO
    6. Evaluar si una secuencia está vacía o no HECHO
    7. Evaluar cada expresión Booleana HECHO
    8. Evaluar los condicionales HECHO

    *. Visitar CADA sentencia dedicada en el Anasint. (Puede crear más objetivos)

     */


    /*Objetivo 6: Evaluar si una secuencia está vacía o no
    {funcion f (visita vacío) devuelve var}
    Boolean var = vacíoFuncionLlamada(IDENTIFICADOR)?
     */

    @Override
    public Boolean visitVacia(Anasint.VaciaContext ctx) {
        Boolean res = false;
        VariableP var = AnasemListener.mapaVariables.get(ctx.IDENTIFICADOR());
        if (var.Valores.isEmpty()) {
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

        if (ctx.getText().equals("T")) {
            res = true;
        } else if (ctx.getText().equals("F")) {
            res = false;
        } else if (ctx.getChild(0).getText().equals("VACIO")) {
            res = (Boolean) visit(ctx.vacia());
        } else {
            res = (Boolean) visit(ctx.comparacion());
        }
        return res;
    }

    @Override
    public Boolean visitComparacion(Anasint.ComparacionContext ctx) {
        Boolean res = null;
        Object expresion_1 = visit(ctx.expr(0));
        Object expresion_2 = visit(ctx.expr(1));

        String com = ctx.COMPARADORES().getText();
        if (com == ">") {
            Integer int1 = (Integer) expresion_1;
            Integer int2 = (Integer) expresion_2;
            res = int1 > int2;
        } else if (com == "<") {
            Integer int1 = (Integer) expresion_1;
            Integer int2 = (Integer) expresion_2;
            res = int1 < int2;
        } else if (com == "==") {
            res = expresion_1 == expresion_2;
        } else if (com == "!=") {
            res = expresion_1 != expresion_2;
        } else if (com == ">=") {
            Integer int1 = (Integer) expresion_1;
            Integer int2 = (Integer) expresion_2;
            res = int1 >= int2;
        } else if (com == "<=") {
            Integer int1 = (Integer) expresion_1;
            Integer int2 = (Integer) expresion_2;
            res = int1 >= int2;
        } else if (com == "&&") {
            Boolean bool1 = (Boolean) expresion_1;
            Boolean bool2 = (Boolean) expresion_2;
            res = bool1 && bool2;
        } else if (com == "||") {
            Boolean bool1 = (Boolean) expresion_1;
            Boolean bool2 = (Boolean) expresion_2;
            res = bool1 && bool2;
        } else if (com == "!") {
            Boolean bool1 = (Boolean) expresion_1;
            res = !bool1;
        }
        if (res = null) {
            System.out.println("ERROR, se ha utilizado un comparador no válido");
            System.exit(1);
        }

        return res;
    }

    @Override
    public Integer visitUltima_posicion(Anasint.Ultima_posicionContext ctx) {
        Integer res=null;
        VariableP var = AnasemListener.mapaVariables.get(ctx.IDENTIFICADOR().getText());
        if(var.getValores().isEmpty()){
            System.out.println("LA LISTA ESTA VACIA");
            System.exit(1);
        } else {
            res=var.getValores().get(var.getValores().size()-1);
        }
        return res;
    }


    @Override
    public Object visitIteracion(Anasint.IteracionContext ctx) {

        while((Boolean) visit(ctx.expr_bool())){    //Mientras que la expr_bool sea true

            Boolean bool = true;
            if(!HayRuptura(ctx,bool)){
                visit(ctx.instrucciones());
            }
        }
        return 1;
    }

    private boolean HayRuptura(Anasint.IteracionContext ctx, Boolean bool) {
        Boolean res = false;
        for( ParseTree c: ctx.children){
            if(c.getText().equals("RUPTURA")){
                res = true;
            }else if(c.getChildCount()==0){
                res = false;
            }else{
                res = HayRuptura((Anasint.IteracionContext) c, bool);
            }
        }
        return res;
    }

    @Override
    public Object visitCondicional(Anasint.CondicionalContext ctx) {
        if((Boolean) visit(ctx.expr_bool())){
            visit(ctx.instrucciones(0));
        } else if(ctx.instrucciones().size()==2){
            visit(ctx.instrucciones(1));
        }
        return 1;
    }

    @Override
    public Integer visitOperaciones(Anasint.OperacionesContext ctx) {

        for(int i = 0; i < ctx.operacion().size(); i++){

            visit(ctx.operacion(i));
        }

        return 1;
    }

    @Override
    public Object visitAcceso_secuencia(Anasint.Acceso_secuenciaContext ctx) {

        if((int)visit(ctx.operacion()) > Integer.valueOf(AnasemListener.mapaVariables.get(ctx.IDENTIFICADOR().getText()).getValores().size())){
            System.out.println("ERROR");
            System.exit(1);
        }else if(visit(ctx.)){
            VariableP v = AnasemListener.mapaVariables.get(ctx.IDENTIFICADOR().getText());

            return v.getValores().get((int)visit(ctx.operacion()));
        }
        return "";
    }

    @Override
    public Object visitVisitOperacionSumRest(Anasint.VisitOperacionSumRestContext ctx) {
        Integer res = null;
        Object op_1 = visit(ctx.operacion(0));
        Object op_2 = visit(ctx.operacion(1);

        if(ctx.OP_SR().getText().equals("+")){
            Integer int1 = (Integer) op_1;
            Integer int2 = (Integer) op_2;
            res=int1+int2;
        }else {
            Integer int1 = (Integer) op_1;
            Integer int2 = (Integer) op_2;
            res=int1-int2;
        }

        return res;
    }

    @Override
    public Object visitVisitOperacionMultiplicacion(Anasint.VisitOperacionMultiplicacionContext ctx) {
        Integer res = null;
        Object op_1 = visit(ctx.operacion(0));
        Object op_2 = visit(ctx.operacion(1);

        Integer int1 = (Integer) op_1;
        Integer int2 = (Integer) op_2;
        res=int1*int2;

        return res;
    }

    @Override
    public Object visitVisitEntero(Anasint.VisitEnteroContext ctx) {
        Integer res=null;
        res=Integer.parseInt(ctx.ENTERO().getText());
        return res;
    }

    @Override
    public Object visitVisitIdentificador(Anasint.VisitIdentificadorContext ctx) {
        Integer res = null;
        VariableP var = AnasemListener.mapaVariables.get(ctx.IDENTIFICADOR());
        res=var.getValores().get(0);
        return res;
    }


    @Override
    public Object visitVisitUltimaPos(Anasint.VisitUltimaPosContext ctx) {
        return visit(ctx.ultima_posicion());
    }

    @Override
    public Object visitVisitAcceso(Anasint.VisitAccesoContext ctx) {
        return visit(ctx.acceso_secuencia());
    }

}
