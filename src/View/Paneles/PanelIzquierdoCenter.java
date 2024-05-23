package View.Paneles;

import View.Caja;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelIzquierdoCenter extends JPanel {

    public static ArrayList<Caja> cajas = new ArrayList<>();

    public PanelIzquierdoCenter() {
        String[] nombresComponentes = {"Fe2O3", "SiO2", "Al2O3", "CaO", "MgO", "Na2O", "K2O", "TiO2", "PPC"};

        setLayout(new GridLayout(3, 3));

        for (String nombre : nombresComponentes) {
            Caja caja = new Caja(nombre);
            cajas.add(caja);
            add(caja);
        }
    }
}
