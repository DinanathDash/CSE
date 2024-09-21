import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();
        sc.close();
        int[] digitFrequency = countDigitFrequency(number);
        System.out.println("Digit frequency:");
        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i] > 0) {
                System.out.println("Digit " + i + ": " + digitFrequency[i] + " times");
            }
        }
    }
    public static int[] countDigitFrequency(int num) {
        num = Math.abs(num);
        int[] digitFrequency = new int[10];
        while (num > 0) {
            int digit = num % 10;
            digitFrequency[digit]++;
            num /= 10;
        }
        return digitFrequency;
    }
}
