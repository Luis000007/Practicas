package Java.Estructura_de_datos.pilas.Arboles;

import javax.swing.JOptionPane;

public class ArbolesBinario {
    public static void main(String[] args) {
        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbol = new ArbolBinario();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.- Agregar Nodo al Arbol\n" +
                                "2.- Recorrido en InOrden\n" +
                                "3.- Recorrido en PreOrden\n" +
                                "4.- Recorrido en PostOrden\n" +
                                "5.- Busqueda Nodo\n" +
                                "6.- Salir",
                        "Arboles Binarios", JOptionPane.QUESTION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el número del Nodo (debe ser un entero positivo):",
                                "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        if (elemento < 0) {
                            imprimirMensaje("El número del nodo debe ser positivo.", "Error");
                            break;
                        }
                        nombre = JOptionPane.showInputDialog(null,
                                "Ingrese el nombre del Nodo:",
                                "Agregando nombre Nodo", JOptionPane.QUESTION_MESSAGE);
                        arbol.agregarNodo(elemento, nombre);
                        break;

                    case 2:
                        if (!arbol.estaVacio()) {
                            arbol.inOrden(arbol.raiz);
                        } else {
                            imprimirMensaje("El árbol se encuentra vacío.", "Vacío");
                        }
                        break;

                    case 3:
                        if (!arbol.estaVacio()) {
                            arbol.preOrden(arbol.raiz);
                        } else {
                            imprimirMensaje("El árbol se encuentra vacío.", "Vacío");
                        }
                        break;

                    case 4:
                        if (!arbol.estaVacio()) {
                            arbol.postOrden(arbol.raiz);
                        } else {
                            imprimirMensaje("El árbol se encuentra vacío.", "Vacío");
                        }
                        break;

                    case 5:
                        if (!arbol.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el número del Nodo a buscar:",
                                    "Buscando Nodo", JOptionPane.QUESTION_MESSAGE));
                            if (arbol.buscarNodo(elemento) == null) {
                                imprimirMensaje("Nodo no encontrado.", "Resultado");
                            } else {
                                System.out.println("Nodo encontrado | su nombre es: " + arbol.buscarNodo(elemento));
                            }
                        } else {
                            imprimirMensaje("El árbol está vacío.", "Vacío");
                        }
                        break;

                    case 6:
                        imprimirMensaje("Programa terminado", "Fin");
                        break;

                    default:
                        imprimirMensaje("Opción incorrecta. Por favor, elija una opción válida.", "Error");
                }
            } catch (NumberFormatException n) {
                imprimirMensaje("Entrada no válida. Por favor, ingrese un número entero.", "Error");
            }
        } while (opcion != 6);
    }

    private static void imprimirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}
