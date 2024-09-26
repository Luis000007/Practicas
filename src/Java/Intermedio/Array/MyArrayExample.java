package Java.Intermedio.Array;

public class MyArrayExample {
    public static void main(String[] args) {

        // Declaración y asignación de un array de enteros con 5 elementos
        int[] numbers = {10, 20, 30, 40, 50};

        // Acceder y mostrar cada elemento del array utilizando un bucle for
        System.out.println("Los elementos del arreglo son:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + numbers[i]);
        }

        // Modificar un valor en el array
        numbers[2] = 100; // Cambia el tercer elemento (índice 2) de 30 a 100

        // Mostrar el array después de la modificación
        System.out.println("\nDespués de modificar el tercer elemento:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + numbers[i]);
        }
    }
}
