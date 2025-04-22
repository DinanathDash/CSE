import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer as a string: ");
        String inputString = sc.nextLine();
        sc.close();
        try {
            Integer integerValue = convertToIntegerObject(inputString);
            System.out.println("Original string value: " + inputString);
            System.out.println("Converted Integer object: " + integerValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer as a string.");
        }
    }
    public static Integer convertToIntegerObject(String input) {
        return Integer.valueOf(input);
    }
}
