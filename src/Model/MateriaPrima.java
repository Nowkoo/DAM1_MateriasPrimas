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

    public boolean comprobar(HashMap<String, Float> componentesUsuarios) {
        for (String componenteUsuario : componentesUsuarios.keySet()) {
            for (Componente componente : componentes) {
                if (!componenteUsuario.equals(componente.nombre)) {
                    return false;
                } else {
                    float valor = componentesUsuarios.get(componenteUsuario);
                    if (!componente.comprobarRango(valor)) {
                        return false;
                    }
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
