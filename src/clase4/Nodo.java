package clase4;

public class Nodo {
    private double valor;
    private Nodo sgt;

    public Nodo(double valor, Nodo sgt) {
        this.valor = valor;
        this.sgt = sgt;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Nodo getSgt() {
        return sgt;
    }

    public void setSgt(Nodo sgt) {
        this.sgt = sgt;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                '}';
    }
}
