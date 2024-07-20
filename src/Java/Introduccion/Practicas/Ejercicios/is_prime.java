package Java.Introduccion.Practicas.Ejercicios;

import java.util.Scanner;

public class is_prime {

    static String isPrime(int number) {
        // Caso especial: números menores o iguales a 1 no son primos
        if (number <= 1) {
            return "Isn't prime";
        }

        // Caso especial: 2 es primo
        if (number == 2) {
            return "Is prime";
        }

        // Inicializamos result como "Is prime"
        String result = "Is prime";

        // Iteramos desde 2 hasta la mitad del número
        for (int i = 2; i <= number / 2; ++i) {
            // Condición para número no primo
            if (number % i == 0) {
                result = "Isn't prime";
                break;
            }
        }

        // Devolvemos el resultado
        return result;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        String output = isPrime(number);
        System.out.println(output);
    }
}