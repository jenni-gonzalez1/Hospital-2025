package Paneles;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class BannerPanel {
    
    private JPanel panelBanner;

    public BannerPanel() {
        panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500, 800)); 
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.PINK);
    }
    
    public JPanel getJPanel() {
        return panelBanner;
    }
}