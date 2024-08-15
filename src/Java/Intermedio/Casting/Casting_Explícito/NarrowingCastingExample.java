package Java.Intermedio.Casting.Casting_Explícito;

public class NarrowingCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Casting explícito de double a int

        System.out.println("Valor double: " + myDouble); // Output: Valor double: 9.78
        System.out.println("Valor int: " + myInt);       // Output: Valor int: 9

    }
}
