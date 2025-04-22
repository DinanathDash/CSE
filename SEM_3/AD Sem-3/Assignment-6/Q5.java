import java.util.HashSet;
import java.util.Set;
public class Q5 {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 2, 2, 1, 5, 3, 2, 2, 5, 5};
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> repeatedElements = new HashSet<>();
        for (int element : array) {
            if (!uniqueElements.add(element)) {
                repeatedElements.add(element);
            }
        }
        int maxCount = 0;
        int maxRepeatedElement = 0;
        for (int repeatedElement : repeatedElements) {
            int count = countOccurrences(array, repeatedElement);
            if (count > maxCount) {
                maxCount = count;
                maxRepeatedElement = repeatedElement;
            }
        }
        System.out.println("Number repeated the maximum times: " + maxRepeatedElement);
        System.out.println("Count of repetition: " + maxCount);
    }
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int element : array) {
            if (element == target) {
                count++;
            }
        }
        return count;
    }
}
