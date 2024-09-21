public class Q6 {
    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int quotient = 0;
        while (x >= y) {
            x = subtract(x, y);
            quotient = add(quotient, 1);
        }
        return quotient;
    }
    private static int subtract(int a, int b) {
        while (b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }
        return a;
    }
    private static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        int x = 15;
        int y = 3;
        int result = divide(x, y);
        System.out.println(x + " / " + y + " = " + result);
    }
}
