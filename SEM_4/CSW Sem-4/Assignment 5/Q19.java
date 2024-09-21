import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        int target = 8;
        int index = binarySearch(array, target);
        System.out.println("Element " + target + " found at index " + index);

        int indexOutOfRange = 10;
        try {
            int element = array[indexOutOfRange];
            System.out.println("Element at index " + indexOutOfRange + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + indexOutOfRange + " is out of bounds");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int index = Arrays.binarySearch(array, target);
        return index >= 0 ? index : -1;
    }
}
