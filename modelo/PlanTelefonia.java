package modelo;

public class PlanTelefonia{

    private String numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private double valorminutos = 100;
    private double costoPlan;

    public PlanTelefonia(){

    }

    public PlanTelefonia(String pNumeroCelular, String pOperador, int pCantidadMinutos){
        this.numeroCelular = pNumeroCelular;
        this.operador = pOperador;
        this.cantidadMinutos = pCantidadMinutos;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getCantidadMinutos() {
        return cantidadMinutos;
    }

    public void setCantidadMinutos(int cantidadMinutos) {
        this.cantidadMinutos = cantidadMinutos;
    }

    public double getValorminutos() {
        return valorminutos;
    }

    public void setValorminutos(double valorminutos) {
        this.valorminutos = valorminutos;
    }

    public double getCostoPlan() {
        calcularCostoPlan();
        return costoPlan;
    }

    public void setCostoPlan(double costoPlan) {
        this.costoPlan = costoPlan;
    }

    public void calcularCostoPlan(){
        if(operador.equals("Wom")){
            costoPlan = (cantidadMinutos * valorminutos)*0.5;
        }else{
            costoPlan = cantidadMinutos * valorminutos;
        }
    }

    public String toString(){
        return "Información del Plan" + "\nOperador: " + getOperador() + "\nNúmero: " + getNumeroCelular() + "\nCosto plan: " + getCostoPlan();
    }
}