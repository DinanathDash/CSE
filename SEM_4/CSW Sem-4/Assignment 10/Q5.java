import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        List<String> filteredStrings = strings.stream()
            .map(String::toUpperCase)
            .filter(str -> !startsWithVowel(str))
            .collect(Collectors.toList());

        System.out.println("Filtered strings:");
        filteredStrings.forEach(System.out::println);
    }

    private static boolean startsWithVowel(String str) {
        return str.startsWith("A") || str.startsWith("E") || str.startsWith("I") || str.startsWith("O") || str.startsWith("U");
    }
}
