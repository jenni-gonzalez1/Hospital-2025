package Paneles;

import java.awt.*;
import javax.swing.*;

public class MenuLateralPanel extends JPanel {

    public MenuLateralPanel() {

        setPreferredSize(new Dimension(300, 0)); 
        setBackground(new Color(230, 230, 230)); 

        setBorder(BorderFactory.createLineBorder(Color.PINK, 2));

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        String[] Botones = {
            "Ver historial del paciente",
        };

        for (String texto : Botones) {
            JButton boton = new JButton(texto);

            boton.setFocusPainted(false);

            boton.setBackground(Color.PINK);

            boton.setForeground(Color.BLACK);

            boton.setFont(new Font("SansSerif", Font.PLAIN, 16));

            boton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

            boton.setMaximumSize(new Dimension(300, 50));
            boton.setMinimumSize(new Dimension(300, 50));
            boton.setPreferredSize(new Dimension(300, 50));

           
            boton.setAlignmentX(Component.CENTER_ALIGNMENT);

            add(Box.createVerticalStrut(10));

            add(boton);
        }

        add(Box.createVerticalGlue());
    }

    public JPanel getPanel() {
        return this;
    }
}