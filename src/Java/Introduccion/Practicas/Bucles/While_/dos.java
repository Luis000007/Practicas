package Java.Introduccion.Practicas.Bucles.While_;

public class dos {
    public static void main (String[] args) {

        /*
        x se decrementara 2 veces, quedaria como resultante 6, 4, 2, 0
        Para incrementar: x ++;
                          x ++;
         */

        int x = 8;

        while (x > 0){

            x --;
            x --;

            System.out.println(x);

        }
    }
}

