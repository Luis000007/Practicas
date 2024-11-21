package Java.Estructura_de_datos.pilas.Act_12;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numerosOriginales = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numerosOriginales.add(random.nextInt(100) + 1);
        }

        List<Integer> numerosClonados = new ArrayList<>(numerosOriginales);

        Collections.sort(numerosClonados);

        List<Integer> minimo = numerosClonados.subList(0, 5);
        List<Integer> maximo = numerosClonados.subList(numerosClonados.size() -5, numerosClonados.size());


        System.out.println("Lista original: " + numerosOriginales);
        System.out.println();
        System.out.println("5 valores mas altos: " + maximo);
        System.out.println("5 valores mas bajos: " + minimo);

    }
}
