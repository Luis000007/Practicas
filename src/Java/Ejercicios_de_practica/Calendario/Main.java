package Java.Ejercicios_de_practica.Calendario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int Opcion = 0;
        do {
            try {
                Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                        1. --> Empujar un elemento (mes)
                        2. --> Sacar un elemento (mes)
                        3. --> Cual es el elemento (mes) en el tope o cima de la pila
                        4. --> Eliminar un elemento (mes)
                        5. --> Mostrar si hay elementos (meses) en la pila
                        6. --> Si la pila esta vacia
                        7. --> Muestre el tamaño de la pila
                        8. --> Salir""","MENU DE OPCIONES : ",3));

                switch (Opcion) {
                    case 1 -> {
                    }

                    case 2 -> {
                    }

                    case 3 -> {
                    }

                    case 4 -> {
                    }

                    case 5 -> {
                    }

                    case 6 -> {
                    }

                    case 7 -> {
                    }

                    case 8 -> JOptionPane.showMessageDialog(null, "Saliendo del programa");

                    default -> JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }
        } while (Opcion != 8);
    }
}


