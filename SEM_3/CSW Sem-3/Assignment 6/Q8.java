import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a boolean as a string (true/false): ");
        String inputString = sc.nextLine();
        sc.close();
        Boolean booleanValue = convertToBooleanObject(inputString);
        if (booleanValue != null) {
            System.out.println("Original string value: " + inputString);
            System.out.println("Converted Boolean object: " + booleanValue);
        } else {
            System.out.println("Invalid input. Please enter 'true' or 'false'.");
        }
    }
    public static Boolean convertToBooleanObject(String input) {
        return Boolean.valueOf(input);
    }
}
