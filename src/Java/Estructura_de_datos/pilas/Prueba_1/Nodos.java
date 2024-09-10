package Java.Estructura_de_datos.pilas.Prueba_1;

/**PRIMERO CREAMOS NUESTROS NODOS NECESARIOS**/
public class Nodos {
    public int dato;
    public Nodos siguiente; /**Puntero enlace**/

    /**Constructor para insertar al final**/
    public Nodos(int d){ /**Un nodo al final**/
        this.dato = d;
        this.siguiente = null;
    }


    /**Constructo para insertar al inicio LISTA**/
    public Nodos(int d, Nodos n)/**Dos parametros Dato y un puntero hacia nodo**/{
        dato = d;
        siguiente = n;
    }
}

