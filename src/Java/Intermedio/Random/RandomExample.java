package Java.Intermedio.Random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Generar un número entero aleatorio
        int randomInt = random.nextInt(10); // Número entre 0 (inclusive) y 10 (exclusivo)
        System.out.println("Número entero aleatorio (entre 0 y 9): " + randomInt);

        // Generar un número decimal aleatorio
        double randomDouble = random.nextDouble();  // Número entre 0.0 y 1.0
        System.out.println("Número decimal aleatorio (entre 0.0 y 1.0): " + randomDouble);

        // Generar un número booleano aleatorio
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Booleano aleatorio: " + randomBoolean);
    }
}
