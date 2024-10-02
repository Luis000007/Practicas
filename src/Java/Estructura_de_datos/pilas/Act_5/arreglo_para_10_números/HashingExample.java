package Java.Estructura_de_datos.pilas.Act_5.arreglo_para_10_números;

import java.util.Arrays;

public class HashingExample {

    public static void main(String[] args) {
        int[] array = new int[10]; // Arreglo de 10 posiciones
        Arrays.fill(array, -1); // Inicializamos el arreglo con -1 para indicar que está vacío

        // Los ocho primeros múltiplos de 17, revueltos
        int[] numeros = {55, 17, 34, 85, 2323, 54545, 444, 445};

        for (int num : numeros) {
            int posicion = num % 10; // Usamos la función hash f(x) = x % 10
            System.out.println("Intentando insertar el número " + num + " en la posición " + posicion);

            // Manejar colisiones
            while (array[posicion] != -1) { // Si la posición está ocupada...
                System.out.println("Colisión en la posición " + posicion + ", buscando la siguiente posición.");
                posicion = (posicion + 1) % 10; // Buscamos la siguiente posición libre
            }

            array[posicion] = num; // Insertamos el número en la posición libre
            System.out.println("Número " + num + " insertado en la posición " + posicion + "\n");
        }

        // Mostramos el arreglo final
        System.out.println("Arreglo final después de insertar los números:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
}
