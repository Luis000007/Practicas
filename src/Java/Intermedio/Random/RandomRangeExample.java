package Java.Intermedio.Random;

import java.util.Random;

public class RandomRangeExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Generar un número entre 50 y 100
        int min = 50;
        int max = 100;
        int randomNumber = random.nextInt((max - min) + 1) + min; // (max - min) + 1 asegura que se incluya el límite superior
        System.out.println("Número aleatorio entre 50 y 100: " + randomNumber);
    }
}


/*

nextInt(): Genera un número entero aleatorio. Puedes pasarle un límite superior.
nextDouble(): Genera un número decimal entre 0.0 y 1.0.
nextBoolean(): Genera un valor true o false.
nextLong(): Genera un número long aleatorio.
nextFloat(): Genera un número float entre 0.0 y 1.0.

 */