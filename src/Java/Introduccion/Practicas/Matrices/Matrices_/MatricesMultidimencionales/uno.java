package Java.Introduccion.Practicas.Matrices.Matrices_.MatricesMultidimencionales;

public class uno {
    public static void main(String[] args) {

        /*
        Las matrices pueden tener varias dimensiones (o número de índices). Por ejemplo, imagina un programa de venta de entradas,
        que almacena los números de los asientos de un estadio, que tienen un número de fila y de columna.
         O un tablero de ajedrez, donde cada casilla tiene 2 coordenadas: una letra y un número.

         Para crear matrices multidimensionales, coloca cada matriz dentro de su propio conjunto de corchetes:
         int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} };

         Ten en cuenta que la matriz se crea con dos corchetes, especificando la bidimensionalidad.
         */

        /*
        Para acceder a un elemento de la matriz bidimensional, proporciona dos índices, uno para la matriz
        y otro para el elemento dentro de esa matriz. El siguiente ejemplo accede al primer elemento de la segunda matriz de sample:
         */

        int[][] sample = { {1, 2, 3}, {4, 5, 6} };
        int x = sample[1][0];
        System.out.println(x);  // Run: 4

        /*
        Cada fila es un elemento, que es una matriz.
        Por lo tanto, para acceder a un valor, proporcionamos el índice de la fila y luego el índice de la columna.
         */
    }
}
