public class Q2 {
    public static int search(int[] arr, int a, int b, int c) {
        if (b < a) {
            return -1;
        }
        if (arr[a] == c) {
            return a;
        }
        if (arr[b] == c) {
            return b;
        }
        return search(arr, a+1, b-1, c);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 3;

        int result = search(arr, 0, arr.length - 1, x);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
