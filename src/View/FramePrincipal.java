package View;

import javax.swing.*;
import java.awt.*;

class FramePrincipal extends JFrame {

    FramePrincipal() {

        setTitle("Cerámica");
        setSize(800, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelIzquierdo panelIzquierdo = new PanelIzquierdo();
        PanelDerecho panelDerecho = new PanelDerecho();
        add(panelIzquierdo);
        add(panelDerecho);
        setMinimumSize(new Dimension(500,500));

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelIzquierdo, panelDerecho);
        splitPane.setDividerLocation(500);
        add(splitPane);

    }

}
