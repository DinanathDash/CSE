import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        int number = convertStringToInteger(input);
        System.out.println("Converted number: " + number);
        sc.close();
    }

    public static int convertStringToInteger(String input) {
        int number = 0;
        boolean validInput = false;
        Scanner sc = new Scanner(System.in);
        while (!validInput) {
            try {
                number = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Please enter a valid integer: ");
                input = sc.nextLine();
            }
        }
        sc.close();
        return number;
    }
}
