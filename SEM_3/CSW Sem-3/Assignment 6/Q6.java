import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float as a string: ");
        String inputString = sc.nextLine();
        sc.close();
        try {
            Float floatValue = convertToFloatObject(inputString);
            System.out.println("Original string value: " + inputString);
            System.out.println("Converted Float object: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid float as a string.");
        }
    }
    public static Float convertToFloatObject(String input) {
        return Float.valueOf(input);
    }
}
