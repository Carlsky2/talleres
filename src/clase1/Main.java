package clase1;

import clase2.NumeroDeFibonacci;
import clase3.Optimizacion;

import static clase2.NumeroDeFibonacci.measureAverageTime;

public class Main {
    public static void main(String[] args) {

        NumeroDeFibonacci ndeah = new NumeroDeFibonacci();
        Optimizacion wachin = new Optimizacion();

        int[] lista = new int[7];

        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 5;
        lista[3] = 4;
        lista[4] = 9;
        lista[5] = 5;
        lista[6] = 7;

        for (int i : lista) {
            System.out.print(i + " ");
            }
            System.out.println();



        long normalTime = measureAverageTime(() -> wachin.hasDuplicate(lista),1);
        System.out.println(normalTime + "ns");
        long optimalTime = measureAverageTime(() -> wachin.hasDuplicate2(lista),1);
        System.out.println(optimalTime + "ns");


        //System.out.println("Sucession de tales con la forma simple: " + ndeah.forma1(100));
        //long normalTime = measureAverageTime(() -> ndeah.forma1(100),10);
        //System.out.println(normalTime + "ns");
        //System.out.println("Sucession de tales con la forma optimizada: " + ndeah.forma2verdadera(100));
        //long optimalTime = measureAverageTime(() -> ndeah.forma2verdadera(100),10);
        //System.out.println(optimalTime + "ns");

    }
}