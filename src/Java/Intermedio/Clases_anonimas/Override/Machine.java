package Java.Intermedio.Clases_anonimas.Override;

class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

class Program {
    public static void main(String[ ] args) {
        Machine m = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        m.start();
    }
}

/*
La anotación @Override se utiliza para hacer que tu código sea más fácil de entender, porque hace más obvio cuando los métodos son sobrescritos.
 */