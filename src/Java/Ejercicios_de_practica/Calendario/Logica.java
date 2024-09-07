package Java.Ejercicios_de_practica.Calendario;

import java.util.Stack;

public class Logica {

    // Crear una pila de Strings
    Stack<String> meses = new Stack<>();

    // Constructor para inicializar la pila con algunos meses
    public Logica() {
        // Agregar elementos (meses) a la pila usando push()
        meses.push("Enero");
        meses.push("Febrero");
        meses.push("Marzo");
        meses.push("Abril");
        meses.push("Mayo");
        meses.push("Junio");
        meses.push("Julio");
        meses.push("Agosto");
        meses.push("Septiembre");
        meses.push("Octubre");
        meses.push("Noviembre");
        meses.push("Diciembre");
    }

    // Metodo para Empujar un elemento
    public static void empujarMes(Stack<String> pila, String mes) {
        pila.push(mes); // Agregar el mes a la pila
        System.out.println("Mes " + mes + " agregado a la pila.");
    }

    // Metodo para Sacar un elemento de la pila
    public static void sacarMes(Stack<String> pila) {
        if (!pila.isEmpty()) {
            String mes = pila.pop(); // Remueve el mes de la pila
            System.out.println("Mes " + mes + " sacado de la pila");
        } else {
            System.out.println("La pila está vacía. No se puede sacar ningún elemento.");
        }
    }

    // Metodo para Mostrar elemento en el tope de la pila
    public static void mostrarTope(Stack<String> pila) {
        if (!pila.isEmpty()) {
            System.out.println("El mes en el tope de la pila es: " + pila.peek()); // Muestra el mes en la cima
        } else {
            System.out.println("La pila está vacía");
        }
    }

    // Metodo para Eliminar un elemento de la pila
    public static void eliminarMes(Stack<String> pila, String mesEliminar) {
        if (pila.remove(mesEliminar)) { // Elimina el mes si está en la pila
            System.out.println("Mes " + mesEliminar + " eliminado de la pila.");
        } else {
            System.out.println("El mes " + mesEliminar + " no se encuentra en la pila.");
        }
    }

    // Metodo para Mostrar si hay elementos en la pila
    public static void mostrarElementos(Stack<String> pila) {
        if (!pila.isEmpty()) {
            System.out.println("La pila tiene " + pila.size() + " mes(es):");

            // Usamos un bucle for para recorrer e imprimir cada elemento de la pila
            for (String mes : pila) {
                System.out.println("- " + mes);
            }
        } else {
            System.out.println("La pila está vacía.");
        }
}

    // Metodo para Verificar si la pila está vacía
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
