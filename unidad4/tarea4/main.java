package unidad4.tarea4;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Crearemos la cuenta corriente
        System.out.println("Introduzce el nombre del banco");
        String banco = scanner.nextLine();
        System.out.println("Introduce el nombre completo");
        String nombreCliente = scanner.nextLine();
        System.out.println("introduce el DNI");
        String DNI = scanner.next();
        cuentaCorriente c1 = new cuentaCorriente(nombreCliente, DNI, banco);

        //Sobrecargar el constructor
        int saldoBanco = 40;
        cuentaCorriente c2 = new cuentaCorriente(saldoBanco);

        //Volvemos a sobrecargar el constructor
        int limite = 0;
        cuentaCorriente c3 = new cuentaCorriente(saldoBanco, limite, DNI);

        //Sacar dinero
        System.out.println("Introduce la cantidad que desea retirar");
        int cantidad = scanner.nextInt();

        c1.sacarDinero(cantidad);

        //Ingresar dinero

        System.out.println("Introduce la cantidad que desea ingresar");
        int ingresar = scanner.nextInt();

        c1.ingresarDinero(ingresar);

        //Muestra la informacion de la cuenta
        c1.informacion();
    }
}
