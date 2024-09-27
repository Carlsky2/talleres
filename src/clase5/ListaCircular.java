package clase5;

public class ListaCircular {
    private Node head;

    public ListaCircular() {
        this.head = null;
    }

    public void insetarPos(int data, int position) {
        Node newNode = new Node(data);


        if (head == null) {
            newNode.setNext(newNode);
            newNode.setPrev(newNode);
            head = newNode;
            return;
        }

        Node current = head;
        int count = 1;


        while (count < position && current.getNext() != head) {
            current = current.getNext();
            count++;
        }


        Node nextNode = current.getNext();
        newNode.setNext(nextNode);
        newNode.setPrev(current);
        current.setNext(newNode);
        nextNode.setPrev(newNode);

        if (position == 1) {
            head = newNode;
        }
    }


    public void eliminarNodoPos(int position) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node current = head;
        int count = 1;


        if (head.getNext() == head) {
            head = null;
            return;
        }


        while (count < position && current.getNext() != head) {
            current = current.getNext();
            count++;
        }

        Node prevNode = current.getPrev();
        Node nextNode = current.getNext();

        prevNode.setNext(nextNode);
        nextNode.setPrev(prevNode);

        if (position == 1) {
            head = nextNode;
        }
    }

    public void imprimirCircular() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        } while (current != head);
        System.out.println();
    }

    public void darvueltas(int vueltas) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node current = head;
        int count = 0;
        int nodes = 0;

        do {
            nodes++;
            current = current.getNext();
        } while (current != head);

        current = head;

        while (count < vueltas * nodes) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
            count++;
        }
        System.out.println();
    }
}

