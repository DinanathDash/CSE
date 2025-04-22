@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}
public class Q1 {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        
        Calculator subtraction = (a, b) -> a - b;
        
        Calculator multiplication = (a, b) -> a * b;
        
        Calculator division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        };

        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + addition.operate(num1, num2));
        System.out.println("Subtraction: " + subtraction.operate(num1, num2));
        System.out.println("Multiplication: " + multiplication.operate(num1, num2));
        System.out.println("Division: " + division.operate(num1, num2));
    }
}
