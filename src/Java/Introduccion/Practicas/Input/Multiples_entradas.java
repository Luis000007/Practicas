package Java.Introduccion.Practicas.Input;

import java.util.Scanner;

public class Multiples_entradas {
    public static void main (String[]args){

        /*
        Ten en cuenta que puedes utilizar el mismo Scanner para tomar multiples entradas.
        Por ejemplo, tomamos el nombre y la edad como entrada y generemoslo:
         */

        // Ejemplo:

        System.out.println("Enter a name: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Enter a age: ");

        int age = sc.nextInt();
        System.out.println(name + " is "+age);

    }
}
