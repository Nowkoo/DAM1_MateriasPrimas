package View;

import javax.swing.*;
import java.awt.*;

class Caja extends JPanel{

    public JLabel texto;
    public JTextField porcentaje;

    Caja(String nombreComponente){
        setLayout(new GridLayout(2,1));
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

    public String getText(){
        return texto.getText();
    }

    public Float getTextField(){
        try {
            return Float.parseFloat(porcentaje.getText());
        } catch (NumberFormatException e) {
            return 0.0f;
        }
    }
}
