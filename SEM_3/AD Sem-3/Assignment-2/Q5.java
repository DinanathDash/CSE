import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two postive integers : ");
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println("GCD of " + x + " and " + y + " is: " + gcd(x, y));
        sc.close();
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}