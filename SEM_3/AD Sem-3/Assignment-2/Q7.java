import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base and exponent respectively: ");
        int base = sc.nextInt(), exponent = sc.nextInt();
        System.out.println(base + " to the power of " + exponent + " is: " + power(base, exponent));
        sc.close();
    }
    public static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
