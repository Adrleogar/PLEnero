import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class Interprete extends AnasintBaseVisitor {

    /*
    1. Sacar el valor de TODAS las operaciones                  Hecho
    2. Añadir cada modificacion de cada variable al almacén de variables WARNING
    3. Evaluar las comparaciones                                Hecho
    4. Sacar la última posicion                                 Hecho
    5. Realizar las iteraciones TENIENDO EN CUENTA LA RUPTURA   Hecho
    6. Evaluar si una secuencia está vacía o no                 Hecho
    7. Evaluar cada expresión Booleana                          Hecho
    8. Evaluar los condicionales TENIENDO EN CUENTA LA RUPTURA  Hecho
    9. Evaluar el vacia                                         Hecho
    10. Evaluar el mostrar                                      Hecho
    11. Evaluar el ultima posicion                              Hecho
    12. Evaluar la secuencia para devolver una LISTA            HACER ADRIÀ
    13.

    *. Visitar CADA sentencia dedicada en el Anasint. (Puede crear más objetivos)

     */


    /*Objetivo 6: Evaluar si una secuencia está vacía o no
    {funcion f (visita vacío) devuelve var}
    Boolean var = vacíoFuncionLlamada(IDENTIFICADOR)?
     */

    @Override
    public Object visitSecuencia(Anasint.SecuenciaContext ctx) {
        List<Integer> res = (List<Integer>) visit(ctx.operaciones());

        return res;
    }

    @Override
    public Boolean visitVacia(Anasint.VaciaContext ctx) {
        Boolean res = false;
        VariableP var = AnasemListener.mapaVariables.get(ctx.IDENTIFICADOR().getText());
        if (var.getValores().isEmpty()) {
            res = true;
        }
        return res;
    }

    /* Objetivo 7:Evaluar cada expresión Booleana
    {funcion (visita expr_bool) devuelve var}
    Boolean var=varEvaluarExpr
     */

    @Override
    public Object visitAsignacion(Anasint.AsignacionContext ctx) {
        for(int i = 0; i < ctx.IDENTIFICADOR().size(); i++){
            VariableP var = AnasemListener.mapaVariables.get(ctx.IDENTIFICADOR(i).getText());
            if(var.getTipo().equals(Ptype.ENTERO)){
                var.setValores((List<Integer>) ctx.exprs().expr().get(i));
                AnasemListener.mapaVariables.put(var.nombre, var);
            } else if(var.getTipo().equals(Ptype.SEQNUM)){
                for(int j=0; j<ctx.exprs().expr().size(); j++){
                    var.setValores((List<Integer>) ctx.exprs().expr().get(i));
                    AnasemListener.mapaVariables.put(var.nombre, var);
                }
            }
        }
        return "";
    }

    @Override
    public Boolean visitExpr_bool(Anasint.Expr_boolContext ctx) {
        Boolean res = false;

        if (ctx.getText().equals("T")) {
            res = true;
        } else if (ctx.getText().equals("F")) {
            res = false;
        } else if (ctx.getChild(0).getText().equals("vacia")) {
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
            res = int1 <= int2;
        } else if (com == "&&") {
            Boolean bool1 = (Boolean) expresion_1;
            Boolean bool2 = (Boolean) expresion_2;
            res = bool1 && bool2;
        } else if (com == "||") {
            Boolean bool1 = (Boolean) expresion_1;
            Boolean bool2 = (Boolean) expresion_2;
            res = bool1 || bool2;
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
    public Object visitRuptura(Anasint.RupturaContext ctx) {

        return 1;
    }

    @Override
    public Object visitCondicional(Anasint.CondicionalContext ctx) {
        if((Boolean) visit(ctx.expr_bool())){
            for(int i  = 0; i<ctx.instrucciones(0).children.size(); i++){
                visit(ctx.instrucciones(0).getChild(i));
                if(visit(ctx.instrucciones(0).getChild(i)).equals(1) ){
                    break;
                }
            }
        } else if(ctx.instrucciones().size()==2){
            for(int i  = 0; i<ctx.instrucciones(1).children.size(); i++){
                visit(ctx.instrucciones(1).getChild(i));
                if(visit(ctx.instrucciones(1).getChild(i)).equals(1) ){
                    break;
                }
            }
        }
        return 0;
    }

    @Override
    public List<Integer> visitOperaciones(Anasint.OperacionesContext ctx) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < ctx.operacion().size(); i++){
            res.add((Integer) visit(ctx.operacion(i)));
        }
        return res;
    }

    @Override
    public Object visitAcceso_secuencia(Anasint.Acceso_secuenciaContext ctx) {

        if((int)visit(ctx.operacion()) > Integer.valueOf(AnasemListener.mapaVariables.get(
                ctx.IDENTIFICADOR().getText()).getValores().size())){
            System.out.println("ERROR");
            System.exit(1);
        }else{
            VariableP v = AnasemListener.mapaVariables.get(ctx.IDENTIFICADOR().getText());

            return v.getValores().get((int)visit(ctx.operacion()));
        }
        return "";
    }

    @Override
    public Object visitVisitOperacionSumRest(Anasint.VisitOperacionSumRestContext ctx) {
        Integer res = null;
        Object op_1 = visit(ctx.operacion(0));
        Object op_2 = visit(ctx.operacion(1));

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
        Object op_2 = visit(ctx.operacion(1));

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
