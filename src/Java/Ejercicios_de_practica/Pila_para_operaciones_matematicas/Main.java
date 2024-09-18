package Java.Ejercicios_de_practica.Pila_para_operaciones_matematicas;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Crear una pila compartida
        Stack<Double> pilaResultados = new Stack<>();

        Operaciones operaciones = new Operaciones(pilaResultados);
        Pila pila = new Pila(pilaResultados);

        Scanner scanner = new Scanner(System.in);
        int opciones;

        do {
            System.out.println();
            System.out.println("*Operaciones*");
            System.out.println("1. Suma.");
            System.out.println("2. Resta.");
            System.out.println("3. Multiplicacion.");
            System.out.println("4. Division.");
            System.out.println("5. Mostrar resultados");
            System.out.println("6. Salir.");
            System.out.println("Selecciona una opción: ");
            opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println();
                    System.out.println("Suma");
                    operaciones.Suma();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Resta");
                    operaciones.Resta();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Multiplicacion");
                    operaciones.Multiplicacion();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Division");
                    operaciones.Division();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Mostrar resultados");
                    pila.menuPila();
                    break;

                case 6:
                    System.out.println();
                    System.out.println("Saliendo...");
                    System.out.println();
                    break;

                default:
                    System.out.println();
                    System.out.println("Elige una opcion valida");
                    break;
            }
        } while (opciones != 6);
    }
}