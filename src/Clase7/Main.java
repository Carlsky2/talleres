package Clase7;

public class Main {
    public static void main(String[] args){
        Nodo raiz = new Nodo("A");
        raiz.setIzquierdo(new Nodo("B"));
        raiz.setDerecho(new Nodo("C"));
        raiz.getIzquierdo().setIzquierdo(new Nodo("D"));
        raiz.getIzquierdo().setDerecho(new Nodo("E"));
        raiz.getDerecho().setDerecho(new Nodo("F"));

        raiz.inroden(raiz);
        System.out.println(" ");
        raiz.preorden(raiz);
        System.out.println(" ");
        raiz.postorden(raiz);
        System.out.println(" ");

    }
}
