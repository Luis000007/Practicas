package Java.Intermedio.Practicas.Hilos;

class Main {
    public static void main(String[ ] args) {
        Name name = new Name();
        //set priority

        Welcome welcome = new Welcome();
        //set priority

        welcome.start();
        name.start();

    }
}

//extend the Thread class
class Welcome extends Thread {
    public void run() {
        System.out.println("Welcome!");
    }
}

//extend the Thread class
class Name extends Thread {
    public void run() {
        System.out.println("Please enter your name");
    }
}