package Java.Intermedio.Sets;

import java.util.HashSet;

public class Part2 {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();

        // Agregar elementos
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Juan"); // No se añadirá porque ya existe

        // Recorrer el conjunto
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
