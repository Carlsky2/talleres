package Clase7;

public class Nodo {
    private String value;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(String value) {
        this.value = value;
        this.izquierdo = null;
        this.derecho = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public void inroden(Nodo nodo){
        if (nodo != null){
            inroden(nodo.izquierdo);
            System.out.print(nodo.value + " ");
            inroden(nodo.derecho);
        }
    }

    public void preorden(Nodo nodo){
        if (nodo != null){
            System.out.print(nodo.value + " ");
            inroden(nodo.izquierdo);
            inroden(nodo.derecho);
        }
    }

    public void postorden(Nodo nodo){
        if (nodo != null){
            inroden(nodo.izquierdo);
            inroden(nodo.derecho);
            System.out.print(nodo.value + " ");
        }
    }


}
