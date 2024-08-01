package Java.Intermedio.Metodo_static.Ejemplo2;

public class Utilidades {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int resultado = Utilidades.sumar(5, 3);

        System.out.println("La suma es: " + resultado);

    }
}