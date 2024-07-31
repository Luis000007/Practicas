package Java.Intermedio.Objetos_y_atributos;

public class Vehicle {
    int maxSpeed;
    int wheels;
    String color;
    double fuelCapacity;

    void horn() {
        System.out.println("Beep!");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.color = "red";
        v2.horn();
    }
}
