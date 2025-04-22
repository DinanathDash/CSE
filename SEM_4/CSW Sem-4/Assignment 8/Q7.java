import java.util.*;

public class Q7 {
    
    public static ArrayList<Integer> findOccurrences(char[] charArray, char searchChar) {
        ArrayList<Integer> positions = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                positions.add(i);
            }
        }
        return positions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userString = sc.nextLine();
        
        System.out.print("Enter a character to search: ");
        char charToSearch = sc.next().charAt(0);

        char[] charArray = userString.toCharArray();

        ArrayList<Integer> occurrences = findOccurrences(charArray, charToSearch);

        if (!occurrences.isEmpty()) {
            System.out.println("The character '" + charToSearch + "' was found at positions: " + occurrences.get(0) + " (first) and " + occurrences.get(occurrences.size() - 1) + " (last)");
        } else {
            System.out.println("The character '" + charToSearch + "' was not found in the string.");
        }

        System.out.println("Character array: " + new String(charArray));
        sc.close();
    }
}
