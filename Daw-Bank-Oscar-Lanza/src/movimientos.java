public class Movimientos {

    private double ingreso;
    private double retirada;
    private String IDmovimiento;
    private String fecha;


    //Constructores
    public Movimientos(double ingreso, double retirada, String IDmovimiento, String fecha) {
        this.ingreso = ingreso;
        this.retirada = retirada;
        this.IDmovimiento = IDmovimiento;
        this.fecha = fecha;
    }

    //Getters-Setters

    public double getingreso() {
        return ingreso;
    }
    public void setingreso(double ingreso) {
        this.ingreso = ingreso;
    }
    public double getretirada() {
        return retirada;
    }
    public void setretirada(double retirada) {
        this.retirada = retirada;
    }
    public String getIDmovimiento() {
        return IDmovimiento;
    }
    public String getfecha() {
        return fecha;
    }



}
