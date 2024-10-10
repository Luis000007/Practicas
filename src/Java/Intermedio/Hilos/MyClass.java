package Java.Intermedio.Hilos;

class Loader extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Loader obj = new Loader();
        obj.start();
    }
}

/*
Razón por la cual start() es heredado:
Documentación de la API de Java: La clase Thread es parte de la biblioteca estándar de Java (paquete java.lang). En la documentación oficial de la API de Java, se especifica que la clase Thread tiene un método llamado start() que es utilizado para iniciar un nuevo hilo de ejecución.

El método start() está diseñado para realizar las siguientes acciones:
Crear un nuevo hilo.

 */