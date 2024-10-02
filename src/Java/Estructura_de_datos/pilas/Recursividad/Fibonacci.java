package Java.Estructura_de_datos.pilas.Recursividad;

public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci fibona = new Fibonacci();
        System.out.println("La sucesion Fibonacci de 4  es: " + fibona.fibonaciRecursivo(8));
        System.out.println("La sucesion Fibinacci mediante ciclo 4 es: " + fibona.fibonaciRecursivo(8));
    }

    public int fibonaciRecursivo(int n) {
        if (n == 1 || n == 2) {
            return 1;

        } else {
            return fibonaciRecursivo(n - 1) + fibonaciRecursivo(n - 2);

        }
    }

    public int fibonacciCiclo (int n) {
        int fibo = 0, primero = 1, segundo = 0;
        while (n>0) {
            fibo = primero = segundo;
            segundo = fibo;
            n--;

        }
        return fibo;

    }
}

