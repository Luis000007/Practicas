package Java.Intermedio.Sets;

import java.util.HashSet;

// Usar Sets para almacenar valores unicos

public class Part1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set.size());
    }
}

/*

Puedes usar el método <b>size()</b> para obtener el número de elementos en el HashSet.

 */