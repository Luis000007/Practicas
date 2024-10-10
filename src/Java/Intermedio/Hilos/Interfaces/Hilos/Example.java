package Java.Intermedio.Hilos.Interfaces.Hilos;

class Loader implements Runnable {
    public void run() {
        System.out.println("Hello from the Runnable");
    }
}

class MyClass {
    public static void main(String[] args) {
        Loader loader = new Loader();
        Thread thread = new Thread(loader);
        thread.start(); // Crea y comienza un nuevo hilo
    }
}
