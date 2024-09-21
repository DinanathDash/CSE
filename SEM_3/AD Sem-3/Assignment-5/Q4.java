public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int key = 5;
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + index + ".");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        return binarySearchHelper(arr, key, 0, arr.length - 1);
    }

    public static int binarySearchHelper(int[] arr, int key, int a, int b) {
        if (a > b) {
            return -1;
        }
        int mid = (a + b) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return binarySearchHelper(arr, key, mid + 1, b);
        } else {
            return binarySearchHelper(arr, key, a, mid - 1);
        }
    }
}