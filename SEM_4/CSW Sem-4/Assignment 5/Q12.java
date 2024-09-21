import java.lang.Math;

public class Q12 {
    public static void main(String[] args) {
        double[] xValues = {0.5, 1.0, -0.3, Math.PI/2};

        for (double x : xValues) {
            double result = calculateExpression(x);
            System.out.println("For x = " + x + ", result = " + result);
        }
    }

    public static double calculateExpression(double x) {
        if (Math.abs(Math.tan(x)) < 1e-9) {
            System.out.println("Error: Division by zero for tan(x) + 1.");
            return Double.NaN;
        }

        double sinCosProduct = Math.sin(x) * Math.cos(x);
        if (sinCosProduct < 0) {
            System.out.println("Error: Square root of a negative number.");
            return Double.NaN;
        }

        double result = Math.sqrt(Math.abs(sinCosProduct)) / (Math.tan(x) + 1);
        return result;
    }
}
