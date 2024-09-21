import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double as a string: ");
        String inputString = sc.nextLine();
        sc.close();
        try {
            Double doubleValue = convertToDoubleObject(inputString);
            System.out.println("Original string value: " + inputString);
            System.out.println("Converted Double object: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double as a string.");
        }
    }
    public static Double convertToDoubleObject(String input) {
        return Double.valueOf(input);
    }
}
