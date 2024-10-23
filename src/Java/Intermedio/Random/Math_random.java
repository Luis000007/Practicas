package Java.Intermedio.Random;

public class Math_random {
    public static void main(String[] args) {
        double randomValue = Math.random();
        System.out.println("Número aleatorio (entre 0.0 y 1.0): " + randomValue);

        // Si quieres un número entero aleatorio entre 0 y 10, puedes hacer algo como esto:
        int randomInt = (int) (Math.random() * 11);  // Multiplicamos por 11 para que incluya el 10
        System.out.println("Número entero aleatorio (entre 0 y 10): " + randomInt);
    }
}
