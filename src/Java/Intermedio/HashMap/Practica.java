package Java.Intermedio.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);

        int ageLimit = scanner.nextInt();

        // Usamos un iterador para evitar problemas de modificación durante la iteración
        Iterator<String> iterator = ages.keySet().iterator();
        while (iterator.hasNext()) {
            String emp = iterator.next();
            if (ages.get(emp) < ageLimit) {
                iterator.remove(); // Eliminamos la entrada con edad menor a ageLimit
            }
        }

        System.out.println(ages);
        scanner.close();
    }
}

/*

El programa que se te da define y muestra un HashMap, donde los nombres de los empleados se almacenan como claves, y sus edades como valores.
También toma el número N del usuario como límite de edad. Escribe un código para eliminar a todos los empleados cuya edad sea menor que el número N.
La línea de código para la salida del objeto HashMap ya está proporcionada.

Entrada de muestra
25

Salida de muestra
{Robert=32, John=28}

Sugerencia
Usa el método get() para acceder a los valores en el HashMap y remove() para eliminarlos.
nameArr es un arr

/*

/*

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);


        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);

        int ageLimit = scanner.nextInt();

        for (String emp : nameArr){
            //your code goes here

        }

        System.out.println(ages);
    }
}
 */
