import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();
        System.out.println("The " + n + "th Fibonacci term is: " + fib(n));
        sc.close();
    }
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}