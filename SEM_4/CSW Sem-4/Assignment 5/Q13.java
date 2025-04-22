public class Q13 {
    public static void main(String[] args) {
        double[] xValues = {0.5, 1.0, -0.3, Math.PI/2};

        for (double x : xValues) {
            try {
                double result = evaluateFunction(x);
                System.out.println("For x = " + x + ", result = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Arithmetic Exception - " + e.getMessage());
            }
        }
    }

    public static double evaluateFunction(double x) throws ArithmeticException {
        if (Math.sin(x) + Math.cos(x) == 0) {
            throw new ArithmeticException("Division by zero: sin(x) + cos(x) = 0");
        }

        double result = (Math.sin(x) * Math.cos(x)) / (Math.sin(x) + Math.cos(x));
        return result;
    }
}
