package Java.Estructura_de_datos.pilas.Act_9;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {12, 11, 13, 5, 6};

        Orden_Burbuja ob = new Orden_Burbuja();
        Orden_Inserccion oi = new Orden_Inserccion();
        Orden_Seleccion os = new Orden_Seleccion();
        Orden_Shell osh = new Orden_Shell();
        Orden_Intercambio oin = new Orden_Intercambio();

        Scanner scanner = new Scanner(System.in);
        int opciones;

        do {
            System.out.println("Seleccione el tipo de ordenamiento:");
            System.out.println("1. Ordenamiento Burbuja");
            System.out.println("2. Ordenamiento Inserción");
            System.out.println("3. Ordenamiento Selección");
            System.out.println("4. Ordenamiento Shell");
            System.out.println("5. Ordenamiento Intercambio");
            System.out.println("6. Salir");

            System.out.print("Ingrese una opción: ");
            opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println();
                    System.out.println("Ordenamiento Burbuja:");
                    ob.ordenBubble(arreglo.clone());
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Ordenamiento Inserción:");
                    oi.ordenacionInsercion(arreglo.clone());
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Ordenamiento Selección:");
                    os.ordenSeleccion(arreglo.clone());
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Ordenamiento Shell:");
                    osh.Shell(arreglo.clone());
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Ordenamiento Intercambio:");
                    oin.intercambio(arreglo.clone());
                    System.out.println();
                    break;

                case 6:
                    System.out.println();
                    System.out.println("Saliendo del programa.");
                    System.out.println();
                    break;

                default:
                    System.out.println();
                    System.out.println("Opción inválida. Intente de nuevo.");
                    System.out.println();
                    break;
            }
        } while (opciones != 6);

        scanner.close();
    }
}
