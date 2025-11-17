public class datos {

    private String iban;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String titular;
    private double saldo;

    //Constructores
    public datos(String iban, String titular, double saldo) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
    }
//Getters y setter


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;

    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;

    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = nombre+ "" + apellidos;
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