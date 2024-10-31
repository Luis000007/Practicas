package Java.Estructura_de_datos.pilas.Act_9;

public class Orden_Intercambio {
    public void intercambio(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    intercambiar(arreglo, i, j);
                }
            }
        }
        System.out.println("Arreglo ordenado por Intercambio:");
        mostrarIntercambio(arreglo);
    }

    public void intercambiar(int[] arreglo, int i, int j) {
        int aux = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
    }

    public void mostrarIntercambio(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }
        System.out.println();
    }
}
