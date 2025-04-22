import java.util.Arrays;
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number elements in the Array: ");
        int n=sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int k = 3;
        rearrange(arr, k, 0, arr.length - 1);
        System.out.print("Array elements in ascending order: ");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    public static void rearrange(Integer[] arr, int k, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = arr[start];
        int i = start + 1;
        int j = end;
        while (i <= j) {
            if (arr[i] > pivot && arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] <= pivot) {
                i++;
            }
            if (arr[j] > pivot) {
                j--;
            }
        }
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;
        if (pivot <= k) {
            rearrange(arr, k, j + 1, end);
        } else {
            rearrange(arr, k, start, j - 1);
        }
    }    
}
