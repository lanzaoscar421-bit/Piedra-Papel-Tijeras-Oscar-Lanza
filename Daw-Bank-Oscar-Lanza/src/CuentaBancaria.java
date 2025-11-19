public class CuentaBancaria {

    private String iban;
    private String titular;
    private double saldo;

    //Constructores
    public CuentaBancaria(String iban, String titular, double saldo) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
    }
//Getters y setter


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {

        if(saldo>0){
            System.out.println("Tienes dinero bro lo juro");
            this.saldo =saldo;
        }
        else{
            if(this.saldo<0){
                this.saldo = 0;
                System.out.println("Manin no tienes ni un puto duro");

            }
        }

    }





    //Mostrar informacion de la cuenta







}