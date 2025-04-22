import java.util.Scanner;
public class Q1d {
	public static void main(String[] args) {
		System.out.print("Enter the value x and y: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt();
		sc.close();
		if(x!=0 && y!=0) {
			int division=divisionSimple(x,y);
			System.out.println(division);
		}
		else {
			System.out.println("Error");
		}
	}
	public static int divisionSimple(int a, int b) {
		int div=a/b;
		return div;
	}
}
