package vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoAgregarPlan extends JDialog {

    // Atributos
    private JLabel lbNumeroCelular;
    private JTextField tfNumeroCelular;
    private JButton btAgregarPlan;
    private JLabel lbOperador;
    private JComboBox cOperador;
    private JLabel lbCantidadMinutos;
    private JTextField tfcantidadMinutos;

    // metodos

    public DialogoAgregarPlan(){

        this.setLayout(null);

        // combo box de los operadores
        cOperador = new JComboBox();
        cOperador.setBounds(160, 30, 100, 25);
        cOperador.addItem("Wom");
        cOperador.addItem("Claro");
        cOperador.addItem("Movistar");
        this.add(cOperador);
        // Etiqueta del operador
        lbOperador = new JLabel("Operador:");
        lbOperador.setBounds(40,30,140,20);
        this.add(lbOperador);

        // Número de celular etiqueta
        lbNumeroCelular = new JLabel("Número Celular:");
        lbNumeroCelular.setBounds(40,70,140,20);
        this.add(lbNumeroCelular);
        // Cuadro de texto del número de celular
        tfNumeroCelular = new JTextField();
        tfNumeroCelular.setBounds(160,70,100, 25);
        this.add(tfNumeroCelular);

        // Etiqueta cantidad minutos
        lbCantidadMinutos = new JLabel("Minutos:");
        lbCantidadMinutos.setBounds(40,110,140,20);
        this.add(lbCantidadMinutos);
        // Cuadro de texto Cantidad de minutos
        tfcantidadMinutos = new JTextField();
        tfcantidadMinutos.setBounds(160,110,100, 25);
        this.add(tfcantidadMinutos);

        // Boton para agregar Plan
        btAgregarPlan = new JButton("Agregar");
        btAgregarPlan.setBounds(20,210,260,25);
        btAgregarPlan.setActionCommand("agregarPlan");
        this.add(btAgregarPlan);

        //Caracteristicas de la ventana
        this.setTitle("Agregar Plan");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    
    //Metodos de acceso

    // Getters
    public String getNumeroCelular(){
        return tfNumeroCelular.getText();
    }

    public String getOperador(){
        return (String) (cOperador.getSelectedItem());
    }

    public String getTfCantidadMinutos(){
        return tfcantidadMinutos.getText();
    }

    // Setters
    public void setNumeroCelular(JTextField tfNumeroCelular){
        this.tfNumeroCelular = tfNumeroCelular;
    }

    public void setOperador(JComboBox cOperador){
        this.cOperador = cOperador;
    }

    public void setcantidadMinutos(JTextField tfcantidadMinutos){
        this.tfcantidadMinutos = tfcantidadMinutos;
    }

    // oyente del boton agregar
    public void agregarOyenteBoton(ActionListener pAL){
        btAgregarPlan.addActionListener(pAL);
    }

    // Cerrar la ventana emergente
    public void cerrarDialogoAgregarVendedor(){
        this.dispose();
    }
}
