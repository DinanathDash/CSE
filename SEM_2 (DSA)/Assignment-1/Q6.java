import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x=sc.nextInt();
		sc.close();
		System.out.printf("%d is odd: "+isOdd(x),x);
	}
	public static boolean isOdd(int x) {
		int y=Math.floorMod(x, 2);
		if(y==0)
			return false;
		else
			return true;
	}
}
