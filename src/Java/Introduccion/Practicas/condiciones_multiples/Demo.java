package Java.Introduccion.Practicas.condiciones_multiples;

public class Demo {
    public static void main(String[]args){

        /*
        && -> And, devuelve true si ambos son variables

        || -> Or, comprueba si alguna de las condiciones es verdadera,
        y si un dato llega a ser verdadero, el programa correra con normalidad.

        ! -> NOT, Se utiliza para reveritr la condicion. Si una condicion es verdadera, el operador logico not lo hara falso y viceversa
         */

        // Ejemplo

        String country = "Us";
        int age = 42;

        if ((country == "Us" || country == "GB") && (age > 0 && age < 100)) {
            System.out.println("Allowed");

        } else {
            System.out.println("Denied");

        }
    }
}
