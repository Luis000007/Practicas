package Java.Introduccion.Practicas.Matrices.Matrices_.Bucles_sobre_matrices;

public class suma_de_valores {
    public static void main(String[] args) {

        /*
        También podemos utilizar un bucle for para realizar cálculos utilizando valores de matrices.}
        Por ejemplo, vamos a calcular la suma de todos los valores de una matriz:
         */

        int[] ages = {18, 33, 24, 64, 45};
        int sum = 0;
        for(int x=0; x<ages.length; x++) {
            sum += ages[x];
        }
        System.out.println(sum);

        /*
        En el código anterior, declaramos una variable <b>sum </b>para almacenar el resultado y lo asignó 0.
        Entonces utilizamos un bucle <b>for </b>para iterar a través de la matriz, y añadimos el valor de cada elemento a la variable.
         */

    }
}
