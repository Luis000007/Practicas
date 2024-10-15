package Java.Estructura_de_datos.pilas.Arboles;

public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // método para insertar un nodo en el árbol
    public void agregarNodo(int d, String nom) {
        NodoArbol nuevo = new NodoArbol(d, nom);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol temp = raiz;
            NodoArbol padre;
            while (true) {
                padre = temp;
                if (d < temp.dato) {
                    temp = temp.nodoIzq;
                    if (temp == null) {
                        padre.nodoIzq = nuevo;
                        return;
                    }
                } else {
                    temp = temp.nodoDer;
                    if (temp == null) {
                        padre.nodoDer = nuevo;
                        return;
                    }
                }
            }
        }
    }

    // Método para saber cuando el árbol está vacío
    public boolean estaVacio() {
        return raiz == null;
    }

    // MÉTODO RECORRER EL ÁRBOL IN ORDEN (ORDEN)
    public void inOrden(NodoArbol nr) {
        if (nr != null) {
            inOrden(nr.nodoIzq);
            System.out.println(nr.dato); // muestra el nodo raíz
            inOrden(nr.nodoDer);
        }
    }

    // MÉTODO RECORRER EL ÁRBOL PREORDEN
    public void preOrden(NodoArbol nr) {
        if (nr != null) {
            System.out.println(nr.dato); // muestra el nodo raíz
            preOrden(nr.nodoIzq);
            preOrden(nr.nodoDer);
        }
    }

    // MÉTODO RECORRER EL ÁRBOL POSTORDEN
    public void postOrden(NodoArbol nr) {
        if (nr != null) {
            postOrden(nr.nodoIzq);
            postOrden(nr.nodoDer);
            System.out.println(nr.dato); // muestra el nodo raíz
        }
    }

    // MÉTODO PARA BUSCAR UN NODO EN EL ÁRBOL
    public NodoArbol buscarNodo(int d) {
        NodoArbol aux = raiz;
        while (aux.dato != d) {
            if (d < aux.dato) {
                aux = aux.nodoIzq;
            } else {
                aux = aux.nodoDer;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }
}