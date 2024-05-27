package View;

import Controller.BotonActionListener;
import Model.LeerCSV;
import View.Paneles.PanelDerecho;
import View.Paneles.PanelIzquierdo;

import javax.swing.*;
import java.awt.*;

public class FramePrincipal extends JFrame {

    public FramePrincipal() {

        setTitle("Cerámica");
        setSize(800, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LeerCSV.cargarDatosCSV();

        PanelIzquierdo panelIzquierdo = new PanelIzquierdo();
        PanelDerecho panelDerecho = new PanelDerecho();
        new BotonActionListener(panelIzquierdo.panelIzquierdoSur, panelDerecho);
        add(panelIzquierdo);
        add(panelDerecho);
        setMinimumSize(new Dimension(500,500));

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelIzquierdo, panelDerecho);
        splitPane.setDividerLocation(500);
        getContentPane().add(splitPane, BorderLayout.CENTER);

        splitPane.setResizeWeight(0.8);
        splitPane.setDividerLocation(0.8);

        setMinimumSize(new Dimension(500, 500));

    }

}
