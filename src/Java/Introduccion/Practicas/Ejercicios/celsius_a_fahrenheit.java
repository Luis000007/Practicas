package Java.Introduccion.Practicas.Ejercicios;

import java.util.Scanner;

public class celsius_a_fahrenheit {

    //tu código va aquí
    static double fahr (double celsius) {

        double operacion = 1.8 * celsius + 32;
        return operacion;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();

        System.out.println(fahr(celsius));
    }
}