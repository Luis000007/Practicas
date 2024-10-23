package Java.Estructura_de_datos.pilas.Evidencia_2;

import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Tombola {

    private static PriorityQueue<Integer> ganadores = new PriorityQueue<>();

    private static HashSet<Integer> numerosGenerados = new HashSet<>();

    private static Hashtable<Integer, String> tablaPremios = new Hashtable<>();

    private static PriorityQueue<Integer> copiaGanadores = new PriorityQueue<>();

    public static void main(String[] args) {

        generarNumerosAleatorios(50);

        copiaGanadores.addAll(ganadores);

        asignarPremios();
        anunciarPremios();
    }

    public static void generarNumerosAleatorios(int cantidad) {
        Random random = new Random();

        if (ganadores.size() == cantidad) {
            return;
        }

        int num = random.nextInt(50) + 1;

        if (!numerosGenerados.contains(num)) {
            numerosGenerados.add(num);
            ganadores.add(num);
        }

        generarNumerosAleatorios(cantidad);
    }

    public static void asignarPremios() {

        String[] premiosArticulos = {"una licuadora", "un juego de herramientas", "una visita al spa", "una bicicleta", "un televisor",
                "una cafetera", "un microondas", "unos audífonos", "una tablet", "un celular"};

        ArrayList<String> premios = new ArrayList<>();

        for (String articulo : premiosArticulos) {
            premios.add("¡Felicidades! Ganaste " + articulo + "!");
        }

        for (int i = 0; i < 20; i++) {
            premios.add("¡Ganaste $50!");
        }

        for (int i = 0; i < 20; i++) {
            premios.add("Sigue participando!");
        }

        Collections.shuffle(premios);

        for (Integer numero : ganadores) {
            String premio = premios.remove(0);
            tablaPremios.put(numero, premio);
        }
    }

    public static void anunciarPremios() {
        while (!copiaGanadores.isEmpty()) {
            Integer numeroGanador = copiaGanadores.poll();

            if (numeroGanador != null && tablaPremios.containsKey(numeroGanador)) {
                System.out.println("Número ganador: " + numeroGanador + " - " + tablaPremios.get(numeroGanador));
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Error: La operación de sleep fue interrumpida.");
            }
        }
    }
}

