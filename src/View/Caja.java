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
        texto.setFont(new Font("Arial", Font.PLAIN, 18));
        porcentaje.setHorizontalAlignment(JTextField.CENTER);

        add(texto);
        add(porcentaje);

        //setBorder(BorderFactory.createEmptyBorder(7, 30, 40, 30));
    }

    public String getText(){
        return texto.getText();
    }

    public Float getTextField(){
        return Float.parseFloat(porcentaje.getText());
    }
}
