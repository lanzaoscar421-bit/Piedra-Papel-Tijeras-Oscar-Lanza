import java.util.Scanner;
public class DawBank {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        //Primero pondremos para que el usuario ponga sus datos

        System.out.println("************************************");
        System.out.println("Bienvenido a tu cuenta de banco🧃✡️");
        System.out.println("************************************");

        System.out.println("Inserte el Iban");
        String Iban = sc.nextLine();
        System.out.println("Inserte el Titular de tu Cuenta Bancaria");     //Creamos cuenta primero ya que el usuario es tonto y puede ingresar dinero sin tener cuenta
        String Titular = sc.nextLine();

        CuentaBancaria Oscar = new CuentaBancaria(Iban, Titular);  //Creamos un objeto el cual es mi cuenta bancaria





        int opcion = 0;
        while (opcion != 8){

            System.out.println("Pulse 1 para acceder a los datos de la cuenta ");

            System.out.println("Pulse 2 para ver el Iban");

            System.out.println("Pulse 3 para mostrar el titular");

            System.out.println("Pulse 4 para mostrar el saldo");

            System.out.println("Pulse 5 para insertar dinero en la cuenta");

            System.out.println("Pulse 6 para retirar Dinero");

            System.out.println("Pulsa 7 para ver los movimientos realizados de la cuenta");

            System.out.println("Pulse 8 para salir de este programa");

            opcion = sc.nextInt();


            switch (opcion) {
                case 1:

                    System.out.println("Esta es tu informacion de la cuenta");
                    Oscar.InformacionCuenta();
                    System.out.println(Oscar.InformacionCuenta());

                    break;

                case 2:

                    System.out.println("Este es tu Iban: ");
                    System.out.println(Oscar.getIban()); //Ponemos Get para llamar al Iban de Cuenta Bancaria

                break;

                case 3:
                    System.out.println("Este es tu Titular: ");
                    System.out.println(Oscar.getTitular());

                break;
                case 4:
                    System.out.println("Este es tu Saldo: ");
                    System.out.println(Oscar.getSaldo());

                break;
                case 5:
                    System.out.println("Inserte la cantidad de dinero que desee ");

                break;
            }


        }



    }
}