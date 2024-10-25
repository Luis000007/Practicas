package Java.Estructura_de_datos.pilas.Act_9;

public class Orden_Inserccion {

    public static void ordenacionInsercion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int clave = arr[i];  // El valor que se va a insertar
            int j = i - 1;

            // Mueve los elementos del arreglo arr[0...i-1] que son mayores que clave,
            // una posición hacia adelante para hacer espacio para la clave
            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = clave;  // Inserta la clave en la posición correcta
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arreglo = {12, 11, 13, 5, 6};

        System.out.println("Arreglo antes del ordenamiento:");
        mostrarArreglo(arreglo);

        ordenacionInsercion(arreglo);

        System.out.println("Arreglo después del ordenamiento por inserción:");
        mostrarArreglo(arreglo);
    }
}
