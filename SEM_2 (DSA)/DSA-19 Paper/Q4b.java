import java.util.Scanner;

public class Q4b {
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int m = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int n = sc.nextInt();

        int result = gcd(m, n);
        System.out.println("The GCD of " + m + " and " + n + " is " + result);
        sc.close();
    }
}
