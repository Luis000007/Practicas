package Java.Intermedio.Practicas.Math;

import java.util.Scanner;

public class FloorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número decimal
        System.out.println("Ingresa un número decimal: ");
        double num = scanner.nextDouble();

        // Redondear hacia abajo usando Math.floor()
        double floorValue = Math.floor(num);

        // Imprimir el resultado
        System.out.println("El valor redondeado hacia abajo es: " + floorValue);
    }
}

        // Redondea un numero decimal hacia el entero mas cercano hacia abajo, por ejemplo: 45.90 = 45