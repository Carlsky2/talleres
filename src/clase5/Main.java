package clase5;

import clase4.ListaEnlazada;

public class Main {
    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();
        ListaCircular moski = new ListaCircular();


        lista.agregarAlFinal(1321);
        lista.agregarAlFinal(24120);
        lista.agregarAlFinal(305);
        lista.agregarAlFinal(40);

        System.out.print("Lista hacia adelante: ");
        lista.mostrarLista();
        System.out.print("Lista hacia atras: ");
        lista.recorrerHaciaAtras();
        lista.eliminarNodo(3);
        System.out.print("Lista despues de eliminar el nodo en la posicion 3: ");
        lista.mostrarLista();

        moski.insetarPos(10, 1); // Insertar 10 en la posición 1
        moski.insetarPos(20, 2); // Insertar 20 en la posición 2
        moski.insetarPos(30, 3); // Insertar 30 en la posición 3
        moski.insetarPos(40, 4); // Insertar 40 en la posición 4

        System.out.println("Lista después de insertar 4 nodos:");
        moski.imprimirCircular();
        System.out.println("Recorriendo la lista 3 veces:");
        moski.darvueltas(3);
        moski.eliminarNodoPos(2);
        System.out.println("Lista después de eliminar el nodo en la posición 2:");
        moski.imprimirCircular();
        System.out.println("Recorriendo la lista nuevamente 3 veces:");
        moski.darvueltas(3);
    }
}
