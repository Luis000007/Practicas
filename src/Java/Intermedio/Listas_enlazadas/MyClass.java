package Java.Intermedio.Listas_enlazadas;

import java.util.LinkedList;

public class MyClass {
    public static void main(String[ ] args) {

        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");

        c.remove("Green");

        System.out.println(c);
    }
}