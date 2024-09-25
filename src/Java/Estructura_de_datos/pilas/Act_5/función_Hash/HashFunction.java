package Java.Estructura_de_datos.pilas.Act_5.función_Hash;

import java.util.Scanner;

public class HashFunction {

    public static int calcularHash(String palabra, int tamañoTabla) {// Función hash que calcula el número de casilla

        String palabraMinuscula = palabra.toLowerCase();// Convertir la palabra a minúsculas


        String primerosCinco = palabraMinuscula.substring(0, 5);// Extraer los primeros cinco caracteres

        // Sumar los valores ASCII de los primeros cinco caracteres
        int sumaAscii = 0;
        for (int i = 0; i < primerosCinco.length(); i++) {
            sumaAscii += (int) primerosCinco.charAt(i);
        }

        // Asignar la casilla usando el tamaño de la tabla
        int casilla = sumaAscii % tamañoTabla;
        return casilla;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una palabra de más de 5 caracteres:");
        String palabra = scanner.nextLine();

        // Verificar que la palabra tenga más de 5 caracteres
        if (palabra.length() < 5) {
            System.out.println("La palabra debe tener más de 5 caracteres.");
        } else {

            System.out.println("Introduce el tamaño de la tabla (100, 200 o 300):");
            int tamañoTabla = scanner.nextInt();

            if (tamañoTabla == 100 || tamañoTabla == 200 || tamañoTabla == 300) {
                // Calcular el número de casilla
                int casilla = calcularHash(palabra, tamañoTabla);
                System.out.println("La palabra \"" + palabra + "\" se asigna a la casilla: " + casilla);
            } else {
                System.out.println("Tamaño de tabla no válido. Debe ser 100, 200 o 300.");
            }
        }

        scanner.close();
    }
}
