package Java.Ejercicios_de_practica.Pila_para_operaciones_matematicas;

import java.util.Scanner;
import java.util.Stack;

public class Pila {

    private Stack<Double> pilaResultados;
    private Operaciones operaciones;
    private Scanner scanner = new Scanner(System.in);

    // Constructor que recibe la misma pila que la clase Operaciones
    public Pila(Stack<Double> pilaResultados) {
        this.pilaResultados = pilaResultados;
        this.operaciones = new Operaciones(pilaResultados);
    }

    public void menuPila() {
        int Opciones_Pila;

        System.out.println();
        System.out.println("Bienvenido!");
        System.out.println("En esta seccion podras revisar tus resultados anteriores y hacer operaciones con ellos!");
        System.out.println();

        do {
            System.out.println();
            System.out.println("Menú Pila:");
            System.out.println("1. Mostrar contenido de la pila");
            System.out.println("2. Sumar números");
            System.out.println("3. Restar números");
            System.out.println("4. Multiplicar números");
            System.out.println("5. Dividir números");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            Opciones_Pila = scanner.nextInt();

            switch (Opciones_Pila) {
                case 1:
                    System.out.println();
                    mostrarPila();
                    break;

                case 2:
                    System.out.println();
                    operaciones.Suma();
                    break;

                case 3:
                    System.out.println();
                    operaciones.Resta();
                    break;

                case 4:
                    System.out.println();
                    operaciones.Multiplicacion();
                    break;

                case 5:
                    System.out.println();
                    operaciones.Division();
                    break;

                case 6:
                    System.out.println();
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println();
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (Opciones_Pila != 6);
    }

    private void mostrarPila() {
        if (pilaResultados.isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Contenido de la pila: " + pilaResultados);
        }
    }
}
