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

    public float esRangoCorrecto2(float valor, float maxPorcentaje) {
        if (valor <= maximo && valor >= minimo) {
            return maxPorcentaje;
        }
        return 0;
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

