import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci series upto " + n + "th position are: ");
        fibonacci(n);
        sc.close();
    }
    public static void fibonacci(int n){
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
