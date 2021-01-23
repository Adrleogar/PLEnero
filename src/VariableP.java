import java.util.List;
import java.util.Objects;

public class VariableP {
    String nombre;
    Ptype tipo;
    List<Integer> Valores;

    public VariableP(String nombre, Ptype tipo) {
        this.nombre = nombre;
        this.tipo= tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "VariableP{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", Valores=" + Valores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableP variableP = (VariableP) o;
        return Objects.equals(nombre, variableP.nombre) && tipo == variableP.tipo && Objects.equals(Valores, variableP.Valores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, Valores);
    }

    public void setTipo(Ptype tipo) {
        this.tipo = tipo;
    }

    public void setValores(List<Integer> valores) {
        Valores = valores;
    }

    public String getNombre() {
        return nombre;
    }

    public Ptype getTipo() {
        return tipo;
    }

    public List<Integer> getValores() {
        return Valores;
    }

}
