package Java.Ejercicios_de_practica.Prueba_1;

import com.sun.source.tree.WhileLoopTree;

/**Mandaremos a Llamar los nodos creados en clase nodo**/
public class Lista { /**Debera tener cabecera y cola de la lista**/
protected Nodos inicio, fin; /**Punteros saber donde esta inicio y fin**/

public Lista(){ /**Constructor, solo indica los punteros**/
    inicio = null;
    fin = null;
}
    /**Metodo saber si esta lista esta vacia**/
    public boolean Estavacia(){
        if (inicio==null){
            return true;
        }else{
            return false;
        }
    }

    /**Metodo para agregar nodo al inicio de la lista**/
    public void agregarAlInicio(int elemento){
        /**Crear nodo**/
        inicio = new Nodos(elemento,inicio);

        if (fin == null){ /**Si aun no habia nodos**/
            fin =inicio; /**Apunta a inicio**/
        }
    }

    /**Metodo para insertar al final de la lista**/
    public void agregarAlFinal(int elemento){
        if(!Estavacia()){
            fin.siguiente = new Nodos (elemento);
            fin = fin.siguiente;
        }else {
            inicio = fin = new Nodos (elemento);
        }
    }

    /**Metodo para mostrar datos**/
    public void mostrarLista(){
        Nodos recorre = inicio;
        System.out.println("");
        while (recorre!=null){/**Muestra los elementos de cada nodo**/
            System.out.println("[" + recorre.dato + "]" + "==>");
            recorre = recorre.siguiente;
        }
    }

    // Metodo para borrar elemento de la lista del inicio
    public int borrarDelInicio () {
        int elemento = inicio.dato;
        if (inicio==fin) { // solo se tiene un nodo o ninguno
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente; // no sean iguales los elementos
        }
        return elemento; // retornamos el elemento que eliminamos
    }

    public int eliminarFinal () {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;

        } else {
            Nodos temp = inicio;
            while (temp.siguiente != fin) {
                temp = temp.siguiente;
            }
            fin = temp;
            fin.siguiente = null;
        }
        return elemento;
    }

    // Metodo para eliminar elemento de la lista
    public void Eliminar (int elemento) {
        if (!Estavacia()) {
            if (inicio == fin && elemento == inicio.dato) {
                inicio = fin = null;
            } else if (elemento == inicio.dato) {
                inicio = inicio.siguiente;
            } else {
                Nodos anterior, temp;
                anterior = inicio;
                temp = inicio.siguiente;

                while (temp != null && temp.dato != elemento) {
                    anterior.siguiente = temp.siguiente;
                    temp = temp.siguiente;
                }
                if (temp != null) {
                    anterior.siguiente = temp.siguiente;
                    if (temp == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }
}
