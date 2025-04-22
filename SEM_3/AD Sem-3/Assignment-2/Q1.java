import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("The sum of the first " + n + " numbers is: " + sum(n));
        }
        sc.close();
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
}
