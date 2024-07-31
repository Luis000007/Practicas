package Java.Intermedio.Practicas.Math;

import java.util.Scanner;

public class RoundExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número decimal
        System.out.println("Ingresa un número decimal: ");
        double num = scanner.nextDouble();

        // Redondear al entero más cercano usando Math.round()
        long roundValue = Math.round(num);

        // Imprimir el resultado
        System.out.println("El valor redondeado al entero más cercano es: " + roundValue);
    }
}

        // El Math.round redondea el valor deimal al entero mas cercano