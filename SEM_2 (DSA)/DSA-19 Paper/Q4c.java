import java.util.Scanner;

public class Q4c {
    public static void reverse(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            reverse(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.print("The integer with its digits reversed is: ");
        reverse(n);
        sc.close();
    }
}
