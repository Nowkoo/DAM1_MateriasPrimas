package View;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    public PanelPrincipal() {
        setLayout(new BorderLayout());

        PanelCentral panelCentral = new PanelCentral();
        add(panelCentral, BorderLayout.CENTER);

        PanelBajo panelBajo = new PanelBajo();
        add(panelBajo, BorderLayout.SOUTH);


        /*JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel southPanel = new JPanel();*/
    }

}
