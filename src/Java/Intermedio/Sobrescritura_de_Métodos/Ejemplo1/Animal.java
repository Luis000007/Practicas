package Java.Intermedio.Sobrescritura_de_Métodos.Ejemplo1;

class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
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
En el código anterior, la clase Cat sobrescribe el método makeSound() de su superclase Animal.


Reglas para la Sobrescritura de Métodos:
- Debe tener el mismo tipo de retorno y argumentos
- El nivel de acceso no puede ser más restrictivo que el nivel de acceso del método sobrescrito
(Ejemplo: Si el método de la superclase es declarado como público, el método de sobrescritura en la subclase no puede ser ni privado ni protegido)
- Un método declarado final o static no puede ser sobrescrito
- Si un método no puede ser heredado, no puede ser sobrescrito
- Los constructores no pueden ser sobrescritos
 */