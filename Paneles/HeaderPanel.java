package Paneles;

import java.awt.*;
import javax.swing.*;

public class HeaderPanel extends JPanel {

    public HeaderPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.PINK);
        setBorder(BorderFactory.createLineBorder(Color.PINK, 2));

        JLabel nombreHospital = new JLabel("Hospital SCL / Jennifer Gonzalez"); 
        nombreHospital.setFont(new Font("SansSerif", Font.PLAIN, 18));
        nombreHospital.setHorizontalAlignment(SwingConstants.LEFT);

        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(40, 40)); 
        logoPanel.setBackground(Color.PINK);               
        logoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 

        JPanel rightContainer = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        rightContainer.setOpaque(false); 
        rightContainer.add(logoPanel);

        this.add(nombreHospital, BorderLayout.CENTER);

        
    }

    public JPanel getPanel() {
        return this;
    }
}