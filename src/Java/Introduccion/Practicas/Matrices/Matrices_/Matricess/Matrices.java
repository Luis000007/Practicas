package Java.Introduccion.Practicas.Matrices.Matrices_.Matricess;

public class Matrices {
    public static void main(String[] args) {

        /*
        Imagina un programa que necesita alamacenar las edades de 10 usuarios.
        Con las variables, tendria que crear 10 variables distintas para cada usuario. eso seria realmente poco efectivo y repetitivo.
        Las matrices pueden ayudr en este tipo de situaciones, una matris alamacena varios valores de una sola variable.

        Una matris necesita ser declarada, al igual que una variable, con el tipo de los elementos que contendra.
        Para declarar declarar una matrises necesario definir el tipo de los elementos con corchetes.

        int [] ages;

        El nombre de la matiz es ages. El tipo de elementos que contendra es int.
        Ahora, para crear la matriz, tenemos que especificar el numero de elementos que contendra utilizando la palabra clave new.

        int[] age;
        age = new int [5];

        El codig anterior crea una matris de 5 entornes, podemos convinar el codigo anterior en una sola linea

        int[] ages = new int [5];
         */

        /*
        El acceso a los elementos de una matriz se realiza mediante su posicion, tambien llamada indice.
        Este es un ejemplo, en el que se establece el elemento con el indice 2 al valor 25:

        ages[2] = 25;

        El indice se especifica en corchetes, junto al nombre de la matriz.

        El elemento con indice 2 es en realidad el tercer elemento de la matriz.
        Esto se debe a que los indices de la matriz comienzan desde 0, lo que significa que el indice del primer elemento es 0 en lugar
        de uno. Asi, el indice maximo de la matriz int[5] es 4.

        Establezcamos el valor de los primeros elementos:

        ages[0] = 18;

        De forma similar a la fijacion de valores,  tambien podemos acceder a los valores de la matriz utilizando corchetes y el indice
        del elemento al que queremos acceder.

         */

        // Ejemplo:

        int[] ages = new int[5];
        ages[0] = 18;
        ages[2] = 25;
        System.out.println(ages[2]);

    }
}