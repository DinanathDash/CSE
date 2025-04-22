import java.util.HashSet;
public class Q3 {
    public static int findMissingNumber(int[] array, int n) {
        HashSet<Integer> numbersSet = new HashSet<>();
        for (int num : array) {
            numbersSet.add(num);
        }
        for (int i = 1; i <= n; i++) {
            if (!numbersSet.contains(i)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = arr.length;
        int missingNumber = findMissingNumber(arr, n);
        if (missingNumber != -1) {
            System.out.println("Missing number: " + missingNumber);
        } else {
            System.out.println("No missing number found.");
        }
    }
}
