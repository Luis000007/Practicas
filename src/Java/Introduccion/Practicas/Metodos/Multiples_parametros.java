package Java.Introduccion.Practicas.Metodos;

public class Multiples_parametros {

    /*
    Los métodos pueden tomar múltiples parámetros. Para ello, basta con separarlos mediante comas, por ejemplo:

    static void welcome(String name, int age) {
  System.out.println("Welcome, "+name);
  System.out.println("Your age: "+age);
}

       Ahora, nuestro método welcome() toma un String y un número entero como parámetros.
     */

    static void welcome(String name, int age) {
        System.out.println("Welcome, "+name);
        System.out.println("Your age: "+age);
    }
    public static void main(String[] args) {
        welcome("James", 42);
        welcome("Amy", 25);
    }
}


