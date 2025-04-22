public class Q15 {
    public static void main(String[] args) {
        String str = "abc";

        try {
            int number = Integer.parseInt(str);
            System.out.println("Parsed integer: " + number);

            try {
                int result = 10 / number;
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block: ArithmeticException occurred - " + e.getMessage());
            }

        } catch (NumberFormatException e) {
            System.out.println("Outer catch block: NumberFormatException occurred - " + e.getMessage());
        }
    }
}
