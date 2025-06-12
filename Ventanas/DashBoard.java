package Ventanas;

import java.awt.*;
import javax.swing.*;
import Paneles.MenuLateralPanel;
import Paneles.TablaPanel;
import Paneles.HeaderPanel;

public class DashBoard extends JFrame {

    public DashBoard() {
        this.setTitle("Vista Doctor");
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        this.add(new HeaderPanel().getPanel(), BorderLayout.NORTH); 
        this.add(new MenuLateralPanel().getPanel(), BorderLayout.WEST); 
        this.add(new TablaPanel(), BorderLayout.CENTER);

        this.setVisible(true);
    }
}