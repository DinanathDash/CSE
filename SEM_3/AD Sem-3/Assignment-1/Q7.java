import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
        sc.close();
    }
    public static int factorial(int n) { 
		int res = 1, i; 
		for (i = 2; i <= n; i++) 
			res *= i; 
		return res; 
	} 
}