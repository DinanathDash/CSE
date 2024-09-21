public class Q16 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            int value = array[10];
            System.out.println("Value at index 10: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
