package View;

import Controller.ListenersVista;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

class PanelIzquierdo extends JPanel {

    PanelIzquierdo() {
        setLayout(new BorderLayout());
        setBackground(Color.blue);

        PanelIzquierdoCenter panelIzquierdoCenter = new PanelIzquierdoCenter();
        add(panelIzquierdoCenter, BorderLayout.CENTER);

        PanelIzquierdoSur panelIzquierdoSur = new PanelIzquierdoSur();
        add(panelIzquierdoSur, BorderLayout.SOUTH);

    }

}

class PanelDerecho extends JPanel {

    PanelDerecho() {
        setLayout(new GridLayout(2,1));
        setBackground(Color.cyan);
        JPanel panelInstrucciones = new JPanel(new BorderLayout());
        JPanel panelResultado = new JPanel(new BorderLayout());

        JLabel tituloResultado = new JLabel("RESULTADO");
        tituloResultado.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        tituloResultado.setFont(new Font("Arial", Font.BOLD, 30));
        tituloResultado.setHorizontalAlignment(JLabel.CENTER);
        JPanel resultado = new JPanel();

        JLabel tituloInstruccion = new JLabel("INSTRUCCIONES");
        tituloInstruccion.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        tituloInstruccion.setFont(new Font("Arial", Font.BOLD, 30));
        tituloInstruccion.setHorizontalAlignment(JLabel.CENTER);
        JLabel textoInstruccion = new JLabel();

        panelInstrucciones.add(tituloInstruccion, BorderLayout.NORTH);
        panelInstrucciones.add(textoInstruccion, BorderLayout.CENTER);

        panelResultado.add(tituloResultado, BorderLayout.NORTH);
        panelResultado.add(resultado, BorderLayout.CENTER);

        add(panelInstrucciones);
        add(panelResultado);




    }


}

class PanelIzquierdoSur extends JPanel {
    JButton enviar = new JButton("Enviar");
    public PanelIzquierdoSur() {
        enviar.setFont(new Font("Arial", Font.BOLD, 15));
        enviar.setBackground(new Color(70, 130, 180));
        enviar.setForeground(Color.WHITE);
        enviar.setFocusPainted(false);

        setLayout(new BorderLayout());
        add(enviar, BorderLayout.CENTER);
    }
}

class PanelIzquierdoCenter extends JPanel {

    HashMap<String, Float> cajas = new HashMap<>();
    public PanelIzquierdoCenter() {
        // ------- DECLARAMOS E INSERTAMOS OBJETOS COMPONENTES --------
        Caja componente1 = new Caja("Si02");
        Caja componente2 = new Caja("Al2O3");
        Caja componente3 = new Caja("Fe2O3");
        Caja componente4 = new Caja("CaO");
        Caja componente5 = new Caja("MgO");
        Caja componente6 = new Caja("Na2O");
        Caja componente7 = new Caja("K2O");
        Caja componente8 = new Caja("TiO2");
        Caja componente9 = new Caja("PPC");

        setLayout(new GridLayout(3,3));

        cajas.put(componente1.getText(),componente1.getTextField());
        cajas.put(componente2.getText(),componente2.getTextField());
        cajas.put(componente3.getText(),componente3.getTextField());
        cajas.put(componente4.getText(),componente4.getTextField());
        cajas.put(componente5.getText(),componente5.getTextField());
        cajas.put(componente6.getText(),componente6.getTextField());
        cajas.put(componente7.getText(),componente7.getTextField());
        cajas.put(componente8.getText(),componente8.getTextField());
        cajas.put(componente9.getText(),componente9.getTextField());

        // AÑADIMOS LOS COMPONENTES
        add(componente1);
        add(componente2);
        add(componente3);
        add(componente4);
        add(componente5);
        add(componente6);
        add(componente7);
        add(componente8);
        add(componente9);

    }

    public HashMap<String,Float> getArrayCajas(){
        return cajas;
    }

}

