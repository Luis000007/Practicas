package Java.Estructura_de_datos.pilas.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class MetodoCola {
    public static void main(String[] args) {

        Queue<Integer> cola = new LinkedList<Integer>(); // Asignación correcta de la cola

        // Agregar elementos a la cola
        cola.add(10);
        cola.add(20);
        cola.add(30);
        cola.add(40);
        cola.add(50);
        cola.add(60);

        // Mostrar el elemento en el frente de la cola
        System.out.println("Elemento que está al inicio de la cola: " + cola.peek());

        // Mostrar el tamaño de la cola
        int tamano = cola.size();
        System.out.println("El tamaño de la cola es: " + tamano);

        // Vaciando los elementos de la cola
        System.out.println("Vaciando los elementos de la cola:");
        while (!cola.isEmpty()) {
            System.out.println("Elemento removido de la cola: " + cola.remove());
        }
    }
}
