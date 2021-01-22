import java.util.ArrayList;
import java.util.List;

public class AnasemVisitor extends AnasintBaseVisitor {

    public static List<VariableP> almacenVar=new ArrayList<>();

    public Object visitDeclaraciones(Anasint.DeclaracionesContext ctx) {
        Integer i  = 0;
        while(i< ctx.IDENTIFICADOR().size()){
            almacenVar.add((VariableP) ctx.IDENTIFICADOR(i));
        }
    }
}