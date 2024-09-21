import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int thirdNumber = createThirdNumber(num1, num2);
        System.out.println("The third number is: " + thirdNumber);
    }
    public static int createThirdNumber(int num1, int num2) {
        int firstTwoDigits = num1 / 100;
        int lastTwoDigits = num2 % 100;
        return firstTwoDigits * 100 + lastTwoDigits;
    }
}
