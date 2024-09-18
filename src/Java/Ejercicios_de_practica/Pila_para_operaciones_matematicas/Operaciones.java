package Java.Ejercicios_de_practica.Pila_para_operaciones_matematicas;

import java.util.Scanner;
import java.util.Stack;

public class Operaciones {

    private Stack<Double> pilaResultados;

    // Constructor que recibe la pila
    public Operaciones(Stack<Double> pilaResultados) {
        this.pilaResultados = pilaResultados;
    }

    public void Suma() {
        Scanner scanner = new Scanner(System.in);
        int Suma_opciones;
        double Uno, Dos, Tres, Cuatro, Cinco, resultado = 0;  // Inicializamos el resultado

        System.out.println("¿Cuántos números deseas sumar?");
        System.out.println("1. 2 números");
        System.out.println("2. 3 números");
        System.out.println("3. 4 números");
        System.out.println("4. 5 números");
        System.out.print("Selecciona una opción: ");
        Suma_opciones = scanner.nextInt();

        switch (Suma_opciones) {
            case 1:
                System.out.print("Ingresa el primer número: ");
                Uno = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                Dos = scanner.nextDouble();
                resultado = Uno + Dos;
                break;

            case 2:
                System.out.print("Ingresa el primer número: ");
                Uno = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                Dos = scanner.nextDouble();
                System.out.print("Ingresa el tercer número: ");
                Tres = scanner.nextDouble();
                resultado = Uno + Dos + Tres;
                break;

            case 3:
                System.out.print("Ingresa el primer número: ");
                Uno = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                Dos = scanner.nextDouble();
                System.out.print("Ingresa el tercer número: ");
                Tres = scanner.nextDouble();
                System.out.print("Ingresa el cuarto número: ");
                Cuatro = scanner.nextDouble();
                resultado = Uno + Dos + Tres + Cuatro;
                break;

            case 4:
                System.out.print("Ingresa el primer número: ");
                Uno = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                Dos = scanner.nextDouble();
                System.out.print("Ingresa el tercer número: ");
                Tres = scanner.nextDouble();
                System.out.print("Ingresa el cuarto número: ");
                Cuatro = scanner.nextDouble();
                System.out.print("Ingresa el quinto número: ");
                Cinco = scanner.nextDouble();
                resultado = Uno + Dos + Tres + Cuatro + Cinco;
                break;

            default:
                System.out.println("Opción no válida.");
                return;  // Termina el método si se selecciona una opción inválida
        }

        // Imprimir el resultado y guardarlo en la pila
        System.out.println();
        System.out.println("*************");
        System.out.println("RESULTADO: " + resultado);
        pilaResultados.push(resultado);
        System.out.println("*************");
        System.out.println();
    }

    public void Resta() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero:");
        double Uno = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        double Dos = scanner.nextDouble();

        double resultado = Uno - Dos;

        System.out.println();
        System.out.println("*************");
        System.out.println("RESULTADO: " + resultado);
        pilaResultados.push(resultado);
        System.out.println("*************");
        System.out.println();
    }

    public void Multiplicacion() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero:");
        double Uno = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        double Dos = scanner.nextDouble();

        double resultado = Uno * Dos;

        System.out.println();
        System.out.println("*************");
        System.out.println("RESULTADO: " + resultado);
        pilaResultados.push(resultado);
        System.out.println("*************");
        System.out.println();
    }

    public void Division() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero:");
        double Uno = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        double Dos = scanner.nextDouble();

        double resultado = Uno / Dos;

        System.out.println();
        System.out.println("*************");
        System.out.println("RESULTADO: " + resultado);
        pilaResultados.push(resultado);
        System.out.println("*************");
        System.out.println();
    }
}
