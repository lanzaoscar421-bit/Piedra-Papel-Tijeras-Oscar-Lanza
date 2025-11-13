public class datos {

    private String iban;
    private String titular;
    private double saldo;

//Constructores
public datos (String iban, String titular, double saldo){
    this.iban = iban;
    this.titular = titular;
    this.saldo = 0;
}
//Getters y setter


    public String getIban() {
        return iban;
    }
    public String getTitular() {
    return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
    return saldo;
    }
    public void setSaldo(double saldo) {
    this.saldo = saldo;
    }

}