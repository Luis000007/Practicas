package Java.Estructura_de_datos.pilas.Act_10;

public class Método_Inserción {

    public void ordenacionInsercion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int clave = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = clave;
        }
        calcularPromedio(arr);  // Calcular el promedio después de ordenar
    }

    public void mostrarArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
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
        System.out.println("Promedio de los números (Inserción): " + promedio);
        System.out.println();
    }
}
