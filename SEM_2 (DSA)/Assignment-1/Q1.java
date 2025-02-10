import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any number greater than 2: ");
		int x=sc.nextInt(), div, count=1;
		div=x;
		sc.close();
		while(div>2) {
			div=div/2;
			count++;
		}
		System.out.printf("The number %d divides %d times by 2 before getting a value less than 2", x, count);
	}
}
