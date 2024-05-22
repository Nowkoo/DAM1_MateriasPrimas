package View;

import javax.swing.*;
import java.awt.*;

class FramePrincipal extends JFrame {

    FramePrincipal() {

        setTitle("Cerámica");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelIzquierdo panelIzquierdo = new PanelIzquierdo();
        PanelDerecho panelDerecho = new PanelDerecho();
        add(panelIzquierdo);
        add(panelIzquierdo);
        setMinimumSize(new Dimension(500,500));

        //JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, panelIzquierdo, panelDerecho);
        //splitPane.setDividerLocation(150);

    }

}
