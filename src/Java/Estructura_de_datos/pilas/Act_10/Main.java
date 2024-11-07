package Java.Estructura_de_datos.pilas.Act_10;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opciones;

        // Crear el arreglo con mil números aleatorios
        int[] numeros = new int[1000];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1000); // Número aleatorio entre 0 y 999
        }

        // Crear instancias de las clases de ordenamiento
        Método_Inserción insercion = new Método_Inserción();
        Método_Shell shell = new Método_Shell();

        do {
            System.out.println("****************************************");
            System.out.println();
            System.out.println("Elige tu método de ordenamiento favorito");
            System.out.println("1. Método de Inserción");
            System.out.println("2. Método Shell");
            System.out.println();
            System.out.println("3. Salir del programa");

            System.out.print("Ingrese una opción: ");
            opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println();
                    System.out.println("****************************************");
                    System.out.println("Método de Inserción");
                    System.out.println("Arreglo antes de ordenamiento:");
                    insercion.mostrarArreglo(numeros);
                    insercion.ordenacionInsercion(numeros);
                    System.out.println("Arreglo después de ordenamiento:");
                    insercion.mostrarArreglo(numeros);
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("****************************************");
                    System.out.println("Método Shell");
                    System.out.println("Arreglo antes de ordenamiento:");
                    shell.mostrarShell(numeros);
                    shell.ordenarShell(numeros);
                    System.out.println("Arreglo después de ordenamiento:");
                    shell.mostrarShell(numeros);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    System.out.println("(:");
                    break;

                default:
                    System.out.println();
                    System.out.println("*Ingresa una opción válida.*");
                    System.out.println();
                    break;
            }

        } while (opciones != 3);

        scanner.close();
    }
}
