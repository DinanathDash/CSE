public class Q5 {
    public static void main(String[] args) {
        try {
            double result = computeComplexMath(10);
            System.out.println("Result: " + result);
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException occurred. Make sure all variables are initialized.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static double computeComplexMath(double x) {
        double result = 0;

        try {
            result = Math.log(x) + Math.sin(x) * Math.cos(x) + Math.sqrt(x);
        } catch (NullPointerException e) {
            throw new NullPointerException("Error: NullPointerException occurred during computation.");
        }

        return result;
    }
}
