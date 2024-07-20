package Java.Introduccion.Practicas.Matrices.Matrices_.Matricess;

import java.util.Scanner;

public class Matricez_con_condicionales {
    public static void main (String[] args) {

        /*
        Un programa para una maquina expendedora que te de una lista de opciones a elegir y cuando no haya esa opcion suelte un invalid.

         */

        System.out.println("Tea = 0, Espreso = 1, Americano = 2, Water = 3, Hot chocolate = 4");
        System.out.println("Select a option: ");

        String[] menu = {"Tea", "Espreso", "Americano", "Water", "Hot Chocolate"};

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice < 0 || choice > 4) {
            System.out.println("Invalid");

        } else {
            System.out.println(menu[choice]);
        }
    }
}
