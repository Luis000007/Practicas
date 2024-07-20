package Java.Introduccion.Practicas.Haciendo_matematicas;

public class Operaciones_con_variables {
    public static void main(String[]args){

        int x = 6;
        int y = 3;

        System.out.println(x+y);


        double price1 = 24.99;
        double price2 = 19.45;
        double sum = price1 + price2;

        System.out.println(sum);

        /*
        Al darle un valor a las variables, con solo darle signos a las variables, se realizara la operacion.
         */

        int a = 3;
        int b = 2;
        int z = a + b;

        System.out.println(z + a);

        // Porsentajes

        int price = 1200;
        System.out.println(price * 0.2); // Multiplicando o.2 se obtiene el 20%

        // Division

        double L = 15; double G = 4;
        double result = L/G;

        System.out.println(result);

        // Resto | Lo que sobra de una division

        int item = 23;
        int rest = item % 5;

        System.out.println(rest);

        // Nombres

        String firstname = "James";
        String lastname = "Smith";
        String fullname = firstname + lastname;

        System.out.println(fullname);

    }
}