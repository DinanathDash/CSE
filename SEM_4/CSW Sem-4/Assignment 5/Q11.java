import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        try {
            double result = calculateFunctionValue(x);
            System.out.println("Result of the function: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Mathematical error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double calculateFunctionValue(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        double tanX = Math.tan(x);
        double cotX = 1.0 / tanX;

        if (tanX - cotX == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        if (sinX + cosX <= 0) {
            throw new IllegalArgumentException("Logarithm of non-positive number.");
        }

        return Math.log(sinX + cosX) / (tanX - cotX);
    }
}
