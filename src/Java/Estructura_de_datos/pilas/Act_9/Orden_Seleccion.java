package Java.Estructura_de_datos.pilas.Act_9;

public class Orden_Seleccion {

    public void ordenSelecc (int a[]){
        for (int i = 0; i < a.length - 1; i++){
            int minimo = i;
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[minimo]){
                    minimo = j;
                }
            }
            int aux = a[i];
            a[i] = a[minimo];
            a[minimo] = aux;
        }
    }

    public void mostrarOrdenaSeleccion(int a[]){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] + "\t");
        }
    }
}
