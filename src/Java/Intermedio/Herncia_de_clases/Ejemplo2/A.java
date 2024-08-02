package Java.Intermedio.Herncia_de_clases.Ejemplo2;

class A {
    public A() {
        System.out.println("New A");
    }
}
class B extends A {
    public B() {
        System.out.println("New B");
    }
}

class Program {
    public static void main(String[ ] args) {
        B obj = new B();
    }
}

/*
Puedes acceder a la superclase desde la subclase utilizando la palabra clave super.
Por ejemplo, super.var accede al miembro var de la superclase.
 */