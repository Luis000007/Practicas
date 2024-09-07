package Java.Ejercicios_de_practica.Practicas_de_pila;

import java.util.Stack;

public class push {
    public static void main(String[] args) {
        // Crear una pila de Strings
        Stack<String> pila = new Stack<>();

        // Agregar elementos (meses) a la pila usando push()
        pila.push("Enero");
        pila.push("Febrero");
        pila.push("Marzo");

        // Mostrar la pila
        System.out.println("Pila actual: " + pila);
    }
}