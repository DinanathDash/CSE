import java.util.Scanner;
public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to generate: ");
        int n = sc.nextInt();
        sc.close();
        if (n < 1) {
            System.out.println("Invalid input!");
            return;
        }
        System.out.print("Fibonacci Series is: ");
        int a = 0, b = 1;
        System.out.print(a + ", " + b);
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
