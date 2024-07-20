package Java.Introduccion.Practicas.Input;

import java.util.Scanner;

public class Input {
    public static void main(String[]args){

        /*
        Algunos programas necesitan la entradas (input) del usuario. Como pedirle al usuario un apodo en un videojuego.

        Para tomar la entrada del usuario, primero debemos importar la clase correspondiente:
        import java.util.Scanner;

        Esta linea debe escribirse al principio del codigo, antes de la declaracion de la clase.

        Despues de importar la clase Scanner, necesitamos crear un objeto Scanner:
        Scanner sc = newScanner(System.in);
         */

        // Ejemplo

        System.out.println("Enter a name:");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Name: "+ name);

    }
}
