import java.util.Scanner;
public class DawBank {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


//        datos oscar = new datos(" ES9121000418450200051332", "Oscar-Lanza", 67.23);
//        System.out.println("Titular: " + oscar.getTitular());
//        System.out.println("Iban:" +  oscar.getIban());
//        System.out.println("Saldo:" + oscar.getSaldo());
//
//
//        movimientos Oscar_Movimientos = new movimientos(67, 67, "709823409A", "27 Julio 2025");
//        System.out.println("ingreso:" + Oscar_Movimientos.getingreso());
//        System.out.println("retirada:" + Oscar_Movimientos.getretirada());
//        System.out.println("IDmovimiento:" + Oscar_Movimientos.getIDmovimiento());
//        System.out.println("fecha:" + Oscar_Movimientos.getfecha());






        //Primero pondremos para que el usuario ponga sus datos


        System.out.println("*******************************");
        System.out.println("Bienvenido a tu cuenta de banco");
        System.out.println("*******************************");

<<<<<<< HEAD:Daw-Bank-Oscar-Lanza/src/DawBank.java
=======
        datos MiCuenta = new datos(sc.nextLine(), sc.nextLine(), sc.nextDouble());

        MiCuenta.getIban();
        MiCuenta.getTitular();
        MiCuenta.getSaldo();

        movimientos MisMovimientos = new movimientos(sc.nextDouble(), sc.nextDouble(), sc.nextLine(), sc.nextLine());

        MisMovimientos.getfecha();
        MisMovimientos.getingreso();
        MisMovimientos.getIDmovimiento();
        MisMovimientos.getretirada();

>>>>>>> e5f878c32cacf9eff41473f42e10dc9e75415787:Daw-Bank-Oscar-Lanza/src/Main.java

        int opcion = 0;
        while (opcion != 6){

            System.out.println("Pulse 1 para crear una cuenta: ");

            System.out.println("Pulse 2 para ver la informacion de la cuneta ya creada:");

            System.out.println("Pulse 3 para ingresar dinero:");

            System.out.println("Pulse 4 para retirar dinero:");

            System.out.println("Pulse 5 para mostrar los movimientos realizados en esta cuenta:");

            System.out.println("Pulse 6 para salir del programa");

            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
<<<<<<< HEAD:Daw-Bank-Oscar-Lanza/src/DawBank.java
                    CuentaBancaria MiCuenta = new CuentaBancaria(sc.nextLine(), sc.nextLine(), sc.nextDouble());
                    System.out.println("ingrese su IBAN");
                    System.out.println("Ejemplo de IBAN: ES91 2100 0418 4502 0005 1332");
                    MiCuenta.getIban();
                    MiCuenta.setIban(sc.nextLine());
                    System.out.println("Ingrese el nombre del titular ");
                    MiCuenta.getTitular();
                    MiCuenta.setTitular(sc.nextLine());
                    System.out.println("Saldo del titular: " + MiCuenta.getSaldo());
                    break;
=======

                break;

                case 2:

                break;

                case 3:
                break;
>>>>>>> e5f878c32cacf9eff41473f42e10dc9e75415787:Daw-Bank-Oscar-Lanza/src/Main.java
            }


        }



    }
}