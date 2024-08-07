package Java.Intermedio.Sobrescritura_de_Métodos.Sobrecarga_de_Métodos;

class Program {
    static double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(8, 17));
        System.out.println(max(3.14, 7.68));
    }

}

/*
Cuando los métodos tienen el mismo nombre, pero diferentes parámetros, se conoce como sobrecarga de métodos.
Esto puede ser muy útil cuando necesitas la misma funcionalidad del método para diferentes tipos de parámetros.
El siguiente ejemplo ilustra un método que devuelve el máximo de sus dos parámetros.
 */