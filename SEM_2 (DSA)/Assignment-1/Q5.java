import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x=sc.nextInt(), sod;
		sc.close();
		sod=sum_of_digits(x);
		System.out.format("Sum of digits of %d until the number is a single digit is %d.", x, sod);
	}
	public static int sum_of_digits(int x) {
		int rem, sum=0, rem1, sum1=0;
		while(x!=0) {
			rem=x%10;
			x=x/10;
			sum+=rem;
		}
		while(sum!=0) {
			rem1=sum%10;
			sum=sum/10;
			sum1+=rem1;
		}
		return sum1;
	}
}
