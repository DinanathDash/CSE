@FunctionalInterface
interface Factorial {
    int calculate(int n);
}
public class Q7 {
    public static void main(String[] args) {
        Factorial factorial = createFactorialFunction();

        int number = 5;
        int result = factorial.calculate(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }

    private static Factorial createFactorialFunction() {
        return new Factorial() {
            @Override
            public int calculate(int n) {
                return n <= 1 ? 1 : n * this.calculate(n - 1);
            }
        };
    }
}
