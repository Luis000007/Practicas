package Java.Ejercicios_de_practica.Experimentos;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/*
Nodo (Node):

- Cada nodo tiene un data que almacena el valor y un next que apunta al siguiente nodo en la lista.
 */

class LinkedList {
    Node head;

    // Método para agregar un nodo al final de la lista
    void addToEnd(int data) {
        Node newNode = new Node(data);

        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza (head)
        if (head == null) {
            head = newNode;
        } else {
            // Usamos 'temp' para recorrer la lista
            Node temp = head;

            // Recorremos la lista hasta llegar al último nodo
            while (temp.next != null) {
                temp = temp.next;  // Avanzamos al siguiente nodo
            }

            // Asignamos el nuevo nodo al último nodo encontrado
            temp.next = newNode;
        }
    }

    /*
    Agregar al Final (addToEnd):

- Cuando queremos agregar un nuevo nodo al final de la lista, primero verificamos si la lista está vacía (head == null).

- Si lo está, el nuevo nodo se convierte en la cabeza de la lista. Si la lista no está vacía, usamos la variable temp para recorrer la lista.
temp comienza apuntando a la cabeza de la lista (head).

- Mientras temp.next != null, significa que aún no hemos llegado al final de la lista, por lo que avanzamos temp al siguiente nodo (temp = temp.next).

- Una vez que temp.next es null, hemos encontrado el último nodo. En este punto, asignamos temp.next = newNode para agregar el nuevo nodo al final.
     */

    // Método para imprimir la lista
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

/*
Imprimir la Lista (printList):

Nuevamente, usamos temp para recorrer la lista desde la cabeza hasta el final, imprimiendo los datos de cada nodo.
 */

public class g {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);

        list.printList();  // Salida: 1 2 3 4
    }
}
