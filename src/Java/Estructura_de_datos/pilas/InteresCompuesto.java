package Java.Estructura_de_datos.pilas;

import java.util.Scanner;

public class InteresCompuesto {

    public static double calcularInteresCompuesto(double capital, double tasaInteresMensual, int meses) {
        if (meses == 0) {
            return capital;
        } else {
            double nuevoCapital = capital * (1 + tasaInteresMensual);
            return calcularInteresCompuesto(nuevoCapital, tasaInteresMensual, meses - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inversionInicial = 0;
        int opcion = 0;

        while (true) {
            System.out.print("Ingresa la inversión inicial (valor positivo): ");
            if (scanner.hasNextDouble()) {
                inversionInicial = scanner.nextDouble();
                if (inversionInicial > 0) {
                    break;
                } else {
                    System.out.println("Error: La inversión debe ser un número positivo.");
                }
            } else {
                System.out.println("Error: Ingreso inválido. Por favor ingresa un número válido.");
                scanner.next();
            }
        }

        while (true) {
            System.out.println("Selecciona el periodo de inversión: ");
            System.out.println("1. 365 días (+10.5% anual)");
            System.out.println("2. 180 días (+10.15% anual)");
            System.out.println("3. 90 días (+12.5% anual)");
            System.out.println("4. 30 días (+12.0% anual)");
            System.out.println("5. 7 días (+10.95% anual)");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 5) {
                    break;
                } else {
                    System.out.println("Error: Selecciona una opción válida (1 a 5).");
                }
            } else {
                System.out.println("Error: Ingreso inválido. Por favor selecciona una opción válida (1 a 5).");
                scanner.next();
            }
        }

        int meses = 0;
        double tasaInteresAnual = 0;

        switch (opcion) {
            case 1:
                meses = 12;
                tasaInteresAnual = 0.105;
                break;
            case 2:
                meses = 6;
                tasaInteresAnual = 0.1015;
                break;
            case 3:
                meses = 3;
                tasaInteresAnual = 0.125;
                break;
            case 4:
                meses = 1;
                tasaInteresAnual = 0.12;
                break;
            case 5:
                meses = 7 / 30;
                tasaInteresAnual = 0.1095;
                break;
            default:

                System.out.println("Error: Opción no válida.");
                return;
        }

        double tasaInteresMensual = tasaInteresAnual / 12;

        double montoFinal = calcularInteresCompuesto(inversionInicial, tasaInteresMensual, meses);

        System.out.printf("El monto final después de %d meses sera: %.2f\n", meses, montoFinal);

        scanner.close();
    }
}
