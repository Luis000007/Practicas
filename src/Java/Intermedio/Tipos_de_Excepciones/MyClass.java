package Java.Intermedio.Tipos_de_Excepciones;

public class MyClass {
    public static void main(String[ ] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //some code
            int value = 7;
            value = value / 0;
        }
    }
}