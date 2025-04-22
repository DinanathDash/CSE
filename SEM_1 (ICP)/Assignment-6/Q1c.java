import java.util.Scanner;
public class Q1c {
	public static void main(String[] args) {
		System.out.print("Enter the value x and y: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt();
		sc.close();
		int multiplication=multiplicationSimple(x,y);
		System.out.println(multiplication);
	}
	public static int multiplicationSimple(int a, int b) {
		int multiply=a*b;
		return multiply;
	}
}
