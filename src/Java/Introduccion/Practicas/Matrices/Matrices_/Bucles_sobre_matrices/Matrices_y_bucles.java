package Java.Introduccion.Practicas.Matrices.Matrices_.Bucles_sobre_matrices;

public class Matrices_y_bucles {
    public static void main(String[] args) {

        /*
        Ahora, cuando conocemos el número de elementos, podemos utilizar un bucle <b>for </b>
        y genera todos los elementos de la matriz:

         */

        int[] ages = {18, 33, 24, 64, 45};

        for (int x = 0; x < ages.length; x++) {
            System.out.println(ages[x]);

            /*
            Utilizamos la variable x del bucle como índice de nuestra matriz.
            Durante cada iteración del bucle, se accede al siguiente elemento de la matriz.
             */
        }
    }
}