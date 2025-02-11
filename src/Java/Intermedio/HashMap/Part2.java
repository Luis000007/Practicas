package Java.Intermedio.HashMap;

import java.util.HashMap;

public class Part2 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();

        // Agregar elementos (clave, valor)
        mapa.put(1, "Juan");
        mapa.put(2, "María");
        mapa.put(3, "Carlos");

        // Obtener un valor por clave
        System.out.println("Usuario con ID 2: " + mapa.get(2));
        System.out.println();

        // Recorrer el mapa
        for (Integer clave : mapa.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + mapa.get(clave));
        }
    }
}
