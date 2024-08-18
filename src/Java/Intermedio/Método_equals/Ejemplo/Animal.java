package Java.Intermedio.Método_equals;

/*

Recuerda que cuando creas objetos, las variables almacenan referencias a los objetos.
Por lo tanto, cuando comparas objetos usando el operador de prueba de igualdad (==), en realidad compara las referencias y no los valores del objeto.
 */

class Animal {
    String name;
    Animal(String n) {
        name = n;
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1 == a2);
    }
}

/*
A pesar de tener dos objetos con el mismo nombre, la prueba de igualdad devuelve false,
porque tenemos dos objetos diferentes (dos referencias o ubicaciones de memoria diferentes).
 */