package Java.Introduccion.Practicas.Toma_de_decisiones;

public class Anidades_if {
    public static void main(String[]args){

        int age = 25;

        if (age > 0) {
            if (age > 16) {
                System.out.println("Welcome!");

            } else {
                System.out.println("Too young");

                /*
                Puedes hacer tantas declaraciones como quieras, pero se hara mas complicado de leer
                 */
            }
        }
    }
}
