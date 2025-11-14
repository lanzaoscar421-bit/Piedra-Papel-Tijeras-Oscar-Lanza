import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        datos oscar = new datos(" ES9121000418450200051332", "Oscar-Lanza", 67.23);
        System.out.println("Titular: " + oscar.getTitular());
        System.out.println("Iban:" +  oscar.getIban());
        System.out.println("Saldo:" + oscar.getSaldo());


        movimientos Oscar_Movimientos = new movimientos(67, 67, "709823409A", "27 Julio 2025");
        System.out.println("ingreso:" + Oscar_Movimientos.getingreso());
        System.out.println("retirada:" + Oscar_Movimientos.getretirada());
        System.out.println("IDmovimiento:" + Oscar_Movimientos.getIDmovimiento());
        System.out.println("fecha:" + Oscar_Movimientos.getfecha());



        //Primero pondremos para que el usuario ponga sus datos



        String titular = "", iban = "", saldo = "";
        System.out.println("Pon el nombre de la persona titular: ");
        titular = sc.nextLine();
        System.out.println("Pon el tu iban: ");
        iban = sc.nextLine();
        System.out.println("Inserte el saldo:");
        saldo = sc.nextLine();





    }
}