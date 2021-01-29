import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnasemListener extends AnasintBaseListener {

    static Map<String, VariableP> mapaVariables = new HashMap();

    public Map<String, VariableP> getMapaVariables(){
        return this.mapaVariables;
    }

    public void exitDeclaraciones(Anasint.DeclaracionesContext ctx) { //Método para crear el almacen de variables

        for(int i=0; i<ctx.IDENTIFICADOR().size(); i++){

            String id=ctx.IDENTIFICADOR(i).getText();
            Ptype tipo = null;
            if(ctx.tipo().getText().equals("NUM")){
                tipo=Ptype.ENTERO;
            }else if(ctx.tipo().getText().equals("SEQ[NUM]")){
                tipo=Ptype.SEQNUM;
            }else{
                System.out.println("ERROR, TIPO NO VÁLIDO");
                System.exit(1);
            }
            VariableP s = new VariableP(id, tipo);  //Esta sería nuestra lista de variables (almacen)
            mapaVariables.put(s.nombre,s);

        }
    }

    @Override
    public void exitAsignacion(Anasint.AsignacionContext ctx) {
        if(ctx.IDENTIFICADOR().size()!= ctx.exprs().expr().size()){
            System.out.println("ERROR");
            System.exit(1);
        }

        for(int i=0; i<ctx.IDENTIFICADOR().size(); i++){
            if(!mapaVariables.containsKey(ctx.IDENTIFICADOR(i).getText())) {
                System.out.println("ERROR, VARIABLE NO DEFINIDA");
                System.exit(1);
            }
            String s = ctx.IDENTIFICADOR(i).getText();
            VariableP var = mapaVariables.get(s);
            if (mapaVariables.get(s).getTipo().equals(Ptype.ENTERO)&&ctx.exprs().expr(i).getRuleIndex()==5){

            }else if(mapaVariables.get(s).getTipo().equals(Ptype.SEQNUM)&&ctx.exprs().expr(i).getRuleIndex()==8){

            }else{
                System.out.println("ERROR, SE ESTÁN ASIGNANDO VARIABLES DE DISTINTO TIPO");
                System.exit(1);
            }
        }
    }

    @Override
    public void exitRuptura(Anasint.RupturaContext ctx) {
        if(ctx.getParent().getRuleIndex()==17){
        } else if (esParentunMientras(ctx)){ //Aquí no sabemos si aún estamos dentro de un mientras

        }else {
            System.out.println("ERROR");
            System.exit(1);
        }
    }

    private Boolean esParentunMientras(ParserRuleContext ctx){
        Boolean res=null;

        if(ctx.getParent().getRuleIndex()==0){ //Volvemos hasta la sentencia, si en el camino
            res=false;                         //no hemos encontrado ningún While nos devuelve false
        } else if(ctx.getParent().getRuleIndex()==15){
            res=true; //Aquí nos hemos encontrado un bucle While por el camino y nos devuelve un true
        } else {
            res=esParentunMientras(ctx.getParent());
        }
        return res;
    }

//    @Override
//    public void exitExpr_bool(Anasint.Expr_boolContext ctx) {
//
//        if(ctx.getText().equals("T") || ctx.getText().equals("F")){
//
//        }else if(ctx.getChild(0).getText().equals("VACIO")){
//            if(mapaVariables.containsKey(ctx.getChild(2).getText())){
//
//            }else{
//                System.out.println("ERROR, NO EXISTE LA SECUENCIA");
//                System.exit(1);
//            }
//            VariableP s = mapaVariables.get(ctx.children.get(2).getText());
//
//            if (s.getTipo()!= Ptype.SEQNUM){
//                System.out.println("ERROR, NO ES EL MISMO TIPO");
//                System.exit(1);
//            }
//        }else{
//            if(ctx.expr(0).getRuleIndex()==ctx.expr(1).getRuleIndex()){
//
//            }else{
//                System.out.println("ERROR, COMPARACIÓN ERRÓNEA");
//                System.exit(1);
//            }
//        }
//    }



//    @Override
//    public void exitOperacion(Anasint.OperacionContext ctx) {
//
//        if(ctx.getRuleContext().equals(39)){
//            if(mapaVariables.containsKey(ctx.getText())){
//                VariableP val = mapaVariables.get(ctx.getText());
//                if(!val.getTipo().equals(Ptype.ENTERO)){
//                    System.out.println("ERROR");
//                    System.exit(1);
//                }
//            }else {
//
//                if(ctx.getRuleIndex() == 9){
//
//                    if(mapaVariables.containsKey(ctx.getChild(0).getText())){
//                        VariableP val = mapaVariables.get(ctx.getText());
//                    }else{
//                        System.out.println("ERROR");
//                        System.exit(1);
//                    }
//                }
//
//            }
//        }
    //}



//    @Override
//    public void enterExpr_Bool(Anasint.Expr_boolContext ctx){
//        if(ctx.getText()=="T"||ctx.getText()=="F"||ctx.getChild().getText().equals("VACIO")){
//        }else{
//            for( s: ctx.expr()){
//                if(!mapaVariables.containsKey(s)){
//                    ERROR
//                }
//        }
//            String comp = ctx.COMPARADOR().getText();
//
//            IF(ctx.expr.getRuleNomeacuerdocomosellamaestemetodo() == numerodeOperacion){
//                if(comp.equals("==")||comp.equals("=!")){
//                    if(mapaVariables.get(ctx.expr().getText()).getTipo().equals(Ptype.SeqNum)&&
//                            mapaVariables.get(ctx.expr().getText()).getTipo().equals(Ptype.SeqNum)){
//                        ERROR
//                    }
//                }else if((comp.equals("&&")|| comp.equals("||"))&&
//                        mapaVariables.get(ctx.expr(0).getTipo().equals(Ptype.ENTERO))||
//                        mapaVariables.get(ctx.expr(1).getTipo().equals(Ptype.ENTERO))
//                ){ ERROR
//                }else if(comp.equals("!")){
//                    ERROR
//                }else if(comp.equals("<")||comp.equals(">")||comp.equals(<=)||comp.equals(>=)){
//                    mapavariables.get(ctx.expr(0)).getTipo().equals(Ptype.SEQNUM)||
//                            mapaVariables.get(ctx.expr(1)).getTipo().equals(Ptype.SEQNUM))
//                    ERROR
//                }
//            }
//        }
//    }


    @Override
    public void exitUltima_posicion(Anasint.Ultima_posicionContext ctx) {
        Integer res=null;
        VariableP var=mapaVariables.get(ctx.IDENTIFICADOR().getText());
        if(var.getTipo().equals(Ptype.ENTERO)){
            System.out.println("ERROR, NO SE PUEDE COMPROBAR LA ULTIMA POSICION DE UN ENTERO");
            System.exit(1);
        }else if(var.getValores().isEmpty()){
            System.out.println("ERROR, LA SECUENCIA ESTÁ VACÍA O ES INDEFINIDA");
            System.exit(1);
        }
    }

    @Override
    public void exitAcceso_secuencia(Anasint.Acceso_secuenciaContext ctx) {
        VariableP var=mapaVariables.get(ctx.IDENTIFICADOR().getText());
        if(var.getTipo().equals(Ptype.ENTERO)){
            System.out.println("ERROR, ES UN ENTERO Y NO SE PUEDE ACCEDER");
            System.exit(1);
        }
    }
    /*
    {}
     */
    @Override
    public void exitMostrar(Anasint.MostrarContext ctx) {
        VariableP var=mapaVariables.get(ctx.IDENTIFICADOR().getText());
        if(var.getTipo().equals(Ptype.ENTERO)){
            System.out.println("ERROR, ES UN ENTERO Y NO SE PUEDE MOSTRAR");
            System.exit(1);
        }//Vamos a permitir que se muestren secuencias vacías, esto es una decisión de diseño
    }
}