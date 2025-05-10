//crear anotaciones del paquete javax.swing 
import javax.swing.JFrame; //cerar la ventana
import javax.swing.JLabel; //crear texto

//declaracion de la clase principal
public class main {

    public static void main(String[] args) {
        
        //crear una ventana con JFrame
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital"); //poner titulo 
        miVentana.setSize(1000,800); //establecer el tamaño de la ventana (altura x ancho)
        miVentana.setVisible(true); //hacer visible la ventana
     
        //crear una etiqueta de texto con JLabel
        JLabel texto = new JLabel();
        texto.setText("Hola mundo"); //establecet el texto que se mostrara en la etiqueta 
        miVentana.add(texto); //agregar la etiqueta la ventana
    
        miVentana.setVisible(true); //asegurarse que la etiqueta sigua siendo visible 

        }
        
    }
