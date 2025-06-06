package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //paso 1 importar todas las clases

import javax.swing.*;

import Ventanas.DashBoard;

public class LoginPanel { 
    
    
    private JPanel panelLogin;

    public LoginPanel() {

        panelLogin = new JPanel(); 
        panelLogin.setOpaque(true);
        panelLogin.setBackground(Color.PINK);
        panelLogin.setLayout(new GridBagLayout());

        //Administrador de diseño
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        //Titulo
        JLabel titulo = new JLabel("Login", SwingConstants.CENTER);
        gbc.anchor= GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        panelLogin.add(titulo, gbc);

        //Entrada Uusuario
        JTextField entradacorreo = new JTextField("Usuario:");
        gbc.gridy = 1;
        gbc.gridx = 1;

        panelLogin.add(entradacorreo, gbc);

        //Entrada contraseña
        JLabel labelContrasena = new JLabel("Usuario:"); 
        JPasswordField entradaContraseña = new JPasswordField();
        entradaContraseña.setSize(new Dimension(100,80));
        gbc.gridx =2;
        gbc.gridx =0;
        panelLogin.add(entradaContraseña, gbc);

        //Boton 
        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setPreferredSize(new Dimension(50,50));
        gbc.gridx =1;
        gbc.gridx =3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        panelLogin.add(btnIngresar, gbc);

        //datos del ususario temporal
        String usuario ="Jgonzalez";
        String contraseña = "jgonzalez123";

        //codigo del boton -------------------------------------------------
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                

            }
        });

        }

    public JPanel getPanel() { 
        return panelLogin;
    }

    
}
