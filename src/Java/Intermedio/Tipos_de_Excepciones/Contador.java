package Java.Intermedio.Tipos_de_Excepciones;

class Contador extends Thread {
    public void run() {
        // Un bucle que contará de 1 a 5 con una pausa de 1 segundo entre cada número
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contador: " + i);
            try {
                // Pausa el hilo durante 1 segundo (1000 milisegundos)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido.");
            }
        }
        System.out.println("¡Contador terminado!");
    }
}

 class Main {
    public static void main(String[] args) {
        // Crear e iniciar el hilo
        Contador contador = new Contador();
        contador.start();
    }
}
