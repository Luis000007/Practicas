package Java.Introduccion.Practicas.Metodos;

public class devolviendo_un_valor {

    static double perc(double num, int percentage) {
        double res = num*percentage/100;
        return res;
    }

    /*

Ahora, podemos devolver nuestro resultado utilizando la palabra clave <b>return</b>:

static double perc(double num, int percentage) {
  double res = num*percentage/100;
  return res;
}

La palabra clave <b>return</b> detiene la ejecución del método. Si hay alguna declaración después de <b>return</b>, no se ejecutan.
     */

    public static void main(String[] args) {
        double x = perc(530, 23);
        System.out.println("Result is: "+x);
    }
}

/*
La devolución es útil cuando no necesita imprimir el resultado del método, pero necesita utilizarlo en su código.
 Por ejemplo, un método de cuenta bancaria <b>withdraw()</b> podría devolver el saldo restante de la cuenta.
 */