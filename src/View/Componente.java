package View;

import javax.swing.*;
import java.awt.*;

public class Componente extends JPanel{

    public Componente(String nombreComponente){
        setLayout(new GridLayout(2,1));

        JLabel texto = new JLabel(nombreComponente);
        JTextField porcentaje = new JTextField(10);

        add(texto);
        add(porcentaje);

        setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
    }
}
