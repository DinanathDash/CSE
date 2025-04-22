import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = sc.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = sc.nextLine();

        String concatenatedStringMethod = firstString.concat(secondString);

        String concatenatedPlusOperator = firstString + secondString;

        System.out.println("Concatenated string using string method: " + concatenatedStringMethod);
        System.out.println("Concatenated string using + operator: " + concatenatedPlusOperator);

        System.out.print("Enter an index number to retrieve character: ");
        int index = sc.nextInt();

        if (index >= 0 && index < concatenatedStringMethod.length()) {
            char characterAtIndex = concatenatedStringMethod.charAt(index);
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } else {
            System.out.println("Invalid index number.");
        }

        sc.close();
    }
}
