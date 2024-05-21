package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class MateriaPrima {
    ArrayList<Componente> componentes;
    private String nombre;
    public MateriaPrima(String nombre,ArrayList<Componente> componentes) {

        this.nombre = nombre;
        this.componentes = componentes;
    }

    public boolean esMateriaPrima(HashMap<String, Float> componentesUsuarios) {
        if (componentes.size() != componentesUsuarios.size()) {
            return false;
        }

        for (Componente componenteReceta : componentes) {
            if (!componentesUsuarios.containsKey(componenteReceta.nombre)) {
                return false;
            } else {
                float valorUsuario = componentesUsuarios.get(componenteReceta.nombre);
                if (!componenteReceta.esRangoCorrecto(valorUsuario)) {
                    return false;
                }
            }
        }
        return true;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public String getNombre() {
        return nombre;
    }
}
