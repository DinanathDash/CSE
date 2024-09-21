import java.util.Arrays;
public class Q2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergedArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length + i] = arr2[i];
        }
        System.out.println("Merged array: " + Arrays.toString(mergedArr));
    }
}
