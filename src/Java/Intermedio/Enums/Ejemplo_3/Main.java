package Java.Intermedio.Enums.Ejemplo_3;

enum Color  {

    ROJO, AZUL, VERDE;

}

class ImprimirColor {

    public static void main(String[ ] args) {

        Color color = Color.ROJO;

        switch(color) {

            case AZUL:

                System.out.println("1");

                break;

            case VERDE:

                System.out.println("2");

                break;

            default:

                System.out.println("0");

                break;

        }

    }

}