package Java.Introduccion.Practicas.Toma_de_decisiones;

public class Condicionales {
    public static void main(String[]args){

        /*
        Considera un programa que toma un numero de dia como entra y genera el dia de la semana correspondiente
         */

        int day = 2;

        if (day == 1) {
            System.out.println("Monday");

        } else if (day == 2) {
            System.out.println("Tuesday");

        } else if (day == 3) {
            System.out.println("Wednesday");

        } else {
            System.out.println("Error");

        }
    }
}
