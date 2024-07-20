package Java.Introduccion.Practicas.Metodos;

public class Valores_del_retorno {

    /*
    Los métodos que hemos visto hasta ahora dan su resultado.
    En algunos casos no necesitamos generar el resultado,
    sino que necesitamos asignarlo a una variable, para trabajar con él en nuestro programa.
    En estos casos, necesitamos que nuestro método devuelva el valor del resultado.
     */

    /*
    Consideremos un método de nuestra lección anterior, que se utilizó para obtener un porcentaje del valor dado:

static void perc(double num, int percentage) {
  double res = num*percentage/100;
  System.out.println(res);
}
     La palabra clave <b>void</b>  en la definición especifica que el método no devuelve ningún valor.
     */

    /*
    Aquí está la misma definición de función, especificando que el tipo de retorno es un <b>double</b>:

static double perc(double num, int percentage) {
  ...
}
    Esto significa que nuestro método <b>perc</b> devolverá un valor de tipo <b>double</b>.
     */
}
