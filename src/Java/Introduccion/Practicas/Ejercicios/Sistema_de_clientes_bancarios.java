package Java.Introduccion.Practicas.Ejercicios;

import java.util.Scanner;

public class Sistema_de_clientes_bancarios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            number = scanner.nextInt();

            switch (number) {

                case 1:
                    System.out.println("Language selection");
                    break;
                case 2:
                    System.out.println("Customer support");
                    break;
                case 3:
                    System.out.println("Check the balance");
                    break;
                case 0:
                    System.out.println("Exit");
            }
        }
        while(number != 0);
    }
}
