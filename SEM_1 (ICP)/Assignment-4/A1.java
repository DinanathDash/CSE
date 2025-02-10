import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sumOfSquares = 0;
        int squareOfSums = 0;
        sc.close();
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            squareOfSums += i;
        }
        squareOfSums = squareOfSums * squareOfSums;
        int difference = squareOfSums - sumOfSquares;
    
        System.out.println("Difference between the sum of squares of first " + n + " natural numbers and the square of the sum: " + difference);
    }
  }
  