package paqueteuno;
public class FacturaTelefono {
    private String numeroTelefono;
    private double minutosMes;
    private double valorMinuto;
    private double valorFactura;
    public void establecerNumeroTelefono(String c){
        this.numeroTelefono = c;
    }
    public void establecerMinutosMes(double c){
        this.minutosMes = c;
    }
    public void establecerValorMinuto(double c){
        this.valorMinuto = c;
    }
    public void calcularValorFactura(){
        this.valorFactura = this.minutosMes * this.valorMinuto;
        establecerValorFactura(valorFactura);
    }
    public void establecerValorFactura(double valorFactura){
        this.valorFactura = valorFactura;
    }
    public String obtenerNumeroTelefono(){
        return this.numeroTelefono;
    }
    public double obtenerMinutosMes(){
        return this.minutosMes;
    }
    public double obtenerValorMinuto(){
        return valorMinuto;
    }
    public double obtenerValorFactura(){
        return valorFactura;
    }
}
