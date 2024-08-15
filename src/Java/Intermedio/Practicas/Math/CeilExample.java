package Java.Intermedio.Practicas.Math;

import java.util.Scanner;

public class CeilExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número decimal
        System.out.println("Ingresa un número decimal: ");
        double num = scanner.nextDouble();

        // Redondear hacia arriba usando Math.ceil()
        double ceilValue = Math.ceil(num);

        // Imprimir el resultado
        System.out.println("El valor redondeado hacia arriba es: " + ceilValue);
    }
}

        // Redondea un numero decimal hacia el entero mas cercano hacia arriba, por ejemplo: 45.20 = 46