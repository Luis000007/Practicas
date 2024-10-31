package Java.Estructura_de_datos.pilas.Act_9;

public class Orden_Shell {
    public void Shell(int[] arreglo) {
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
        System.out.println("Arreglo ordenado Shell:");
        mostrarShell(arreglo);
    }

    public void mostrarShell(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }
        System.out.println();
    }
}
