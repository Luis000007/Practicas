package Java.Intermedio.ArrayList;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList de tipo String
        ArrayList<String> listaFrutas = new ArrayList<>();

        // Agregar elementos al ArrayList
        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Mango");

        // Mostrar el ArrayList
        System.out.println("Lista de frutas: " + listaFrutas);
        System.out.println();

        // contains(): Verificar si el ArrayList contiene un elemento específico
        String frutaBuscar = "Banana";
        if (listaFrutas.contains(frutaBuscar)) {
            System.out.println("La lista contiene: " + frutaBuscar);
            System.out.println();
        } else {
            System.out.println("La lista no contiene: " + frutaBuscar);
            System.out.println();
        }

        // get(int index): Obtener el elemento en el índice especificado
        int index = 2;
        System.out.println("Fruta en el índice " + index + ": " + listaFrutas.get(index));
        System.out.println();

        // size(): Obtener el número de elementos en el ArrayList
        System.out.println("Número de frutas en la lista: " + listaFrutas.size());
        System.out.println();

        // clear(): Limpiar el ArrayList
        listaFrutas.clear();
        System.out.println("Lista de frutas después de clear(): " + listaFrutas);
        System.out.println("Número de frutas después de clear(): " + listaFrutas.size());
        System.out.println();
    }
}
