package View.Paneles;

import javax.swing.*;
import java.awt.*;

public class PanelIzquierdo extends JPanel {

    public PanelIzquierdo() {
        setLayout(new BorderLayout());
        setBackground(Color.blue);

        panelIzquierdoCenter = new PanelIzquierdoCenter();
        add(panelIzquierdoCenter, BorderLayout.CENTER);

        panelIzquierdoSur = new PanelIzquierdoSur();
        add(panelIzquierdoSur, BorderLayout.SOUTH);


    }
    public PanelIzquierdoCenter panelIzquierdoCenter;
    public PanelIzquierdoSur panelIzquierdoSur;

}

