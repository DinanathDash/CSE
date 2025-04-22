import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        int userInput = readIntegerFromUser();
        System.out.println("You entered: " + userInput);
    }

    public static int readIntegerFromUser() {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;

        try {
            System.out.print("Enter an integer: ");
            userInput = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
            sc.next();
            userInput = readIntegerFromUser();
        } finally {
            sc.close();
        }

        return userInput;
    }
}
