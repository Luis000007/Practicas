package Java.Estructura_de_datos.pilas.Act_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        List<Integer> numerosOriginales = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numerosOriginales.add(random.nextInt(100) + 1);
        }


        int[] arregloNumeros = numerosOriginales.stream().mapToInt(Integer::intValue).toArray();


        ordenacionInsercion(arregloNumeros);


        List<Integer> numerosOrdenados = new ArrayList<>();
        for (int num : arregloNumeros) {
            numerosOrdenados.add(num);
        }


        List<Integer> minimo = numerosOrdenados.subList(0, 5);
        List<Integer> maximo = numerosOrdenados.subList(numerosOrdenados.size() - 5, numerosOrdenados.size());


        System.out.println("Lista original: " + numerosOriginales);
        System.out.println();
        System.out.println("5 valores más bajos: " + minimo);
        System.out.println("5 valores más altos: " + maximo);
        System.out.println();
        System.out.println("Lista ordenada: " + numerosOrdenados);
    }


    public static void ordenacionInsercion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int clave = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = clave;
        }
    }
}

