import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an arithmetic expression (e.g., 123+345): ");
        String expression = sc.nextLine();
        sc.close();
        calculateAndDisplayResult(expression);
    }
    public static void calculateAndDisplayResult(String expression) {
        String[] parts = expression.split("[+\\-*/]");
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter a valid arithmetic expression.");
            return;
        }
        double operand1 = Double.parseDouble(parts[0]);
        double operand2 = Double.parseDouble(parts[1]);
        char operator = expression.charAt(parts[0].length());
        double result;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                System.out.println("Sum = " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println("Difference = " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println("Multiplication = " + result);
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                    System.out.println("Division = " + result);
                } else {
                    System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please enter a valid operator (+, -, *, /).");
        }
    }
}
