package Java.Introduccion.Practicas.Bucles.While_;

public class dowhile_ {
    public static void main (String[] args) {

        /*
        Otra variante del bucle while es do-while

         */

        int x = 0;

        do {
            System.out.println(x);

            x ++;        // Entre mas aumentos se agruguen mas aumentara la incrementacion. de dos en dos, de tres en tres, etc

        } while (x < 15);
    }
}
