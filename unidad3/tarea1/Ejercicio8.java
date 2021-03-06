// Escribir una función a la que se le pase un número entero y devuelva el número de divisores
// primos que tiene.

package unidad3.tarea1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int num = scanner.nextInt();

        int contador = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0 && fEsPrimo(i)) {
                contador++;
            }
        }
        System.out.println(contador);
    }

    public static boolean fEsPrimo(int num) {

        boolean esPrimo = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}
