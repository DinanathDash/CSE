import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to reverse: ");
        int n = sc.nextInt();
        System.out.print("The reverse of " + n + " is: ");
        reverse(n);
        sc.close();
    }
    public static void reverse(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        } else {
            System.out.print(n % 10);
            reverse(n / 10);
        }
    }
}
