package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelOperaciones extends JPanel{
    
    // Creación de botones
    public JButton bCalcularPlan;
    public JButton bSalir;
    public JLabel lbTitulo;
   
    public PanelOperaciones(){

        this.setLayout(null);
        this.setBackground(Color.decode("#00BFFF"));

        //Creación del boton Calcular Plan
        bCalcularPlan = new JButton("Calcular Plan");
        bCalcularPlan.setFont(new Font("Arial",Font.BOLD, 15));
        bCalcularPlan.setActionCommand("calcular");
        bCalcularPlan.setBounds(70,60,150,50);
        bCalcularPlan.setBackground(Color.decode("#F5FFFA"));
        this.add(bCalcularPlan);

        // Etiqueta titulo
        lbTitulo = new JLabel("Plan Telefonía");
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setBounds(65, 20, 200, 30);
        this.add(lbTitulo);

        // Creación del boton salir
        bSalir = new JButton("Salir");
        bSalir.setActionCommand("salir");
        bSalir.setFont(new Font("Arial",Font.BOLD, 15));
        bSalir.setBounds(70,140,150,50);
        bSalir.setBackground(Color.decode("#F5FFFA"));
        this.add(bSalir);
    }

    // oyentes de los botones
    public void agregarOyentesBotones(ActionListener pAL){
        bCalcularPlan.addActionListener(pAL);
        bSalir.addActionListener(pAL);
    }

}