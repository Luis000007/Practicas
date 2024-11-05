package Java.Estructura_de_datos.pilas.Act_9_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOrdenamiento {
    public static void main(String[] args) {
        List<Persona> listaOriginal = Main.generarPersonas();
        System.out.println("Lista original:");
        for (Persona persona : listaOriginal) {
            System.out.println(persona);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nElige el método de ordenamiento (1 para Burbuja, 2 para Selección): ");
        int metodo = scanner.nextInt();

        System.out.println("Elige el atributo para ordenar (nombre, edad, estatura): ");
        String atributo = scanner.next();

        List<Persona> listaOrdenada = new ArrayList<>(listaOriginal);
        if (metodo == 1) {
            Ordenamiento.burbuja(listaOrdenada, atributo);
        } else if (metodo == 2) {
            Ordenamiento.seleccion(listaOrdenada, atributo);
        } else {
            System.out.println("Método inválido.");
            return;
        }

        System.out.println("\nLista ordenada por " + atributo + " usando " +
                (metodo == 1 ? "Burbuja" : "Selección") + ":");
        for (Persona persona : listaOrdenada) {
            System.out.println(persona);
        }
    }
}
