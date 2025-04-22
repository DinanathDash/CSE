public class Q1 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 1, 2, 2};
        int count = 0;
        while (arr.length > 1) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[i] -= min;
                }
            }
            count++;
            int[] temp = new int[arr.length];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    temp[j++] = arr[i];
                }
            }
            arr = new int[j];
            for (int i = 0; i < j; i++) {
                arr[i] = temp[i];
            }
        }
        System.out.println(arr[0]);
        System.out.println("The number of times subtraction is done: " + count);
    }
}
