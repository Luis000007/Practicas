package Java.Estructura_de_datos.pilas.Evidencia_3;

public class M_Ordenamiento {
    private int comparaciones;
    private int iteraciones;
    private int llamadasAFuncion;

    public M_Ordenamiento() {
        resetMetrics();
    }

    public void resetMetrics() {
        comparaciones = 0;
        iteraciones = 0;
        llamadasAFuncion = 0;
    }

    public int getComparaciones() {
        return comparaciones;
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public int getLlamadasAFuncion() {
        return llamadasAFuncion;
    }

    // Método Burbuja
    public void burbuja(int[] arreglo) {//-----------------------------------------------------------------------------------------------------------------------------------------
        resetMetrics();
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            iteraciones++;
            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++;
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Método Selección
    public void seleccion(int[] arreglo) {//-----------------------------------------------------------------------------------------------------------------------------------------
        resetMetrics();
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            iteraciones++;
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arreglo[minIndex];
            arreglo[minIndex] = arreglo[i];
            arreglo[i] = temp;
        }
    }

    // Método Inserción
    public void insercion(int[] arreglo) {//-----------------------------------------------------------------------------------------------------------------------------------------
        resetMetrics();
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            iteraciones++;
            int key = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > key) {
                comparaciones++;
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            comparaciones++;
            arreglo[j + 1] = key;
        }
    }

    // QuickSort
    public void quickSort(int[] arreglo, int low, int high) {//-----------------------------------------------------------------------------------------------------------------------------------------
        llamadasAFuncion++;
        if (low < high) {
            int pi = partition(arreglo, low, high);
            quickSort(arreglo, low, pi - 1);
            quickSort(arreglo, pi + 1, high);
        }
    }

    private int partition(int[] arreglo, int low, int high) {
        int pivot = arreglo[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            comparaciones++;
            if (arreglo[j] <= pivot) {
                i++;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[high];
        arreglo[high] = temp;
        return i + 1;
    }

    // MergeSort
    public void mergeSort(int[] arreglo, int left, int right) {//-----------------------------------------------------------------------------------------------------------------------------------------
        llamadasAFuncion++;
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arreglo, left, mid);
            mergeSort(arreglo, mid + 1, right);

            merge(arreglo, left, mid, right);
        }
    }

    private void merge(int[] arreglo, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arreglo, left, L, 0, n1);
        System.arraycopy(arreglo, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            comparaciones++;
            if (L[i] <= R[j]) {
                arreglo[k] = L[i];
                i++;
            } else {
                arreglo[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arreglo[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arreglo[k] = R[j];
            j++;
            k++;
        }
    }

    // HeapSort
    public void heapSort(int[] arreglo) {//-----------------------------------------------------------------------------------------------------------------------------------------
        resetMetrics();
        int n = arreglo.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arreglo, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arreglo[0];
            arreglo[0] = arreglo[i];
            arreglo[i] = temp;

            heapify(arreglo, i, 0);
        }
    }

    private void heapify(int[] arreglo, int n, int i) {
        llamadasAFuncion++;
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arreglo[left] > arreglo[largest]) {
            comparaciones++;
            largest = left;
        }

        if (right < n && arreglo[right] > arreglo[largest]) {
            comparaciones++;
            largest = right;
        }

        if (largest != i) {
            int swap = arreglo[i];
            arreglo[i] = arreglo[largest];
            arreglo[largest] = swap;

            heapify(arreglo, n, largest);
        }
    }
}
