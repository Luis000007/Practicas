package Java.Introduccion.Practicas.Bucles.While_;

public class cuatro {
    public static void main (String[] args) {

        /*
        Para sumar los numeros del 1 al 100 / RESPUESTA: 5050

         */

        int sum = 0;
        int num = 0;

        while (num <= 100) {
            sum += num;
            num ++;

        }
        System.out.println(sum);
    }
}
