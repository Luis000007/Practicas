package Java.Intermedio.Getters_and_Setters.Ejemplo;

public class Vehicle {
    private String color;

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor(String c) {
        this.color = c;
    }
}
/*
El método getter devuelve el valor del atributo.
El método setter toma un parámetro y lo asigna al atributo.

La palabra clave this se usa para referirse al objeto actual. Básicamente, this.color es el atributo color del objeto actual.
 */

class Program {
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle();
        v1.setColor("Red");
        System.out.println(v1.getColor());
    }
}