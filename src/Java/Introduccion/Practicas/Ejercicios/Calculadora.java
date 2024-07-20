package Java.Introduccion.Practicas.Ejercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {

        System.out.println("Asigna un valor para a y b: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        int a = sc.nextInt();
        System.out.println("b: ");
        int b = sc.nextInt();

        System.out.println("El valor de a es:" + a);
        System.out.println("El valor de b es:" + b);

        System.out.println("************************************");
        System.out.println("Selecciona la operacion a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Divion");
        System.out.println("************************************");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Suma");
                int z = a + b;
                System.out.println(z);

                break;
            case 2:
                System.out.println("Resta");
                int i = a - b;
                System.out.println(i);

                break;
            case 3:
                System.out.println("Multiplicacion");
                int j = a * b;
                System.out.println(j);

                break;
            case 4:
                System.out.println("Division");
                int k = a / b;
                System.out.println(k);

                break;
            default:
                System.out.println("Opcion invalida");

        }
    }
}

