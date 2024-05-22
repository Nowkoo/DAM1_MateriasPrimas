package View;

import javax.swing.*;
import java.awt.*;

class Caja extends JPanel{

    Caja(String nombreComponente){
        setLayout(new GridLayout(2,1));
        setBackground(Color.white);

        JLabel texto = new JLabel(nombreComponente);
        JTextField porcentaje = new JTextField(10);
        
        texto.setHorizontalAlignment(JLabel.CENTER);
        texto.setFont(new Font("Arial", Font.PLAIN, 18));
        porcentaje.setHorizontalAlignment(JTextField.CENTER);

        add(texto);
        add(porcentaje);

        //setBorder(BorderFactory.createEmptyBorder(7, 30, 40, 30));
    }
}
