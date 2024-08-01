package Java.Intermedio.Metodo_static.Ejemplo3;

public class Vehicle {
    public static void horn() {
        System.out.println("Beep, beeep");
    }
}

class MyClass {
    public static void main(String[ ] args) {

        Vehicle.horn();
    }
}