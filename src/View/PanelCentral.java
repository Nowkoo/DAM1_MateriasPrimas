package View;

import javax.swing.*;
import java.awt.*;

class PanelCentral extends JPanel {

    public PanelCentral() {

        Componente componente1 = new Componente("Si02");
        Componente componente2 = new Componente("Al2O3");
        Componente componente3 = new Componente("Fe2O3");
        Componente componente4 = new Componente("CaO");
        Componente componente5 = new Componente("MgO");
        Componente componente6 = new Componente("Na2O");
        Componente componente7 = new Componente("K2O");
        Componente componente8 = new Componente("TiO2");
        Componente componente9 = new Componente("PPC");

        setLayout(new GridLayout(3,3));

        add(componente1);
        add(componente2);
        add(componente3);
        add(componente4);
        add(componente5);
        add(componente6);
        add(componente7);
        add(componente8);
        add(componente9);


        /*GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(50,50,50,50);



        constraints.weightx = 1.0;
        constraints.weighty = 1.0;

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(componente1,constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        add(componente2,constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        add(componente3,constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(componente4,constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        add(componente5,constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        add(componente6,constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        add(componente7,constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        add(componente8,constraints);

        constraints.gridx = 2;
        constraints.gridy = 2;
        add(componente9,constraints);

        constraints.anchor = GridBagConstraints.BOTH;

        setVisible(true);*/

    }
}
