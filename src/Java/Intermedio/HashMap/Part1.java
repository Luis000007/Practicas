package Java.Intermedio.HashMap;

import java.util.HashMap;

// Usar HashMap para asociar claves con valores

public class Part1 {
    public static void main(String[ ] args) {
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);
        System.out.println(points.get("Dave"));
    }
}

/*
Los Arrays y las Listas almacenan elementos como colecciones ordenadas, asignándoles a cada elemento un índice entero.
HashMap se utiliza para almacenar colecciones de datos como pares de clave y valor. Un objeto se utiliza como clave (índice) para otro objeto (el valor).

Los métodos put, remove, y get se utilizan para agregar, eliminar, y acceder a los valores en el HashMap.
 */