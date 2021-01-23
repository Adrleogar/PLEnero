import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnasemListener extends AnasintBaseListener {

    static Map<String, VariableP> mapaVariables = new HashMap();
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
                System.out.println("ERROR, TIPO NO VÁLIDO");
                System.exit(1);
            }
            String s = ctx.IDENTIFICADOR(i).getText();
            VariableP var = mapaVariables.get(s);
            if (mapaVariables.get(s).getTipo().equals(Ptype.ENTERO)&&ctx.exprs().expr(i).getRuleIndex()==5){

            }else if(mapaVariables.get(s).getTipo().equals(Ptype.SEQNUM)&&ctx.exprs().expr(i).getRuleIndex()==8){

            }else{
                System.out.println("ERROR");
                System.exit(1);
            }
        }
    }

    @Override
    public void exitRuptura(Anasint.RupturaContext ctx) {
        if(ctx.getParent().getRuleIndex()==15){
        } else if (esParentunMientras(ctx)){

        }else {
            System.out.println("ERROR");
            System.exit(1);
        }
    }

    private Boolean esParentunMientras(ParserRuleContext ctx){
        Boolean res=null;

        if(ctx.getParent().getRuleIndex()!=4){
            res=false;
        } else if(ctx.getParent().getRuleIndex()==15){
            res=true;
        } else {
            res=esParentunMientras(ctx.getParent());
        }
        return res;
    }

    @Override
    public void exitExpr_bool(Anasint.Expr_boolContext ctx) {

        if(ctx.getText().equals("T") || ctx.getText().equals("F")){

        }else if(ctx.getChild(0).getText().equals("VACIO")){
            VariableP s = mapaVariables.get(ctx.children.get(2).getText());
            if (s.getTipo()!= Ptype.SEQNUM){
                System.out.println("ERROR");
                System.exit(1);
            }
        }else{
            if(ctx.expr(0).getRuleIndex()==ctx.expr(1).getRuleIndex()){

            }else{
                System.out.println("ERROR");
                System.exit(1);
            }
        }
    }

    @Override
    public void exitOperacion(Anasint.OperacionContext ctx) {

        if(ctx.getRuleContext().equals(38)){
            if(mapaVariables.containsKey(ctx.getText())){
                VariableP val = mapaVariables.get(ctx.getText());
                if(!val.getTipo().equals(Ptype.ENTERO)){
                    System.out.println("ERROR");
                    System.exit(1);
                }
            }else {
                System.out.println("ERROR");
                System.exit(1);
            }
        }
    }

    @Override
    public void enterExpr_bool(Anasint.Expr_boolContext ctx) {

        if(ctx.getRuleIndex()==24){
            if(mapaVariables.containsKey(ctx.getText())){
                VariableP var=mapaVariables.get(ctx.getText());
                if(var.getTipo().equals(Ptype.ENTERO)){
                    System.out.println("ERROR");
                }
            }
        }
        //PENDIENTE AUN POR REVISAR
    }
}