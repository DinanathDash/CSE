import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factorial of " + n + " is: " + fact(n));
        }
        sc.close();
    }
    public static long fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}