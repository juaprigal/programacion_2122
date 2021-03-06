//Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_8 {

    public static void main(String[] args) {

        double a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("a= ");
        a = scanner.nextDouble();

        System.out.println("b= ");
        b = scanner.nextDouble();

        System.out.println("c= ");
        c = scanner.nextDouble();

        //Calculamos el discriminante (b2 - 4 * a * c)
        double raiz = ((b * b) - (4 * a * c));


        double X1 = ((0 - b)) + (Math.sqrt(raiz)) / (2 * a);
        double X2 = ((0 - b)) - (Math.sqrt(raiz)) / (2 * a);

        System.out.println("Los resultados son " + X1 + " y " + X2);

    }
}
