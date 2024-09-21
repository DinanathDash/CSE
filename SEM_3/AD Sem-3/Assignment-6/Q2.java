import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Q2 {
    public static List<Integer> findDuplicates(List<Integer> list) {
        List<Integer> duplicateElements = new ArrayList<>();
        HashSet<Integer> seenElements = new HashSet<>();
        for (Integer element : list) {
            if (seenElements.contains(element)) {
                duplicateElements.add(element);
            } else {
                seenElements.add(element);
            }
        }
        return duplicateElements;
    }
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(1);
        myList.add(4);
        myList.add(2);
        myList.add(2);
        myList.add(1);
        myList.add(5);
        myList.add(3);
        List<Integer> duplicates = findDuplicates(myList);
        if (!duplicates.isEmpty()) {
            System.out.println("Duplicate elements: " + duplicates);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
