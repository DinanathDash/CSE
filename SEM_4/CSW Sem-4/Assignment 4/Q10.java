import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a large string: ");
        String inputString = sc.nextLine();

        Map<String, Integer> wordFrequency = new HashMap<>();

        String[] words = inputString.split("\\s+");

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        int maxFrequency = 0;
        String mostOccurringWord = "";
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostOccurringWord = entry.getKey();
            }
        }

        System.out.println("Most occurring word: " + mostOccurringWord);
        System.out.println("Frequency: " + maxFrequency);
        sc.close();
    }
}
