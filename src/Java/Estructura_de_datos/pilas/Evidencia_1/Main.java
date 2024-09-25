package Java.Estructura_de_datos.pilas.Evidencia_1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Articulo> listaArticulos = new LinkedList<>();
        Stack<Articulo> pilaArticulo = new Stack<>();
        PriorityQueue<Articulo> colaPrioridad = new PriorityQueue<>((a1, a2) -> Double.compare(a1.getPrecio(), a2.getPrecio()));

        // Agregar 14 objetos predefinidos a la lista y la cola de prioridad
        listaArticulos.add(new Articulo("Laptop", 15000.00));
        listaArticulos.add(new Articulo("Celular", 8000.00));
        listaArticulos.add(new Articulo("Tablet", 5000.00));
        listaArticulos.add(new Articulo("Monitor", 3000.00));
        listaArticulos.add(new Articulo("Teclado", 700.00));
        listaArticulos.add(new Articulo("Mouse", 350.00));
        listaArticulos.add(new Articulo("Audífonos", 1200.00));
        listaArticulos.add(new Articulo("Impresora", 2500.00));
        listaArticulos.add(new Articulo("Cámara", 4000.00));
        listaArticulos.add(new Articulo("Smartwatch", 4500.00));
        listaArticulos.add(new Articulo("Altavoz", 1000.00));
        listaArticulos.add(new Articulo("Disco duro", 1500.00));
        listaArticulos.add(new Articulo("Router", 850.00));
        listaArticulos.add(new Articulo("Memoria USB", 200.00));

        // Añadir estos artículos a la cola de prioridad
        colaPrioridad.addAll(listaArticulos);

        boolean continuar = true;

        while (continuar) {
            // Mostrar menú
            System.out.println("\nMenú");
            System.out.println("1. Agregar artículos a la lista");
            System.out.println("2. Mostrar pila de artículos");
            System.out.println("3. Vaciar la pila de artículos");
            System.out.println("4. Mostrar cola de prioridad por precio");
            System.out.println("5. Agregar más artículos");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            // Switch case para manejar las opciones
            switch (opcion) {
                case 1:
                    agregarArticulos(listaArticulos, colaPrioridad, scanner);
                    break;

                case 2:
                    mostrarPila(listaArticulos, pilaArticulo);
                    break;

                case 3:
                    vaciarPila(pilaArticulo);
                    break;

                case 4:
                    mostrarColaDePrioridad(colaPrioridad);
                    break;

                case 5:
                    System.out.println("Agregando más artículos...");
                    agregarArticulos(listaArticulos, colaPrioridad, scanner);
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }

        scanner.close();
    }

    // Método para agregar artículos a la lista enlazada y cola de prioridad
    public static void agregarArticulos(LinkedList<Articulo> listaArticulos, PriorityQueue<Articulo> colaPrioridad, Scanner scanner) {
        System.out.println("¿Cuántos artículos deseas agregar a la lista?");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea nueva

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el nombre del artículo: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingresa el precio del artículo: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir la línea nueva

            Articulo articulo = new Articulo(nombre, precio);
            listaArticulos.add(articulo);
            colaPrioridad.offer(articulo); // Agregar a la cola de prioridad
        }
    }

    // Método para mostrar los artículos en la pila sin vaciarla
    public static void mostrarPila(LinkedList<Articulo> listaArticulos, Stack<Articulo> pilaArticulo) {
        System.out.println("\nMostrando los artículos en la lista y agregándolos a la pila:");
        for (Articulo articulo : listaArticulos) {
            System.out.println(articulo.toString());
            pilaArticulo.push(articulo);  // Agregar a la pila
        }
    }

    // Método para vaciar la pila
    public static void vaciarPila(Stack<Articulo> pilaArticulo) {
        System.out.println("\nVaciando la pila:");
        while (!pilaArticulo.isEmpty()) {
            System.out.println(pilaArticulo.pop().toString());
        }
    }

    // Método para mostrar la cola de prioridad por precio
    public static void mostrarColaDePrioridad(PriorityQueue<Articulo> colaPrioridad) {
        System.out.println("\nMostrando los artículos en la cola de prioridad por precio:");
        PriorityQueue<Articulo> colaCopia = new PriorityQueue<>(colaPrioridad); // Copia de la cola para mostrar sin vaciar
        while (!colaCopia.isEmpty()) {
            System.out.println(colaCopia.poll().toString());
        }
    }
}

