package View.Paneles;

import View.Caja;

import javax.swing.*;
import java.awt.*;

public class PanelDerecho extends JPanel {

    private JLabel resultado;
    private JTextArea textoInstruccion;
    private JButton resetComponentes;

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
        textoInstruccion = new JTextArea(3,3);
        textoInstruccion.setText("Rellena todos los campos, \nSi no hay componente, pon 0");
        tituloInstruccion.setHorizontalAlignment(JLabel.CENTER);
        textoInstruccion.setEditable(false);

        textoInstruccion.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        textoInstruccion.setAlignmentY(JTextArea.CENTER_ALIGNMENT);

        panelInstrucciones.add(tituloInstruccion, BorderLayout.NORTH);
        panelInstrucciones.add(textoInstruccion, BorderLayout.CENTER);

        resultado.setHorizontalAlignment(JLabel.CENTER);
        panelResultado.add(tituloResultado, BorderLayout.NORTH);
        panelResultado.add(resultado, BorderLayout.CENTER);
        resetComponentes = new JButton("Reset");

        resetComponentes.setFont(new Font("Arial", Font.BOLD, 15));
        resetComponentes.setBackground(new Color(255, 0, 0, 211));
        resetComponentes.setForeground(Color.WHITE);
        resetComponentes.setFocusPainted(false);

        panelResultado.add(resetComponentes,BorderLayout.SOUTH);
        resetComponentes.addActionListener(e-> {
            for (Caja caja : PanelIzquierdoCenter.cajas){
                caja.getJTextField().setText(" ");
            }
            resultado.setText(" ");
        });

        add(panelInstrucciones);
        add(panelResultado);
    }

    public JLabel getResultado() {
        return resultado;
    }
}
