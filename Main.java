//crear anotaciones del paquete javax.swing 
import java.awt.BorderLayout;  // Permite usar un layout que organiza en Norte, Sur, Este, Oeste y Centro
import java.awt.Color; // Permite usar colores predefinidos
import java.awt.Dimension;  // Se usa para definir dimensiones (ancho y alto)

import javax.swing.*;  //cerar la ventana

import Vistas.LoginPanel; 


//declaracion de la clase principal
public class Main {

    public static void main(String[] args) {
        
        //crear una ventana con JFrame
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");   
        miVentana.setSize(1000,800);    //(altura x ancho)
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Al cerrar la ventana, el programa termina completamente
        miVentana.setLayout(new BorderLayout());   //(NORTE, SUR, ESTE, OESTE, CENTRO)
        
        //panel banner 
        JPanel panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,800)); // Establecer tamaño preferido del panel
        panelBanner.setOpaque(true);     // Hacer que el fondo del panel sea visible
        panelBanner.setBackground(Color.red);
        miVentana.add(panelBanner,BorderLayout.WEST);  // Añadir el panel a la parte izquierda (WEST) de la ventana

        //panel login
        LoginPanel panelLogin = new LoginPanel();   // Crear una instancia del panel de login personalizado
        miVentana.add(panelLogin.getPanel(), BorderLayout.CENTER);  // Añadir el panel de login en el centro de la ventana
        
        miVentana.setVisible(true);    //asegurarse que la etiqueta sigua siendo visible   

        }
        
    }
