package Java.Estructura_de_datos.pilas.Matriz_de_adyacencia;

public class MatrizAdyacencia {
    public static void main(String[] args) {
        int n = 4; // Número de vértices
        int[][] matriz = new int[n][n];

        // Agregar conexiones: (A=0, B=1, C=2, D=3)
        matriz[0][1] = 1; // A <-> B
        matriz[1][0] = 1;
        matriz[0][2] = 1; // A <-> C
        matriz[2][0] = 1;
        matriz[1][3] = 1; // B <-> D
        matriz[3][1] = 1;

        // Imprimir la matriz de adyacencia
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
