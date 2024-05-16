import java.util.ArrayList;
import java.util.HashMap;

public class MateriaPrima {
    ArrayList<Componente> componentes;
    public MateriaPrima(ArrayList<Componente> componentes) {
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
}
