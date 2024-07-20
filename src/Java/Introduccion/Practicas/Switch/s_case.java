package Java.Introduccion.Practicas.Switch;

public class s_case {
    public static void main(String[]args){

        /*
        En lugar de muchas declaraciones if else, que se vuelven dificiles de leer, podemos usar una declaracion switch.

        Una declaracion switch comprueba la igualdad de un variable con una lista de valores.
         */

        // Ejemplo

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("invalid option");

                /*
                Es importante tener una declaracion break para cada caso.

                 Si no aparece break, el programa continuara ejecutando e siguiente case en el switch,
                 aun que el valor no coincida con la variable que activa.

                 En caso que de que ninguna de las opciones no coincida se puede acompañar con un default.

                 */
        }
    }
}
