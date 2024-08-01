package Java.Intermedio.Final;

class MyClass {
    public static final double PI = 3.14;
    public static void main(String[ ] args) {
        System.out.println(PI);
    }
}

/*
PI ahora es una constante. Cualquier intento de asignarle un valor causará un error.
Los métodos y las clases también pueden ser marcados como final.
 Esto sirve para restringir los métodos para que no puedan ser sobreescritos y las clases para que no puedan ser subclases.
 */