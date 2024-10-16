package Java.Intermedio.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> evennums = new ArrayList<Integer>();

        System.out.println("Ingresa 3 numeros a la lista:");

        while(evennums.size() <3){
            int num = scanner.nextInt();
            evennums.add(num);
            }


        System.out.println("Los numeros agregados son: "+ evennums);
        System.out.println();

        // Promedio
        int  suma = 0;

        for (int num : evennums) {
            suma += num;

        }
        int division = suma / 3;
        System.out.println("El promedio es: " + division);
    }
}