package Java.Introduccion.Practicas.Bucles.for_;

public class Break {
    public static void main (String[] args) {

        /*
        Tambien puede utilizarse break para terminar un bucle con for
        Run: 1, 2, 3, 4.

         */

        for (int x = 1; x < 10; x++) {
            System.out.println(x);
            if (x == 4) {
                break;
            }
        }
    }
}
