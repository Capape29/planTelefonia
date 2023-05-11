package vista ;

import javax.swing.JFrame;
import java.awt.Color ;

public class VentanaPrincipal extends JFrame{

    //Atributos
    public PanelOperaciones miPanelOperaciones;
    public DialogoAgregarPlan miDialogoAgregarPlan = null; 

    public VentanaPrincipal(){
        this. setLayout(null);
        this.setBackground(Color.WHITE);

        // Creación panel operaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,10,280,240);
        this.add(miPanelOperaciones);

        //Caracteristicas de la ventana
        this.setTitle("Camilo Palacio");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }  
    
    //Crear dialogo agregarsalon
    public void crearDialogoAgregarPlan(){
        miDialogoAgregarPlan = new DialogoAgregarPlan();
    }
}