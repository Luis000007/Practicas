package Java.Estructura_de_datos.pilas.Act_5.diccionario_Hashtable;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Enumeration;

public class DiccionarioHashtable {

    public static void main(String[] args) {
        // Crear un objeto Hashtable para almacenar términos y significados
        Hashtable<String, String> diccionario = new Hashtable<>();

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que agregue 5 términos y sus significados
        System.out.println("Diccionario: Agrega 5 términos y sus significados.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nTérmino " + i + ": ");
            String termino = scanner.nextLine().toLowerCase();  // Convertir a minúsculas

            System.out.println("Significado de '" + termino + "': ");
            String significado = scanner.nextLine();

            // Agregar el término y significado a la tabla hash
            diccionario.put(termino, significado);
        }

        // Mostrar el contenido del diccionario en formato de tabla
        System.out.println("\nContenido del diccionario:");

        // Obtener una enumeración de las claves del Hashtable
        Enumeration<String> keys = diccionario.keys();
        System.out.println("------------------------------");
        System.out.println("Término           | Significado");
        System.out.println("------------------------------");
        while (keys.hasMoreElements()) {
            String clave = keys.nextElement();
            String valor = diccionario.get(clave);
            System.out.printf("%-18s | %s\n", clave, valor);
        }
        System.out.println("------------------------------");

        scanner.close();
    }
}
