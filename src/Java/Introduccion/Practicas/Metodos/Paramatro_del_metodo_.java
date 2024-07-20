package Java.Introduccion.Practicas.Metodos;

public class Paramatro_del_metodo_ {

    /*
    Los parámetros del método son muy útiles. Permiten a nuestro método trabajar con diferentes valores y producir resultados.
    Por ejemplo, podemos crear un método que calcule un porcentaje dado de un número y que lo genere:
     */

    static void perc(double num, int percentage) {
        double res = num*percentage/100;
        System.out.println(res);
    }

    public static void main(String[] args) {
        perc(530, 23);

    }
}
