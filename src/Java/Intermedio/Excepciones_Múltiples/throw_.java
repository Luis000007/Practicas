package Java.Intermedio.Excepciones_Múltiples;

class ThrowExample {

    static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(div(42, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
La palabra clave <b>throw</b> te permite generar excepciones manualmente desde tus métodos.
Algunos de los numerosos tipos de excepciones disponibles incluyen

IndexOutOfBoundsException,
IllegalArgumentException,
ArithmeticException,

y así sucesivamente.
Por ejemplo, podemos lanzar una ArithmeticException en nuestro método cuando el parámetro es 0.
 */