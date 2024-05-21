package View;

import javax.swing.*;

class FramePrincipal extends JFrame {

    public FramePrincipal() {

        setBounds(30, 30, 500, 500);
        setTitle("Cerámica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        add(panelPrincipal);


        /*
        * JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);

        splitPane.setDividerLocation(150);
        splitPane.setOneTouchExpandable(true);
        * */

    }

}
