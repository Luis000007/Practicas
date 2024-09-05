package Java.Ejercicios_de_practica.pilas;

import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pilas2 {
    public static void main(String[] args) {

        Stack <Integer> myStack = new Stack<>();

        int size = 0; // Tamaño elegido por el usuario
        int currentData = 0; // Dato de un nodo en cuestion

        size = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos elementos deseas agregar?"));

        for (int i = 0; i < size; i++) {
            currentData = Integer.parseInt(

                    JOptionPane.showInputDialog("Inserta el elemento " + (i + 1)));
            myStack.push(currentData);

        }
        // Muestra la lista
        System.out.println("Los elementos de la Pila son:");
        System.out.println(""+ myStack);

        try {
            myStack.pop();
        } catch (Exception ex) {
            Logger.getLogger(Pilas2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
