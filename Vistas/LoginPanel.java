package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //paso 1 importar todas las clases

import javax.swing.*;

import Ventanas.DashBoard;

public class LoginPanel { 
    
    private JPanel panelLogin;

    public LoginPanel() {

        JPanel panelLogin = new JPanel();
        panelLogin.setSize(500, 800);
        panelLogin.setOpaque(true);
        panelLogin.setBackground(Color.PINK);
        panelLogin.setLayout(new GridBagLayout());

        //Administrador de diseño
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 00, 50);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        //Titulo
        JLabel titulo = new JLabel();
        titulo.setHorizontalAlignment(SwingConstants. HORIZONTAL);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setPreferredSize(new Dimension(500,50));
        gbc.gridx = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelLogin.add(titulo, gbc);

        //Entrada correo
        JTextField entradacorreo = new JTextField();
        entradacorreo.setSize(new Dimension(100,80));
        gbc.gridx =1;
        gbc.gridx =1;
        panelLogin.add(entradacorreo, gbc);

        //Entrada contraseña
        JPasswordField entradaContraseña = new JPasswordField();
        entradaContraseña.setSize(new Dimension(100,80));
        gbc.gridx =1;
        gbc.gridx =1;
        panelLogin.add(entradaContraseña);

        //Boton 
        JButton btnIngresar = new JButton("iNngresar");
        btnIngresar.setPreferredSize(new Dimension(50,50));
        gbc.gridx =1;
        gbc.gridx =3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boton presionado"); // <--Mi codigo

                
                new  DashBoard().getDashFrame();
            }
        });

        }

    public JPanel getPanel() { 
        return panelLogin;
    }

    
}
