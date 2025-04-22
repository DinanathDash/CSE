public class Q5 {
    public static int multiply(int x, int y) {
        int result = 0;
        while (y != 0) {
            if ((y & 1) != 0) {
                result = add(result, x);
            }
            x <<= 1;
            y >>= 1;
        }
        return result;
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
        int x = 5;
        int y = 7;
        int result = multiply(x, y);
        System.out.println(x + " * " + y + " = " + result);
    }
}
