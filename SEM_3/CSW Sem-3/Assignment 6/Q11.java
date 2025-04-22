import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double as a string: ");
        String doubleString = sc.nextLine();
        sc.close();
        try {
            double doubleValue = convertToDouble(doubleString);
            System.out.println("Converted double value: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double as a string.");
        }
    }
    public static double convertToDouble(String input) {
        return Double.parseDouble(input);
    }
}
