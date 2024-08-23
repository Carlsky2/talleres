package clase3;

public class Optimizacion {

    public boolean hasDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("El duplicado es:" + arr[i]);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasDuplicate2(int[] arr){
        quickSort(arr, 0, arr.length - 1); //Big O(n log n)
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[i+1]){
                System.out.println("El duplicado es:" + arr[i]);
                return true;
            }
        }

        return false;
    }

    // Método principal para ordenar el arreglo
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Encuentra el índice de partición
            int pi = partition(array, low, high);

            // Ordena las subpartes antes y después de la partición
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Método para encontrar el índice de partición usando el último elemento como pivote
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Pivote
        int i = (low - 1); // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (array[j] <= pivot) {
                i++;
                // Intercambia array[i] con array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Intercambia el pivote con el elemento en array[i + 1]
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
