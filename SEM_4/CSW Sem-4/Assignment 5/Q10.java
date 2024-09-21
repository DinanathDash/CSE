import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x in radians: ");
        double x = sc.nextDouble();

        double result = calculateExpressionValue(x);
        System.out.println("Result of the expression: " + result);

        sc.close();
    }

    public static double calculateExpressionValue(double x) {
        double tolerance = 1e-6;

        if (Math.abs(x % (Math.PI / 2)) < tolerance || Math.abs(x % (Math.PI / 2) - Math.PI / 2) < tolerance) {
            return Double.NaN;
        }

        double sinValue = Math.sin(x);
        double cosValue = Math.cos(x);
        double tanValue = Math.tan(x);

        return (sinValue + cosValue) / tanValue;
    }
}
