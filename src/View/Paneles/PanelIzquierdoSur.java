package View.Paneles;

import javax.swing.*;
import java.awt.*;

public class PanelIzquierdoSur extends JPanel {
    JButton enviar = new JButton("Enviar");

    public PanelIzquierdoSur() {
        enviar.setFont(new Font("Arial", Font.BOLD, 15));
        enviar.setBackground(new Color(70, 130, 180));
        enviar.setForeground(Color.WHITE);
        enviar.setFocusPainted(false);

        setLayout(new BorderLayout());
        add(enviar, BorderLayout.CENTER);
    }

    public JButton boton() {
        return enviar;
    }
}
