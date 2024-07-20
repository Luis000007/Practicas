package Java.Introduccion.Practicas.Toma_de_decisiones;

public class if_ {
    public static void main(String[]args){

        /*
        Las declaraciones condicionales se utilizan para realizar diferentes accionesen funcion de distintas condiciones.

        Por ejemplo, un programa de facturacion puede aplicarun descuento al total solo si el importe es superior a un umbral.

        if, es una de las declaraciones condicionales mas utilizads. Si la condicion de la declaracion if e true,
        el bloque de codigo dentro de la declaracion if se ejecutara.

        Sintax:
        if(condicion){
        }

         */

        /*

        < menor que                   == igual a

        > mayor que                   <= manor o igual a

        != no igual a                 >= mayor o igual que

         */

        // Ejemplo

        int age = 24;
        if (age >= 18) {
            System.out.println("Welcome");
        }
    }
}
