package Java.Intermedio.Interfaces.Ejemplo1;


/*

Una interface es una clase completamente abstracta que contiene solo métodos abstractos.

Algunas especificaciones para las interfaces:

- Se define utilizando la palabra clave interface.

- Puede contener solo variables estáticas finales.

- No puede contener un constructor porque las interfaces no pueden ser instanciadas.

- Las interfaces pueden extender otras interfaces.

- Una clase puede implementar cualquier cantidad de interfaces.


 */

interface Animal {
    public void eat();
    public void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
    public void eat() {
        System.out.println("omnomnom");
    }
}

class Program {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}

/*
Las interfaces tienen las siguientes propiedades:

- Una interfaz es implícitamente abstracta. No es necesario usar la palabra clave abstract al declarar una interfaz.

- Cada método en una interfaz también es implícitamente abstracto, por lo que no se necesita la palabra clave abstract.

- Los métodos en una interfaz son implícitamente públicos.

 */

/*
Una clase puede heredar solo de una superclase, ¡pero puede implementar múltiples interfaces!
 */