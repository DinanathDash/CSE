import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Determine the factorial of a number");
            System.out.println("2. Determine X^N for two numbers X, N");
            System.out.println("3. Determine GCD of two numbers");
            System.out.println("4. Binary equivalent of a decimal number");
            System.out.println("5. Product of two numbers");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    System.out.println("Factorial of " + n + " is " + factorial(n));
                    break;
                case 2:
                    System.out.print("Enter base (X): ");
                    int x = sc.nextInt();
                    System.out.print("Enter exponent (N): ");
                    int N = sc.nextInt();
                    System.out.println(x + "^" + N + " is " + power(x, N));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
                    break;
                case 4:
                    System.out.print("Enter a decimal number: ");
                    int dec = sc.nextInt();
                    System.out.println("Binary equivalent of " + dec + " is " + decimalToBinary(dec));
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Product of " + num1 + " and " + num2 + " is " + product(num1, num2));
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        sc.close();
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public static String decimalToBinary(int dec) {
        if (dec == 0) {
            return "";
        } else {
            return decimalToBinary(dec / 2) + dec % 2;
        }
    }
    public static int product(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else if (num2 > 0) {
            return num1 + product(num1, num2 - 1);
        } else {
            return -product(num1, -num2);
        }
    }
}
