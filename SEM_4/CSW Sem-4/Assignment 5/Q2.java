public class Q2 {
    public static void main(String[] args) {
        String input = "abc1de2fg3";
        try {
            displayNumericCharacters(input);
        } catch (NullPointerException e) {
            System.err.println("Error: Input string is null or empty.");
        }
    }

    public static void displayNumericCharacters(String input) {
        if (input == null || input.isEmpty()) {
            throw new NullPointerException("Input string is null or empty.");
        }    

        boolean found = false;
        for (int i = 2; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char prevChar = input.charAt(i - 1);
            char prevPrevChar = input.charAt(i - 2);

            if (Character.isDigit(currentChar) &&
                isVowel(prevChar) &&
                !isVowel(prevPrevChar)) {
                System.out.println("Numeric character " + currentChar + " is preceded by a vowel and consonant.");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No numeric characters found that meet the criteria.");
        }
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
