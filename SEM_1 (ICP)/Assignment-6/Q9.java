import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator and denominator of the first fraction: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter the numerator and denominator of the second fraction: ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int lcm = lcm(b, d);
        int e = a * lcm / b;
        int f = c * lcm / d;
        int sum = e + f;
        int gcd = gcd(sum, lcm);
        int numerator = sum / gcd;
        int denominator = lcm / gcd;
        sc.close();
        System.out.println("The sum is: " + numerator + "/" + denominator);
    }
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }
}
