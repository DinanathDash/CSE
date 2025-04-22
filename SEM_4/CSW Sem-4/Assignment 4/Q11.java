import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 7, 10, 2, 8, 6, 9};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, 1);
        }

        for (int i = 1; i <= 10; i++) {
            if (!map.containsKey(i)) {
                System.out.println("Smallest missing positive number: " + i);
                break;
            }
        }
    }
}
