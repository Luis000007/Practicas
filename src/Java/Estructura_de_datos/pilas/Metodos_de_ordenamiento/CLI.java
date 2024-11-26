package Java.Estructura_de_datos.pilas.Metodos_de_ordenamiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class CLI {

    public static void main(String[] args) {

        List<Integer> numerosOriginales = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 5000; i++) {
            numerosOriginales.add(random.nextInt(5000) + 1);
        }


        int[] arregloNumeros = numerosOriginales.stream().mapToInt(Integer::intValue).toArray();

        Scanner scanner = new Scanner(System.in);
        int opciones;


        M_Ordenamiento ordenamiento = new M_Ordenamiento();

        do {


            System.out.println();
            System.out.println("Selecciona el metodo de ordenamiento de tu agrado:");
            System.out.println();
            System.out.println("1. Ordenamiento de Burbuja");
            System.out.println("2. Ordenamiento de Inserccion");
            System.out.println("3. Ordenamiento de Intercambio");
            System.out.println("4. Ordenamiento de Seleccion");
            System.out.println("5. Ordenamiento de Shell");
            System.out.println();
            System.out.println("6. Terminar programa");
            System.out.println();
            System.out.println("Selecciona una opcion: ");

            opciones = scanner.nextInt();

            switch (opciones) {

                case 1:
                    System.out.println("\nOrdenamiento de Burbuja:");
                    ordenamiento.burbuja(arregloNumeros.clone());
                    break;

                case 2:
                    System.out.println("\nOrdenamiento de Inserción:");
                    ordenamiento.insercion(arregloNumeros.clone());
                    break;

                case 3:
                    System.out.println("\nOrdenamiento de Intercambio:");
                    ordenamiento.intercambio(arregloNumeros.clone());
                    break;

                case 4:
                    System.out.println("\nOrdenamiento de Selección:");
                    ordenamiento.seleccion(arregloNumeros.clone());
                    break;

                case 5:
                    System.out.println("\nOrdenamiento de Shell:");
                    ordenamiento.shell(arregloNumeros.clone());
                    break;

                case 6:
                    break;

                default:
                    System.out.println("\nOpción inválida. Intente de nuevo.");
                    break;

            }



        } while (opciones != 6);
    }
}
