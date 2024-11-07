package Java.Estructura_de_datos.pilas.Act_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opciones;

        do {

            System.out.println("****************************************");
            System.out.println("Elige tu metodo de ordenamiento favorito");
            System.out.println("1. Método de Inserción");
            System.out.println("2. Método Shell");
            System.out.println("3. Salir del programa");

            System.out.println("Ingrese una opción: ");
            opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println();
                    System.out.println("Método de Inserción");
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Método Shell");
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Salir");
                    System.out.println();
                    break;

                default:
                    System.out.println();
                    System.out.println("Ingresa una opcion que sea valida");
                    System.out.println();
                    break;
            }

        } while (opciones != 3);
    }
}
