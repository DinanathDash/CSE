import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();
        sc.close();
        int evenDigitsCount = countEvenDigits(number);
        System.out.println("Number of even digits: " + evenDigitsCount);
    }
    public static int countEvenDigits(int num) {
        int evenDigitsCount = 0;
        num = Math.abs(num);
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenDigitsCount++;
            }
            num /= 10;
        }
        return evenDigitsCount;
    }
}
