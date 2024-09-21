import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first float number: ");
        double num1 = sc.nextFloat();
        System.out.print("Enter the second float number: ");
        double num2 = sc.nextFloat();
        sc.close();
        double epsilon = 1e-6;
        if (Math.abs(num1 - num2) < epsilon) {
            System.out.println("The difference is less than epsilon.");
        } else {
            System.out.println("The difference is greater than or equal to epsilon.");
        }
    }
}
