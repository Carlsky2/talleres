package clase2;

public class NumeroDeFibonacci {


    public int forma1(int repeticiones){
        int num1 = 0;
        int num2 = 1;
        int suma = 0;

        for (int i = 0; i < repeticiones; i++) {
            suma = num1 + num2;
            num2 = num1;
            num1 = suma;
        }
        return suma;
    }

    public int forma2verdadera(int repeticiones){
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < repeticiones; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
        }
        return num1;
    }

    public static long measureAverageTime(Runnable algorithm, int repetitions){
        long totalTime = 0;
        for (int i = 0; i < repetitions; i++) {
            long startTime = System.nanoTime();
            algorithm.run();
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }
        return totalTime / repetitions;
    }


}
