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
            if (!componentesUsuarios.containsKey(componenteReceta.getNombre())) {
                return false;
            } else {
                float valorUsuario = componentesUsuarios.get(componenteReceta.getNombre());
                if (!componenteReceta.esRangoCorrecto(valorUsuario)) {
                    return false;
                }
            }
        }
        return true;
    }

    public float esMateriaPrima2(HashMap<String, Float> componentesUsuarios) {
        float maxPorcentajeComponente = (float) 100 / 9;
        float porcentaje = 0;

        for (Componente componenteReceta : componentes) {
            if (componentesUsuarios.containsKey(componenteReceta.getNombre())) {
                float valorUsuario = componentesUsuarios.get(componenteReceta.getNombre());
                float porcentajeComponente = componenteReceta.esRangoCorrecto2(valorUsuario, maxPorcentajeComponente);
                porcentaje += porcentajeComponente;
            }
        }
        return porcentaje;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public String getNombre() {
        return nombre;
    }
}
