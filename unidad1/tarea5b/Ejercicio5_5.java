//Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
//
//Ejemplo 1:
//Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//Por favor, introduzca el valor de a: 2
//Ahora introduzca el valor de b: 1
//x = -0.5
//
//
//Ejemplo 2:
//Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//Por favor, introduzca el valor de a: 0
//Ahora introduzca el valor de b: 7
//Esa ecuación no tiene solución real.

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_5 {

    public static void main(String[] args) {

        double a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca el valor de a: ");
        a = scanner.nextDouble();

        System.out.println("Ahora introduzca el valor de b: ");
        b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Esta ecuación no tiene una solución real");
        } else {
            //2x + 1 = 0 -> x = (0 - b(1)) / a(b)
            double x = ((0 - b) / a);
            System.out.println("x=" + x);
        }
    }
}
