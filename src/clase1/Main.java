package clase1;

import clase2.NumeroDeFibonacci;

import static clase2.NumeroDeFibonacci.measureAverageTime;

public class Main {
    public static void main(String[] args) {

        NumeroDeFibonacci ndeah = new NumeroDeFibonacci();

        System.out.println("Sucession de tales con la forma simple: " + ndeah.forma1(100));
        long normalTime = measureAverageTime(() -> ndeah.forma1(100),10);
        System.out.println(normalTime + "ns");
        System.out.println("Sucession de tales con la forma optimizada: " + ndeah.forma2verdadera(100));
        long optimalTime = measureAverageTime(() -> ndeah.forma2verdadera(100),10);
        System.out.println(optimalTime + "ns");

    }
}