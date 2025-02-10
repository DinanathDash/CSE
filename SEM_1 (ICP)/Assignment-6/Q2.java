import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		System.out.print("Enter the value x: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		if(x!=0) {
			for(int i=1; i<=10; i++) {
				int Pentagonal=getPentagonalNumber(i);
				System.out.print(Pentagonal+" ");
			}
		}
		else {
			System.out.println("Error");
		}
	}
	public static int getPentagonalNumber(int n){
		int y=n*(3*n-1)/2;
		return y;
	}
}
