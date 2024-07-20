package Java.Introduccion.Practicas.Matrices.Matrices_.Bucles_sobre_matrices;

public class for_each {
    public static void main(String[] args) {

        /*
        Java proporciona otra versión del bucle <b>for</b>, llamado el bucle for-each,
        para hacer un bucle sobre las matrices, haciendo el código más corto y más fácil de leer.

        Aquí está:
         */

        int[] nums = {2, 3, 5, 7};

        for (int x: nums) {   // Observa los dos puntos después de la variable: se lee como "para cada x en nums".
            System.out.println(x);

            /*
            El bucle crea una variable, que se asigna automáticamente a cada valor de la matriz durante el bucle.
            Puedes llamar a la variable como quieras: en nuestro ejemplo la hemos llamado <b>x</b>.
             */

        }
    }
}
