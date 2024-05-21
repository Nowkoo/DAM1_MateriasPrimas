package Model;

public class Componente {
    String nombre;
    float minimo;
    float maximo;

    public Componente (String nombre, float minimo, float maximo) {
        this.nombre = nombre;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public boolean esRangoCorrecto(float valor) {
        if (valor < maximo && valor > minimo) {
            return true;
        }
        return false;
    }
}
