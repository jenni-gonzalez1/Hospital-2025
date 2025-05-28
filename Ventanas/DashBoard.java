package Ventanas;
import javax.swing.JFrame;

 public class DashBoard extends JFrame{
 
    public DashBoard() {

        this.setTitle("Doctor mARCOS");
        this.setSize(1000,1900);
        this.setLayout(null);
        
        this.setVisible(true);
    }

    public JFrame getDashFrame() {
        return this;
    }
    
}