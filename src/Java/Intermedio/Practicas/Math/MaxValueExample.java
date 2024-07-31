package Java.Intermedio.Practicas.Math;

import java.util.Scanner;

public class MaxValueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.println("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Encontrar el mayor de los dos números usando Math.max()
        int max = Math.max(num1, num2);

        // Imprimir el resultado
        System.out.println("El mayor de los dos números es: " + max);
    }
}

        // Hace la comparativa de dos numeros para diferenciar el numero mas grande