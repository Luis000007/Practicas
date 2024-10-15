package Java.Estructura_de_datos.pilas.Arboles;

public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol nodoIzq, nodoDer;

    public NodoArbol(int d, String nom) {
        this.dato = d;
        this.nombre = nom;
        this.nodoDer = null;
        this.nodoIzq = null;
    }

    public String toString() {
        return nombre + " El dato es: " + dato;
    }
}
