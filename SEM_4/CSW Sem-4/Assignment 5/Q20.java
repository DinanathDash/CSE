public class Q20 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int startIndex = 0;

        traverseArray(array, startIndex);
        
        startIndex = 10;
        try {
            traverseArray(array, startIndex);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught at index " + startIndex);
        }
    }

    public static void traverseArray(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Reached end of array.");
            return;
        }

        System.out.println("Element at index " + index + ": " + array[index]);

        traverseArray(array, index + 1);
    }
}
