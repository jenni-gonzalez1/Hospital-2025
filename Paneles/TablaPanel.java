package Paneles; 
// Esta línea indica en qué "paquete" está esta clase.
// Un paquete es una forma de organizar tus archivos Java (como carpetas).

import Data.Pacientes;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaPanel extends JScrollPane {
    
    public TablaPanel() {

        String[] columnas = { "ID", "Nombre", "Edad" };

        Object[][] datos= new Pacientes().getDatos();

        DefaultTableModel base = new DefaultTableModel(datos, columnas);

        JTable tabla = new JTable(base);
       
        this.setViewportView(tabla);
       
    }
}