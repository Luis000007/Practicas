package Java.Intermedio.Casting.Downcasting;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class DowncastingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting (automático)

        // Aquí se intenta acceder al método bark() de la clase Dog.
        // Necesitamos downcasting porque myAnimal es de tipo Animal.
        Dog myDog = (Dog) myAnimal; // Downcasting (explícito)

        // Ahora podemos acceder a los métodos específicos de Dog
        myDog.makeSound(); // Output: Animal makes a sound
        myDog.bark();      // Output: Dog barks

        // Si intentamos hacer un downcast incorrecto, obtendremos una excepción
        // Animal anotherAnimal = new Animal();
        // Dog anotherDog = (Dog) anotherAnimal; // Esto lanzará ClassCastException
    }
}
