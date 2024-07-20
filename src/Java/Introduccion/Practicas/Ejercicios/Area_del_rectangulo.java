package Java.Introduccion.Practicas.Ejercicios;

import java.util.Scanner;

public class Area_del_rectangulo {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int width = read.nextInt();
        int height = read.nextInt();

        printArea(width, height);
    }

    //completar el método inferior
    public static void printArea(int width, int height){
        System.out.println(width * height);
    }
}
