package Java.Introduccion.Practicas.Metodos;

public class devolviendo_un_valor_ {

    /*
    Creemos un método que tome un parámetro entero, compruebe si la grade es superior a 70 y devuelva un resultado <b>booleano</b>.
    Luego, usemos esto en la función <b>main</b>:
     */

    static boolean check(int grade) {
        if(grade >=70) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int x = 69;
        if(check(x) == true) {
            System.out.println("Congrats!");
        } else {
            System.out.println("Sorry");

            /*
            Como puedes ver, podemos utilizar el método en una declaración <b>if</b>, porque devuelve un valor <b>boolean</b>.
             */

        }
    }
}

/*
El método se puede utilizar en cualquier parte de nuestro programa para comprobar si la nota es positiva o negativa.
En caso de que algo cambie en la lógica de la comprobación, tendremos que modificar únicamente el método,
 sin tocar el resto del programa.
 */