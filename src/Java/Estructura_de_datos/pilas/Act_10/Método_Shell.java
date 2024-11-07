package Java.Estructura_de_datos.pilas.Act_10;

public class Método_Shell {
    public void ordenarShell(int[] arreglo) {
        int salto, i, j, k, aux;
        salto = arreglo.length / 2;
        while (salto > 0) {
            for (i = salto; i < arreglo.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (arreglo[j] <= arreglo[k]) {
                        j = -1; // Salir del bucle
                    } else {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = aux;
                        j -= salto;
                    }
                }
            }
            salto = salto / 2;
        }
        calcularPromedio(arreglo);  // Calcular el promedio después de ordenar
    }

    public void mostrarShell(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public void calcularPromedio(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        double promedio = (double) suma / arreglo.length;
        System.out.println();
        System.out.println("Promedio de los números (Shell): " + promedio);
        System.out.println();
    }
}
