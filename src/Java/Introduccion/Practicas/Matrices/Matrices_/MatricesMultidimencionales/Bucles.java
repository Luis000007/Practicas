package Java.Introduccion.Practicas.Matrices.Matrices_.MatricesMultidimencionales;

public class Bucles {
    public static void main(String[] args) {

               // Para hacer un bucle sobre una matriz de 2 dimensiones, necesitamos anidar bucles <b>for</b>:

        int[][] sample = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for(int x=0; x<sample.length; x++) {
            for(int y=0; y<sample[x].length; y++) {
                System.out.println(sample[x][y]);

                // El primer bucle itera sobre las filas, mientras que el segundo sobre sus elementos.

            }
        }
    }
}
