import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 2, 5, 7, 8, 2, 3, 9, 5));
        System.out.println("List before removing duplicates: " + list);

        List<Integer> result = removeDuplicates(list);

        System.out.println("List after removing duplicates: " + result);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Integer> left = removeDuplicates(new ArrayList<>(list.subList(0, mid)));
        List<Integer> right = removeDuplicates(new ArrayList<>(list.subList(mid, list.size())));

        return merge(left, right);
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) < 0) {
                if (!result.contains(left.get(i))) {
                    result.add(left.get(i));
                }
                i++;
            } else {
                if (!result.contains(right.get(j))) {
                    result.add(right.get(j));
                }
                j++;
            }
        }

        while (i < left.size()) {
            if (!result.contains(left.get(i))) {
                result.add(left.get(i));
            }
            i++;
        }

        while (j < right.size()) {
            if (!result.contains(right.get(j))) {
                result.add(right.get(j));
            }
            j++;
        }

        return result;
    }
}
