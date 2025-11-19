import javax.xml.crypto.dom.DOMCryptoContext;

public class Movimientos {

    private double ingreso;
    private double retirada;
    private int IDmovimiento;
    private String fecha;
    private double Cantidad;
    private String Tipo;

    //Constructores
    public Movimientos(double cantidad, String tipo) { //No ponemos arriba ni su Idmovimiento, Fecha ni su Fecha porque no tiene sentido de que el usuario lo modifique
        this.IDmovimiento = IDmovimiento;
        this.fecha = fecha;
        this.Cantidad=cantidad;
        this.Tipo=tipo;
    }

    //Getters-Setters

    public double getingreso() {
        return ingreso; //No setter porque una vez hecho el ingreso no se puede modificar
    }
    public double getretirada() {
        return retirada;//No setter porque una vez hecho la retirada no se puede modificar
    }
    public int getIDmovimiento() {
        return IDmovimiento;
    }
    public String getfecha() {
        return fecha;
    }
    public double getCantidad(){
        return this.Cantidad;
    }
    public String getTipo(){
        return  this.Tipo;
    }
     //Metodos

    public String InformacionMovimiento(){ //Queremos almacenar tod0 para despues imprimir en el Main
        String Info = "";
        Info+="Ingreso: " + this.Cantidad + "\n";
        Info+="IDmovimiento: " + this.IDmovimiento + "\n";
        Info+="Fecha: " + this.fecha + "\n";
        Info+="Tipo: " + this.Tipo + "\n";
        return Info;
    }


}
