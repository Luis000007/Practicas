package Java.Introduccion.Practicas.Bucles.While_;

public class uno {
        public static void main (String[] args) {

        /*
        Los bucles te permiten repetir un bloque de codigo varias veces.

        Una declaracion de bucle while ejecuta repetidamente una declaracion objetivo mientras una condicion dada sea verdadera

         */

            int x = 5;

            while (x > 0) {
                System.out.println(x);
                x = x - 1;

            /*
            La linea x = x - 1;, es importante, ya que sin ella la condicion nunca se convertiria en falso
             y el bucle se ejecutaria eternamente.

             Cada vez que se ejecuta el bucle, se resta 1 a x.

             */

            }
        }
    }