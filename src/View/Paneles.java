package View;

import Controller.ListenersVista;

import javax.swing.*;
import java.awt.*;

class PanelIzquierdo extends JPanel {

    PanelIzquierdo() {
        setLayout(new BorderLayout());
        setBackground(Color.blue);

        PanelIzquierdoCenter panelIzquierdoCenter = new PanelIzquierdoCenter();
        add(panelIzquierdoCenter, BorderLayout.CENTER);

        PanelIzquierdoSur panelIzquierdoSur = new PanelIzquierdoSur();
        add(panelIzquierdoSur, BorderLayout.SOUTH);

    }

}

class PanelDerecho extends JPanel {

    PanelDerecho() {
        setLayout(new BorderLayout());


    }


}

public class PanelIzquierdoSur extends JPanel {
    JButton enviar = new JButton("Enviar");
    PanelIzquierdoSur() {
        enviar.setFont(new Font("Arial", Font.BOLD, 15));
        add(enviar);
    }
}

class PanelIzquierdoCenter extends JPanel {

    PanelIzquierdoCenter() {
        // ------- DECLARAMOS E INSERTAMOS OBJETOS COMPONENTES --------
        Caja componente1 = new Caja("Si02");
        Caja componente2 = new Caja("Al2O3");
        Caja componente3 = new Caja("Fe2O3");
        Caja componente4 = new Caja("CaO");
        Caja componente5 = new Caja("MgO");
        Caja componente6 = new Caja("Na2O");
        Caja componente7 = new Caja("K2O");
        Caja componente8 = new Caja("TiO2");
        Caja componente9 = new Caja("PPC");

        setLayout(new GridLayout(3,3));

        Caja[] cajas = new Caja[9];

        // AÑADIMOS LOS COMPONENTES
        add(componente1);
        add(componente2);
        add(componente3);
        add(componente4);
        add(componente5);
        add(componente6);
        add(componente7);
        add(componente8);
        add(componente9);

    }
}

