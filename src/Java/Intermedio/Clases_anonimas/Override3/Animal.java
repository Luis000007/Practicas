package Java.Intermedio.Clases_anonimas.Override3;

public class Animal {
    public void makeSound (){
        System.out.println("pipiip");

    }
}


class Main {
    public static void main(String[] args) {

        // Creación de una clase anónima que implementa la interfaz Animal
        Animal cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Meow");
            }
        };

        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Woof");
            }
        };

        // Llamada al método makeSound() en ambas instancias
        cat.makeSound(); // Imprime "Meow"
        dog.makeSound(); // Imprime "Woof"
    }
}
