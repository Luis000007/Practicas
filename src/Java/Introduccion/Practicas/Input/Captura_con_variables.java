package Java.Introduccion.Practicas.Input;

import java.util.Scanner;

public class Captura_con_variables {
    public static void main (String[]args){

        /*
        Del mismo modo, podemos tomar un numero entero como entrada utilizando:
        nextInt();
         */

        // Ejemplo

        System.out.println("Enter your age: ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Age: "+age);

        /*
        Existen metodos similares para tomar otros tipos como entrada:
        nextDouble()
        nextFloat()
        nextBoolean()
         */

    }
}
