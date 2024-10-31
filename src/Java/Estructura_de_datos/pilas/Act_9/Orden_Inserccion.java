package Java.Estructura_de_datos.pilas.Act_9;

public class Orden_Inserccion {

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
    }

    public void mostrarArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void ejecutar(int[] arr) {
        System.out.println("Arreglo antes de ordenamiento por inserción:");
        mostrarArreglo(arr);
        ordenacionInsercion(arr);
        System.out.println("Arreglo después de ordenamiento por inserción:");
        mostrarArreglo(arr);
    }
}

