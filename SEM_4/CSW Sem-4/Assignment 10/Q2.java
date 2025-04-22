import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        strings.add("elderberry");
        strings.add("fig");
        strings.add("grape");

        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());

        Collections.sort(strings, lengthComparator);

        System.out.println("Strings sorted by length in descending order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
