package Java.Estructura_de_datos.pilas.Metodos_de_ordenamiento;

import java.util.Arrays;

public class M_Ordenamiento {

    public void burbuja(int[] arreglo) {//-----------------------------------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        mostrarArreglo(arreglo);
    }

    public void insercion(int[] arreglo) {//-----------------------------------------------------------------------------------------------------------------------------------------
        for (int i = 1; i < arreglo.length; i++) {
            int clave = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }
        mostrarArreglo(arreglo);
    }

    public void intercambio(int[] arreglo) {//-----------------------------------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        mostrarArreglo(arreglo);
    }

    public void seleccion(int[] arreglo) {//-----------------------------------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < arreglo.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }
            int temp = arreglo[minimo];
            arreglo[minimo] = arreglo[i];
            arreglo[i] = temp;
        }
        mostrarArreglo(arreglo);
    }

    public void shell(int[] arreglo) {//-----------------------------------------------------------------------------------------------------------------------------------------
        int n = arreglo.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arreglo[i];
                int j;
                for (j = i; j >= gap && arreglo[j - gap] > temp; j -= gap) {
                    arreglo[j] = arreglo[j - gap];
                }
                arreglo[j] = temp;
            }
        }
        mostrarArreglo(arreglo);
    }

    public void mostrarArreglo(int[] arreglo) {
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }
}




