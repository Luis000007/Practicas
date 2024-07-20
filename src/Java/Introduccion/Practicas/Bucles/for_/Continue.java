package Java.Introduccion.Practicas.Bucles.for_;

public class Continue {
    public static void main (String[] args) {

        /*
        Otra declaracion de control es continue.
        Hace que el bucle se salte la interaccion actual y pase a la siguiente.

         */

        // Ejemplo:

        for (int x = 10; x <= 100; x += 10) {
            if (x == 30) {
                continue;
            }
            if (x == 60) {
                continue;
            }
            if (x == 90) {
                continue;
            }
            System.out.println(x);

            /*
            Supongamos que en un sistema de emision de billetes de avion debe calcular el costo total de todos los billetes comprados.
            Los billetes para niños de 3 años so gratis.

            Podemos utilizar un bucle while para interar por la lista de pasajeros y calcular el costo de los billetes.
            En este caso, la declaracion continue se puede utilizar para saltarse a los niños.

             */
        }
    }
}
