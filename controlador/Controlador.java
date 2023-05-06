package controlador;

import vista.VentanaPrincipal;
import java.awt.event.*;
import javax.swing.JOptionPane;
import modelo.PlanTelefonia;

public class Controlador implements ActionListener{

    private VentanaPrincipal venPrin;
    private PlanTelefonia plan;

    public Controlador(VentanaPrincipal pVenPrin, PlanTelefonia pPlan){
        this.venPrin = pVenPrin;
        this.plan = pPlan;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        String comando = ae.getActionCommand();

        // Comando para salir de la app
        if(comando.equals("salir")){
            System.exit(0);
        }

        // Comando para abrir el DialogoAgregarPlan
        if(comando.equals("calcular")){
            venPrin.crearDialogoAgregarPlan();
            this.venPrin.miDialogoAgregarPlan.agregarOyenteBoton(this);
        }

        // comando para agregar la reserva
        if(comando.equals("agregarPlan")){
            String numCelular = venPrin.miDialogoAgregarPlan.getNumeroCelular();
            String operador = venPrin.miDialogoAgregarPlan.getOperador();
            int numMinutos = Integer.parseInt(venPrin.miDialogoAgregarPlan.getTfCantidadMinutos());
            plan = new PlanTelefonia(numCelular, operador, numMinutos);
            venPrin.miDialogoAgregarPlan.cerrarDialogoAgregarVendedor();
            JOptionPane.showMessageDialog(venPrin, plan);
        }
    }
}