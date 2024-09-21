public class Q2 {
    public static void main(String[] args) {
        int[] array = {8, 3, 1, 5, 9, 4, 7, 2, 10, 6};
        System.out.println("Array before sorting:");
        printArray(array);
        
        quickSortFirst(array, 0, array.length - 1);
        System.out.println("\nArray after sorting with pivot as the first element:");
        printArray(array);
        
        array = new int[]{8, 3, 1, 5, 9, 4, 7, 2, 10, 6};
        
        quickSortLast(array, 0, array.length - 1);
        System.out.println("\nArray after sorting with pivot as the last element:");
        printArray(array);
    }

    public static void quickSortFirst(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partitionFirst(array, low, high);
            quickSortFirst(array, low, pivot - 1);
            quickSortFirst(array, pivot + 1, high);
        }
    }

    public static void quickSortLast(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partitionLast(array, low, high);
            quickSortLast(array, low, pivot - 1);
            quickSortLast(array, pivot + 1, high);
        }
    }

    private static int partitionFirst(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;
        
        while (true) {
            while (i <= j && array[i] <= pivot)
                i++;
            while (i <= j && array[j] > pivot)
                j--;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } else {
                break;
            }
        }
        array[low] = array[j];
        array[j] = pivot;
        return j;
    }

    private static int partitionLast(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
