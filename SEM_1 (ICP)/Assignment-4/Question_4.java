import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        int gcd = euclidAlgorithm(x, y);
        sc.close();
        System.out.println("The GCD of " + x + " and " + y + " is " + gcd);
    }
    public static int euclidAlgorithm(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        
        return x;
    }
}

