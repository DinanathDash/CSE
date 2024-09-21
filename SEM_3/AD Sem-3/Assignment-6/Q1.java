import java.util.HashSet;
public class Q1 {
    public static Integer firstRepeat(int[] arr) {
        HashSet<Integer> Elements = new HashSet<>();
        for (int num : arr) {
            if (Elements.contains(num)) {
                return num;
            }
            Elements.add(num);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 1, 5, 3};
        Integer firstRepeat = firstRepeat(arr);
        if (firstRepeat != null) {
            System.out.println("First repeated element: " + firstRepeat);
        } else {
            System.out.println("No repeated elements found.");
        }
    }
}
