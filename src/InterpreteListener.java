public class InterpreteListener extends AnasemListener{

    @Override
    public void exitMostrar(Anasint.MostrarContext ctx) {

        VariableP var = AnasemListener.mapaVariables.get(ctx.IDENTIFICADOR());
        String nombreSecuencia = var.nombre;
        System.out.println(nombreSecuencia + " = " + var.getValores());
    }
}
