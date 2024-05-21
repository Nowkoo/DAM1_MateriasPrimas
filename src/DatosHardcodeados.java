import Model.Componente;
import Model.MateriaPrima;

import java.util.ArrayList;

public class DatosHardcodeados {
    public void cargarDatos() {
        ArrayList<MateriaPrima> materiasPrimas = new ArrayList<>();
        ArrayList<Componente> componentesArcillaBlanca = new ArrayList<>();
        Componente sio2 = new Componente("SiO2", 48, 79);
        componentesArcillaBlanca.add(sio2);
       // MateriaPrima arcillaBlanca = new MateriaPrima(componentesArcillaBlanca);
    }
}
