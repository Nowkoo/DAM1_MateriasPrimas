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

    public void esMateriaPrima2(HashMap<String, Float> componentesUsuarios) {
        HashMap<MateriaPrima, Float> similares = new HashMap<>();
        int porcentaje = 0;

        for (Componente componenteReceta : componentes) {
            if (!componentesUsuarios.containsKey(componenteReceta.getNombre())) {

            } else {
                float valorUsuario = componentesUsuarios.get(componenteReceta.getNombre());
                int porcentajeComponente = componenteReceta.esRangoCorrecto2(valorUsuario);
                porcentaje += porcentajeComponente;
            }
        }
        if (porcentaje > 90) {

        }
        return similares;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public String getNombre() {
        return nombre;
    }
}
