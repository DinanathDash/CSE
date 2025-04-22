class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class Q22 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 5);
            System.out.println("Result of division: " + result);
        } catch (CustomCheckedException e) {
            System.out.println("CustomCheckedException caught: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) throws CustomCheckedException {
        if (divisor == 0) {
            throw new CustomCheckedException("Cannot divide by zero!");
        }
        return dividend / divisor;
    }
}
