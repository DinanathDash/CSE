import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input =sc.nextLine();
        sc.close();
        int vowelCount = count(input);
        System.out.println("The number of vowels in the input is: " + vowelCount);
    }
    public static int count(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
