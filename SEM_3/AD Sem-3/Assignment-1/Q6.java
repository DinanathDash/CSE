import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        int inputArray[] = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Rearranged Array: " + Arrays.toString(rearrangeMaxMin(inputArray)));
    }
    public static int[] rearrangeMaxMin(int[] arr) {
        int n = arr.length;
        int result[] = new int[n];
        Arrays.sort(arr);
        int left = 0, right = n - 1,index = 0;
        while (left <= right) {
            if (index % 2 == 0) {
                result[index] = arr[right];
                right--;
            }
            else {
                result[index] = arr[left];
                left++;
            }
            index++;
        }
        return result;
    }
}
