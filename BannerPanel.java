
import javax.swing.JFrame;

 public class BannerPanel extends JFrame{
 
    public BannerPanel () { 
        this.setTitle("Doctor Marcos");
        this.setSize(500,800);
        this.setLayout(null);

        this.setVisible(true);
    }

    public JFrame getDashFrame() {
        return this;
    }
    
}