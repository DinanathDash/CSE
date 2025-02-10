import java.util.Scanner;
public class Q1a {
	public static void main(String[] args) {
		System.out.print("Enter the value x and y: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt();
		sc.close();
		int sum=additionSimple(x,y);
		System.out.println("Sum: "+sum);
	}
	public static int additionSimple(int a, int b) {
		int add=a+b;
		return add;
	}
}
