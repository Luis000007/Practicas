package Java.Introduccion.Practicas.Ejercicios;

import java.util.Scanner;

public class Program_ {
    //tu código va aquí
    static void convert (double foot) {

        double conversor = foot * 12;

         System.out.println("Pulgadas: "+conversor);

    }

    public static void main(String[] args) {

        System.out.println("foots: ");

        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        convert(num);
    }
}
