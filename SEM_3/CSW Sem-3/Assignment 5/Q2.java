import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int parity = calculateParity(number);
        System.out.println("Parity of " + number + " is: " + parity);
        sc.close();
    }
    public static int calculateParity(int number) {
        int countOnes = 0;
        while (number != 0) {
            countOnes += number & 1;
            number = number >>> 1;
        }
        return countOnes % 2 == 1 ? 1 : 0;
    }
}
