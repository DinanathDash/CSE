public class Q8 {
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int inp1 = 123;
        int inp2 = -245;
        int reversed1 = reverse(inp1);
        int reversed2 = reverse(inp2);
        System.out.println("Reverse of " + inp1 + " is: " + reversed1);
        System.out.println("Reverse of " + inp2 + " is: " + reversed2);
    }
}
