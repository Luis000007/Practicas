package Java.Estructura_de_datos.pilas.Act_8;

import java.util.ArrayList;
import java.util.List;

class Nodo {
    int valor;
    Nodo izquierda, derecha;


    public Nodo(int valor) {
        this.valor = valor;
        izquierda = derecha = null;
    }
}


class BinaryTree {
    Nodo raiz;


    public BinaryTree() {
        raiz = null;
    }


    public void add(int valor) {
        raiz = addRecursivo(raiz, valor);
    }


    private Nodo addRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }


        if (valor < actual.valor) {
            actual.izquierda = addRecursivo(actual.izquierda, valor);
        } else if (valor > actual.valor) {
            actual.derecha = addRecursivo(actual.derecha, valor);
        }

        return actual;
    }


    public List<Integer> preOrden() {
        List<Integer> resultado = new ArrayList<>();
        preOrdenRecursivo(raiz, resultado);
        return resultado;
    }


    private void preOrdenRecursivo(Nodo nodo, List<Integer> resultado) {
        if (nodo != null) {
            resultado.add(nodo.valor);
            preOrdenRecursivo(nodo.izquierda, resultado);
            preOrdenRecursivo(nodo.derecha, resultado);
        }
    }


    public void mostrarPreOrden() {
        List<Integer> resultado = preOrden();
        System.out.println("Recorrido en preorden: " + resultado);
    }
}
