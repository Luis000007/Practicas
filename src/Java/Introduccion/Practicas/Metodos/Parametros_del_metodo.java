package Java.Introduccion.Practicas.Metodos;

public class Parametros_del_metodo {

    /*
    Los métodos pueden tener parámetros, que se pueden utilizar en tu código.
    Los parámetros se definen entre paréntesis y pueden utilizarse como variables en el método.
    Por ejemplo, añadamos un parámetro de cadena <b>name </b>a nuestra función <b>welcome()</b>:

    static void welcome(String name) {
  System.out.println("Welcome, " + name);
}

    El método anterior toma una cadena llamada <b>name </b>como su parámetro, que se utiliza en el método.
     */

    /*
    Ahora, al llamar al método, tenemos que pasarle un valor para el parámetro <b>name </b>dentro del paréntesis:
     */

    static void welcome(String name) {
        System.out.println("Welcome, "+name);
    }

    public static void main(String[] args) {
        welcome("James");    // Los valores pasados como parámetros se denominan argumentos.
        welcome("Amy");

        /*
        De esta manera, podemos llamar a nuestro método con diferentes parámetros y generar diferentes resultados basados en ellos.
         */
    }
}
