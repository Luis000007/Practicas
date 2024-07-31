package Java.Intermedio.Practicas.Math;

import java.util.Scanner;

public class MinValueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.println("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Encontrar el menor de los dos números usando Math.min()
        int min = Math.min(num1, num2);

        // Imprimir el resultado
        System.out.println("El menor de los dos números es: " + min);
    }
}

        // Min devuelve compara valores y devuelve el valor mas pequeño