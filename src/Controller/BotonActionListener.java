package Controller;

import Model.LeerCSV;
import Model.MateriaPrima;
import View.Caja;
import View.Paneles.PanelDerecho;
import View.Paneles.PanelIzquierdoCenter;
import View.Paneles.PanelIzquierdoSur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class BotonActionListener implements ActionListener {
    private PanelIzquierdoSur panel;
    private PanelDerecho panelDerecho;
    HashMap<String, Float> componentesUsuarios;
    ArrayList<Caja> resultadoDeLasCajas;

    public BotonActionListener(PanelIzquierdoSur panel, PanelDerecho panelDerecho) {
        this.panel = panel;
        this.panelDerecho = panelDerecho;
        panel.boton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<MateriaPrima> materias = LeerCSV.getMateriasPrimas();

        if (e.getSource() == panel.boton()) {
            resultadoDeLasCajas = PanelIzquierdoCenter.cajas;
            componentesUsuarios = new HashMap<>();

            for (Caja caja : resultadoDeLasCajas) {
                String nombreComponente = caja.getTextLabel().toLowerCase();
                Float valorComponente = caja.getTextField();
                componentesUsuarios.put(nombreComponente, valorComponente);
            }

            boolean encontrado = false;
            String similares = "Materias primas más cercanas:\n";
            for (MateriaPrima materia : materias) {
                float porcentaje = materia.esMateriaPrima2(componentesUsuarios);
                if (porcentaje >= 100) {
                    panelDerecho.getResultado().setText("La materia prima es: " + materia.getNombre().toUpperCase());
                    break;
                } else if (porcentaje >= 78) {
                    similares += (materia.getNombre() + " - " + porcentaje + "\n");
                    panelDerecho.getResultado().setText(similares);
                }
            }

            if (panelDerecho.getResultado().getText().length() == 0) {
                panelDerecho.getResultado().setText("Materia prima no encontrada.");
            }
        }
    }
}
