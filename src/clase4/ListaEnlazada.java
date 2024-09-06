package clase4;

public class ListaEnlazada {

    private Nodo cab;

    public void anadirAlinicio(Nodo newbie){
        if(cab == null){
            cab = newbie;
            return;
        }

        newbie.setSgt(cab);
        cab = newbie;

    }

    public void imprimirlista(){
        Nodo buc = cab;
        while(buc != null){
            System.out.println("Valor actual: " + buc.getValor());
            buc = buc.getSgt();
        }
    }

    public void eliminar(double valor){
        Nodo actual = cab;
        if(cab == null){
            return;
        }
        while(actual.getSgt() != null){
            if(actual.getSgt().getValor() == valor){
                actual.setSgt(actual.getSgt().getSgt());
                return;
            }
            actual = actual.getSgt();
        }
    }

    public Nodo buscarNodo(double valor){
        Nodo buc = cab;
        while(buc != null){
            if (buc.getValor() == valor){
                return buc;
            }
            buc = buc.getSgt();
        }
        return null;
    }

    public void insertAnywhere(double valor, int pos){
        Nodo newbie = new Nodo(valor, null);
        if (pos == 0 ) {
            newbie.setSgt(cab);
            cab = newbie;
            return;
        }
        Nodo buc = cab;
        int posact = 0;


        while(buc != null && posact < (pos-1) ){
            buc = buc.getSgt();
            posact ++;
        }

        newbie.setSgt(buc.getSgt());
        buc.setSgt(newbie);

    }
}
