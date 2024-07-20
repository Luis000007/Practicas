package Java.Introduccion.Practicas.Matrices.Matrices_.Bucles_sobre_matrices;

public class for_each_para_sumar_valores {
    public static void main(String[] args) {

        /*
        Usemos un bucle for-each para calcular la suma de todos los valores de una matriz:
         */

        int[] ages = {18, 33, 24, 64, 45};
        int sum = 0;
        for(int x: ages) {
            sum += x;
        }
        System.out.println(sum);

        /*
        Ten en cuenta que en este caso no tenemos el índice, tenemos el valor de cada elemento de la matriz.
         */
    }
}
