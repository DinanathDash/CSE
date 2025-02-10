import java.util.Scanner;
public class Q1f {
	public static void main(String[] args) {
		System.out.print("Enter the value x: ");
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		sc.close();
		if(x!=0) {
			double sqroot=squareRootSimple(x);
			System.out.println("Square root: "+sqroot);
		}
		else {
			System.out.println("Error");
		}
	}
	public static double squareRootSimple(double n){
		double modulo=Math.sqrt(n);
		return modulo;
	}
}
