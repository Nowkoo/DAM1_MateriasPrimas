package Model;

public class Componente {
    private String nombre;
    private float minimo;
    private float maximo;

    public Componente (String nombre, float minimo, float maximo) {
        this.nombre = nombre;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public boolean esRangoCorrecto(float valor) {
        if (valor <= maximo && valor >= minimo) {
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public float getMinimo() {
        return minimo;
    }

    public float getMaximo() {
        return maximo;
    }
}

