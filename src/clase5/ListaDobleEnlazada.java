package clase5;

public class ListaDobleEnlazada {
    private Node head;

    public ListaDobleEnlazada() {
        this.head = null;
    }

    public void agregarAlFinal(int data) {
        Node nuevoNodo = new Node(data);
        if (head == null) {
            head = nuevoNodo;
            return;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(nuevoNodo);
        nuevoNodo.setPrev(temp);
    }


    public void eliminarNodo(int posicion) {
        if (head == null || posicion < 0) {
            System.out.println("Posición inválida o la lista está vacía.");
            return;
        }

        Node temp = head;

        if (posicion == 0) {
            if (head.getNext() != null) {
                head = head.getNext();
                head.setPrev(null);
            } else {
                head = null; // Si solo hay un elemento
            }
            return;
        }

        for (int i = 0; temp != null && i < posicion; i++) {
            temp = temp.getNext();
        }

        if (temp == null) {
            System.out.println("Posición fuera de rango.");
            return;
        }

        if (temp.getNext() != null) {
            temp.getNext().setPrev(temp.getPrev());
        }

        if (temp.getPrev() != null) {
            temp.getPrev().setNext(temp.getNext());
        }
    }


    public void recorrerHaciaAtras() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getPrev();
        }
        System.out.println();
    }

    public void mostrarLista() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
