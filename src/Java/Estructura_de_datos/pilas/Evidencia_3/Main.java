package Java.Estructura_de_datos.pilas.Evidencia_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        M_Ordenamiento mOrdenamiento = new M_Ordenamiento();


        List<Integer> numerosOriginales = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            numerosOriginales.add(random.nextInt(10000));
        }


        String[] metodos = {
                "Burbuja", "Selección", "Inserción", "QuickSort", "MergeSort", "HeapSort"
        };


        for (String metodo : metodos) {

            List<Integer> listaClonada = new ArrayList<>(numerosOriginales);
            int[] arregloClonado = listaClonada.stream().mapToInt(Integer::intValue).toArray();


            long startTime = System.nanoTime();
            switch (metodo) {
                case "Burbuja":
                    mOrdenamiento.burbuja(arregloClonado);
                    break;
                case "Selección":
                    mOrdenamiento.seleccion(arregloClonado);
                    break;
                case "Inserción":
                    mOrdenamiento.insercion(arregloClonado);
                    break;
                case "QuickSort":
                    mOrdenamiento.quickSort(arregloClonado, 0, arregloClonado.length - 1);
                    break;
                case "MergeSort":
                    mOrdenamiento.mergeSort(arregloClonado, 0, arregloClonado.length - 1);
                    break;
                case "HeapSort":
                    mOrdenamiento.heapSort(arregloClonado);
                    break;
            }
            long endTime = System.nanoTime();

            // Imprimir resultados
            System.out.println("Método: " + metodo);
            System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " nanosegundos");
            System.out.println("Comparaciones: " + mOrdenamiento.getComparaciones());
            System.out.println("Iteraciones: " + mOrdenamiento.getIteraciones());
            System.out.println("Llamadas a función: " + mOrdenamiento.getLlamadasAFuncion());
            System.out.println("===================================================================");
        }
    }
}
