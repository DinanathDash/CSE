import java.util.Scanner;
public class Q4{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        if (m < n && m > 0 && n > 0) {
            for (int i = m; i <= n; i++) {
                long fact = 1;
                for (int j = 1; j <= i; j++)
                    fact *= j;
                System.out.println("Factorial of " + i + " = " + fact);
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}