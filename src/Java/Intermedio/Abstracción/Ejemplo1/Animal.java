package Java.Intermedio.Abstracción.Ejemplo1;

abstract class Animal {
    int legs = 0;
    abstract void makeSound();
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Program {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}

/*

La abstracción de datos proporciona al mundo exterior solo la información esencial,
en un proceso de representación de características esenciales sin incluir detalles de implementación.

Un buen ejemplo del mundo real es un libro. Cuando oyes el término libro, no conoces las especificaciones exactas, como el conteo de páginas,
el color o el tamaño, pero entiendes la idea, o la abstracción, de un libro.

El concepto de abstracción es que nos enfocamos en las cualidades esenciales, en lugar de las características específicas de un ejemplo particular.
 */

/*
En Java, la abstracción se logra utilizando clases abstractas e interfaces.

Una clase abstracta se define utilizando la palabra clave abstract.

- Si una clase se declara como abstracta no se puede instanciar (no puedes crear objetos de ese tipo).

- Para usar una clase abstracta, tienes que heredarla de otra clase.

- Cualquier clase que contenga un método abstracto debe ser definida como abstracta.        
 */