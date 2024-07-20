package Java.Introduccion.Practicas.Toma_de_decisiones;

public class if_else_ {
    public static void main(String[]args){
        /*
        En lugar de usar declaraciones anidadas if-else, puedes usar la declaracion "else if" para comprobar multiples declaraciones.

         */

        // Ejemplo

        int age = 25;

        if (age <= 0) {
            System.out.println("Error");

        } else if (age <= 16) {
            System.out.println("Too young");

        } else if (age < 100) {
            System.out.println("Welcome");

        } else {
            System.out.println("Really?");

        }
    }
}
