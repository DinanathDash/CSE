import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter a word to search for: ");
        String searchWord = sc.next();

        System.out.print("Enter a word to replace it with: ");
        String replaceWord = sc.next();

        int startIndex = sentence.indexOf(searchWord);

        if (startIndex != -1) {
            String modifiedSentence = sentence.substring(0, startIndex) + replaceWord + sentence.substring(startIndex + searchWord.length());

            System.out.println("Original sentence: " + sentence);
            System.out.println("Modified sentence: " + modifiedSentence);
        } else {
            System.out.println("The word \"" + searchWord + "\" was not found in the sentence.");
        }

        sc.close();
    }
}
