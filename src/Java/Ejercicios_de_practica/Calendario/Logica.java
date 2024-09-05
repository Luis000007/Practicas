package Java.Ejercicios_de_practica.Calendario;

import java.util.Stack;

public class Logica {

    // Metodo para Empujar un elemento
    public static void
    empujarMes (Stack<String> pila, String mes) {
        pila.push(mes); // Agregar el mes a la pila

        System.out.println("Mes " + mes +" agregado a la pila.");

    }

    // Metodo para Sacar un elemento de la pila
    public static void
    sacarMes (Stack<String> pila) {

        if (!pila.isEmpty()) {
            String mes = pila.pop(); // Remueve el mes de la pila

            System.out.println("Mes  " + mes + " sacado de la pila");

        } else {
            System.out.println("La pila esta vacia. No se puede sacar ningin elemento.");
        }
    }

    // Metodo para Mostrar elemento en el tope de la lista
    public static void
    mostrarTope (Stack<String> pila) {

        if (!pila.isEmpty()) {
            System.out.println("El mes en el tope de la pila es: "  + pila.peek()); // Muestra el mes en la cima

        } else {
            System.out.println("La pila esta vacia");
        }
    }

    // Metodo para Eliminar un elemento de la pila
    public static void
    eliminarMes (Stack<String> pila, String mesEliminar) {

        if (pila.remove(mesEliminar)) { // Elimina el mes si esta en la pila
            System.out.println("Mes " + mesEliminar + " eliminando de la pila.");

        } else {
            System.out.println("El mes " + mesEliminar + " no se encuentra en la pila.");
        }
    }

    // Metodo para Mostrar si hay si hay elementos el la pila
    public static void
    mostrarElementos (Stack<String> pila) {
        if (!pila.isEmpty()) {
            System.out.println("La pila tiene " + pila.size() + " mes");

        } else {
            System.out.println("La pila esta vacia");
        }
    }

    // Metodo para Verificar si la pila esta vacia
    public static void verificarPilaVacia(Stack<String> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("La pila no está vacía.");
        }
    }

    // Metodo para Mostrar el Tamaño de la pila
    public static void mostrarTamañoPila(Stack<String> pila) {
        System.out.println("El tamaño de la pila es: " + pila.size() + " mes(es).");

    }
}
