public class CuentaBancaria {

    private String iban;
    private String titular;
    private double saldo;

    //Constructores
    public CuentaBancaria(String iban, String titular) {
        this.iban = iban; // El usuario puede meter el Iban que quiera
        this.titular = titular;//El usuario puede meter el Titular que quiera
        this.saldo = 0;// Al ser siempre 0 no pongo arriba, double Saldo
    }
    //Getters y setter
    //Getter para que se pueda acceder desde otra clase como main
    //Setter para modificar el valor
    //Y en las anteriores no pongo setters por el motivo de que no tiene sentido cambiar el valor


    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(){

    }

    //Mostrar informacion de la cuenta
    //Ahora pondremos public ya que queremos que se vea la informacion en las otras clases

    public String InformacionCuenta(){ //Esto serviria para poner toda la informacion que el usuario ah metido desde el main
        String Info = "";
        Info+="Iban: " + this.iban + "\n";//Ponemos this para que  pille el valor original
        Info+="Titular: " + this.titular + "\n";
        Info+="Saldo: " + this.saldo + "\n";
        return Info; //Ponemos return Info ya que devuelve la informacion Info

    }








}