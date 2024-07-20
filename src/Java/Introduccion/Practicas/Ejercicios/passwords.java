package Java.Introduccion.Practicas.Ejercicios;

import java.util.Scanner;

public class passwords {
    public static void main(String[] args) {

        int[] passwords = {2021, 1023, 9929};
        Scanner scanner = new Scanner(System.in);

        int  password = scanner.nextInt();

        for (int x: passwords) {
            if (password == x) {
                System.out.println("Welcome");

            }
        }
    }
}
