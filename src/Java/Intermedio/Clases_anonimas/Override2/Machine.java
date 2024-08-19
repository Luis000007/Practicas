package Java.Intermedio.Clases_anonimas.Override2;

class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

class Program {
    public static void main(String[ ] args) {
        Machine m1 = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        Machine m2 = new Machine();
        m2.start();      // 1 para Wooooo, 2 para Starting.....

    }
}