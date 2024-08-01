package Java.Intermedio.Metodo_static.Ejemplo1;

public class Counter {
    public static int COUNT=0;
    Counter() {
        COUNT++;
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Counter c1 = new Counter();                        // El numero que aparezca en la consola, sera igual al numero de objetos que tenga el programa
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        System.out.println(Counter.COUNT);
    }
}