package Java.Intermedio.Practicas.celebrateBirthday;

public class Person {
    private String name;
    private int age;

    Person (String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }
}