import java.util.HashSet;
public class Q4 {
    public static void findMaxMinDifference(int[] array) {
        HashSet<Integer> seenElements = new HashSet<>();
        int maxDifference = Integer.MIN_VALUE;
        int minDifference = Integer.MAX_VALUE;
        for (int element : array) {
            if (seenElements.contains(element)) {
                System.out.println("Duplicate element found: " + element);
            }
            for (int seenElement : seenElements) {
                maxDifference = Math.max(maxDifference, Math.abs(element - seenElement));
                minDifference = Math.min(minDifference, Math.abs(element - seenElement));
            }
            seenElements.add(element);
        }
        System.out.println("Maximum Difference: " + maxDifference); 
        System.out.println("Minimum Difference: " + minDifference);
    }
    public static void main(String[] args) {
        int[] array = {10, 5, 2, 8, 1, 4};
        findMaxMinDifference(array);
    }
}