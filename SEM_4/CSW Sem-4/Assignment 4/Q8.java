import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        boolean areAnagrams = checkAnagrams(str1, str2);

        if (areAnagrams) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        sc.close();
    }

    public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!charFrequency.containsKey(c)) {
                return false;
            }
            charFrequency.put(c, charFrequency.get(c) - 1);
            if (charFrequency.get(c) == 0) {
                charFrequency.remove(c);
            }
        }

        return charFrequency.isEmpty();
    }
}
