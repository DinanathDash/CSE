import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int x=sc.nextInt(),num, sum=0,product=1, rem;
		sc.close();
		num=x;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			sum+=rem;
			product*=rem;
		}
		if(sum==product) {
			System.out.printf("%d is spy number",x);
		}
		else {
			System.out.printf("%d is not a spy number", x);
		}
	}
}
