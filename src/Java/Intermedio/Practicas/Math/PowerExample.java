package Java.Intermedio.Practicas.Math;

import java.util.Scanner;

public class PowerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la base y el exponente
        System.out.println("Ingresa la base: ");
        double base = scanner.nextDouble();

        System.out.println("Ingresa el exponente: ");
        double exponente = scanner.nextDouble();

        // Calcular la potencia usando Math.pow()
        double resultado = Math.pow(base, exponente);

        // Imprimir el resultado
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
    }
}

        // Bastante util para asignar una base y un exponente