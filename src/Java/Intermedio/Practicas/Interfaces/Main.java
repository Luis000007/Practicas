package Java.Intermedio.Practicas.Interfaces;

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.swim();
        dog.play();
        cat.swim();
        cat.play();
    }
}

interface Swimmer {
    void swim();
}

interface Player {
    void play();
}

// Implement the Swimmer and the Player interfaces
abstract class Animal implements Swimmer, Player {
    // Podrías tener métodos o propiedades comunes para todos los animales aquí
}

// Override the swim() and the play() methods
class Dog extends Animal {
    public void swim() {
        System.out.println("Dog is swimming");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

// Define the Cat class, overriding the swim() and play() methods
class Cat extends Animal {
    public void swim() {
        System.out.println("Cat is swimming");
    }

    public void play() {
        System.out.println("Cat is playing");
    }
}
