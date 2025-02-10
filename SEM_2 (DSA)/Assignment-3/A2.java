import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the Array: ");
        int n=sc.nextInt();
        Integer[] array = new Integer[n];
        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        int index = binarySearch(array, target, 0, array.length - 1);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
        sc.close();
    }
    private static int binarySearch(Integer[] array, int target, int i, int j) {
        if (i > j) {
            return -1;
        }
        int mid = (i + j) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearch(array, target, i, mid - 1);
        } else {
            return binarySearch(array, target, mid + 1, j);
        }
    }
}
