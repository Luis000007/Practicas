package Java.Ejercicios_de_practica.Area_de_un_circulo;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        System.out.println("Ingresa el radio de tu circulo: ");

        Scanner sc = new Scanner(System.in);

        double radio = sc.nextDouble();

        if (radio < 0) {
            System.out.println("El radio no puede ser negativo");

        } else {

            double Alcuadrado = Math.pow(radio, 2);

            double Area = Math.PI * Alcuadrado;

            System.out.println("El area del circulo es: " + Area);

        }
    }
}