package Java.Estructura_de_datos.pilas.Act_9;

public class Orden_Burbuja {

    public void ordenBubble(int[] arreglo) {
        int aux;
        boolean intercambio;

        while (true) {
            intercambio = false;

            for (int i = 1; i < arreglo.length; i++) {
                if (arreglo[i] < arreglo[i - 1]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i - 1];
                    arreglo[i - 1] = aux;
                    intercambio = true;
                }
            }

            if (!intercambio) {
                break;
            }
        }
    }

    public void mostrarOrdenaBurbuja(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void ejecutar(int[] arreglo) {
        System.out.println("Arreglo antes de ordenamiento por burbuja:");
        mostrarOrdenaBurbuja(arreglo);
        ordenBubble(arreglo);
        System.out.println("Arreglo después de ordenamiento por burbuja:");
        mostrarOrdenaBurbuja(arreglo);
    }
}
