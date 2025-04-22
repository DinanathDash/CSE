import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer as a string: ");
        String intString = sc.nextLine();
        sc.close();
        try {
            int intValue = convertToInt(intString);
            System.out.println("Converted int value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer as a string.");
        }
    }
    public static int convertToInt(String input) {
        return Integer.parseInt(input);
    }
}
