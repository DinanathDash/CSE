@FunctionalInterface
interface SquareFunction {
    int calculate(int x);
}

public class Q6 {
    public static SquareFunction getSquareFunction() {
        return (int x) -> x * x;
    }

    public static void main(String[] args) {
        SquareFunction squareFunc = getSquareFunction();

        int number1 = 4;
        int number2 = 7;
        int number3 = 10;

        System.out.println("The square of " + number1 + " is: " + squareFunc.calculate(number1));
        System.out.println("The square of " + number2 + " is: " + squareFunc.calculate(number2));
        System.out.println("The square of " + number3 + " is: " + squareFunc.calculate(number3));
    }
}
