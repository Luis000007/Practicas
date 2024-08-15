package Java.Intermedio.Practicas.Metodo_addOneTo;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Valor de x antes de llamar a addOneTo: " + x);

        // Llamada al método addOneTo
        int newValue = addOneTo(x);

        System.out.println("Valor de x después de llamar a addOneTo: " + newValue);
    }

    // Definición del método addOneTo
    public static int addOneTo(int number) {
        return number + 5;      // Puede modificarse el valor
    }
}
