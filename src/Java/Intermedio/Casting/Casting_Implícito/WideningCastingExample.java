package Java.Intermedio.Casting.Casting_Implícito;

public class WideningCastingExample {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Casting implícito de int a double

        System.out.println("Valor int: " + myInt);     // Output: Valor int: 9
        System.out.println("Valor double: " + myDouble); // Output: Valor double: 9.0
    }
}
