public class Q14 {
    public static void main(String[] args) {
        double[] xValues = {0.5, 1.0, -0.3, Math.PI/4};
        for (double x : xValues) {
            try {
                double result = calculateExpression(x);
                System.out.println("For x = " + x + ", result = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Arithmetic Exception - " + e.getMessage());
            }
        }
    }

    public static double calculateExpression(double x) throws ArithmeticException {
        double tanResult = Math.tan(x);
        double cotResult = 1 / tanResult;

        if (tanResult - cotResult == 0) {
            throw new ArithmeticException("Division by zero: tan(x) - cot(x) = 0");
        }

        double sinCosSum = Math.sin(x) + Math.cos(x);
        if (sinCosSum <= 0) {
            throw new ArithmeticException("Logarithm of a non-positive number.");
        }

        double result = Math.log(Math.abs(sinCosSum)) / (tanResult - cotResult);
        return result;
    }
}
