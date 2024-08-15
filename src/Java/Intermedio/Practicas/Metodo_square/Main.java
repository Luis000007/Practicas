package Java.Intermedio.Practicas.Metodo_square;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Valor de x antes de llamar a square: " + x);

        // Llamada al método square
        int squaredValue = square(x);

        System.out.println("Valor de x al cuadrado: " + squaredValue);
    }

    // Definición del método square
    public static int square(int number) {
        return number * number;
    }
}
