package View.Paneles;

import javax.swing.*;
import java.awt.*;

public class PanelDerecho extends JPanel {

    private JLabel resultado;
    private JLabel textoInstruccion;
    private String textoDeLasInstrucciones; //poner el texto aqui

    public PanelDerecho() {
        setLayout(new GridLayout(2, 1));
        setBackground(Color.cyan);
        JPanel panelInstrucciones = new JPanel(new BorderLayout());
        JPanel panelResultado = new JPanel(new BorderLayout());

        JLabel tituloResultado = new JLabel("RESULTADO");
        tituloResultado.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tituloResultado.setFont(new Font("Arial", Font.BOLD, 30));
        tituloResultado.setHorizontalAlignment(JLabel.CENTER);
        resultado = new JLabel();

        JLabel tituloInstruccion = new JLabel("INSTRUCCIONES");
        tituloInstruccion.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tituloInstruccion.setFont(new Font("Arial", Font.BOLD, 30));
        tituloInstruccion.setHorizontalAlignment(JLabel.CENTER);
        textoInstruccion = new JLabel();
        textoInstruccion.setText(textoDeLasInstrucciones);

        panelInstrucciones.add(tituloInstruccion, BorderLayout.NORTH);
        panelInstrucciones.add(textoInstruccion, BorderLayout.CENTER);

        panelResultado.add(tituloResultado, BorderLayout.NORTH);
        panelResultado.add(resultado, BorderLayout.CENTER);

        add(panelInstrucciones);
        add(panelResultado);
    }

    public JLabel getResultado() {
        return resultado;
    }

    public JLabel getTextoInstruccion() {
        return textoInstruccion;
    }
}
