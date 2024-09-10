package Java.Estructura_de_datos.pilas.Prueba_1;

import javax.swing.*;

/**Interfaz principal -----> Crear el menu**/

public class Main {
    public static void main(String[] args){
        Lista lista1 = new Lista(); /**Objeto**/
        int Opcion = 0, elem;
        do {
            try {
                Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                        1. --> Agregar un elemento al Inicio de la lista
                        2. --> Agregar un elemento al Final de la lista 
                        3. --> Mostrar los datos de la lista
                        4. --> ELIMINAR un elemento del inicio de la lista
                        5. --> ELIMINAR un elemento del final de la lista
                        6. --> Eliminar un elemento en ESPECIFICO de la lista 
                        7. --> Salir""","MENU DE OPCIONES : ",3));

                switch (Opcion) {
                    case 1 -> {
                        elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el elemento:" ,
                                "Insertando al inicio", 3));
                        lista1.agregarAlInicio(elem); /**Agregar nodo**/
                    }

                    case 2 -> {
                        elem = Integer.parseInt (JOptionPane.showInputDialog (null, "ingresa el elemento:",
                                "Insertando al final",3));
                        lista1.agregarAlFinal(elem); /**Agregar nodo**/
                    }

                    case 3 -> {
                        lista1.mostrarLista(); /**Mostrar la lista**/
                    }

                    case 4 -> {
                        elem = lista1.borrarDelInicio();
                        JOptionPane.showMessageDialog (null, "Elemento ELIMINADO es: "+ elem,
                                "Eliminando Nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                    }

                    case 5 -> {
                        elem = lista1.eliminarFinal();
                        JOptionPane.showMessageDialog (null, "Elemento ELIMINADO es: "+ elem,
                                "Eliminando Nodo del FINAL", JOptionPane.INFORMATION_MESSAGE);
                    }

                    case 6 -> {
                        elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el" +
                                        "Elemento a eliminar", "Eliminando Nodo en especifico",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista1.Eliminar(elem);
                        JOptionPane.showMessageDialog(null, "El elemento ELIMINADO ES:" + elem,
                                "Eliminando Nodo en especifico", JOptionPane.INFORMATION_MESSAGE);
                    }

                    case 7 -> JOptionPane.showMessageDialog(null, "Saliendo del programa");

                    default -> JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }
        } while (Opcion != 7);
    }
}
