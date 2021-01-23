import java.util.ArrayList;
import java.util.List;

public class AnasemListener extends AnasintBaseListener {

    static List<VariableP> listaVariables = new ArrayList<VariableP>();

    public void exitDeclaraciones(Anasint.DeclaracionesContext ctx) {

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
            VariableP s = new VariableP(id, tipo);
            listaVariables.add(s);

        }
    }
}