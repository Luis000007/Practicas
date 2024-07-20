package Java.Introduccion.Practicas.Input;

import java.util.Scanner;

public class Operaciones_con_capturas {
    public static void main(String[] args){

        /*
        Se puedem hacer operaciones a partier de la captura de datos del usuario.
         */

        System.out.println("Enter your bill: ");

        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();

        System.out.println(bill * 15/100);

    }
}
