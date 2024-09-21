import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6, 7, 7};

        HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> repeatingSet = new HashSet<>();

        for (int num : arr) {
            if (uniqueSet.contains(num)) {
                repeatingSet.add(num);
            } else {
                uniqueSet.add(num);
            }
        }

        System.out.println("Repeating integers in the array: " + repeatingSet);
    }
}
