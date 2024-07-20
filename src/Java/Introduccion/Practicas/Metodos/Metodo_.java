package Java.Introduccion.Practicas.Metodos;

public class Metodo_ {


    static void welcome() {
        System.out.println("Welcome");
        System.out.println("I am a method");
        System.out.println("End of method");
    }
    public static void main(String[] args) {
        welcome();

        // Puedes llamar a un método tantas veces como sea necesario.
        // Ejemplo:

        welcome();
        welcome();

    }
}
