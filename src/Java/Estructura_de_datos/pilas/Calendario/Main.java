package Java.Estructura_de_datos.pilas.Calendario;

    import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Logica logica = new Logica();

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
                        // Pedir al usuario que ingrese un mes para empujar
                        String mes = JOptionPane.showInputDialog("Ingresa el mes que deseas agregar a la pila:");
                        logica.empujarMes(logica.meses, mes); // Llamar al método con los argumentos
                    }

                    case 2 -> {
                        logica.sacarMes(logica.meses); // Quitar un mes de la pila
                        JOptionPane.showMessageDialog(null, "Mes eliminado");
                    }

                    case 3 -> {
                        logica.mostrarTope(logica.meses); // Mostrar el mes en el tope de la pila
                    }

                    case 4 -> {
                        // Pedir al usuario el mes que desea eliminar
                        String mesEliminar = JOptionPane.showInputDialog("Ingresa el mes que deseas eliminar de la pila:");
                        logica.eliminarMes(logica.meses, mesEliminar);
                    }

                    case 5 -> {
                        logica.mostrarElementos(logica.meses); // Mostrar los elementos en la pila
                    }

                    case 6 -> {
                        logica.verificarPilaVacia(logica.meses); // Verificar si la pila está vacía
                    }

                    case 7 -> {
                        logica.mostrarTamañoPila(logica.meses); // Mostrar el tamaño de la pila
                    }

                    case 8 -> {
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    }

                    default -> {
                        JOptionPane.showMessageDialog(null, "Opción inválida, por favor elige nuevamente.");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.");
            }
        } while (Opcion != 8); // El ciclo se repite hasta que se elija la opción 8 (Salir)
    }
}
