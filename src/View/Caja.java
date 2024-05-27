package View;

import javax.swing.*;
import java.awt.*;

public class Caja extends JPanel {
    private JLabel texto;
    private JTextField porcentaje;

    public Caja(String nombreComponente) {
        setLayout(new GridLayout(2, 1));
        setBackground(Color.white);

        texto = new JLabel(nombreComponente);
        porcentaje = new JTextField(10);

        texto.setHorizontalAlignment(JLabel.CENTER);
        texto.setFont(new Font("Arial", Font.PLAIN, 30));
        porcentaje.setHorizontalAlignment(JTextField.CENTER);
        porcentaje.setFont(new Font("Arial", Font.PLAIN, 30));

        add(texto);
        add(porcentaje);
    }

    public String getTextLabel() {
        return texto.getText();
    }

    public Float getTextField() {
        try {
            return Float.parseFloat(porcentaje.getText());
        } catch (NumberFormatException e) {
            return 0.0f;
        }
    }
    public JTextField getJTextField(){
        return porcentaje;
    }


}
