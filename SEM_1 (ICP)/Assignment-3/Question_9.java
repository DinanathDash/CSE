import java.util.Scanner;
public class Question_9 {
    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the a, b, c:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		if (a > b && a > c) {
			System.out.println("Largest number: " + a);
			if (b > c) {
				System.out.println("2nd largest: " + b);
			}
			else {
				System.out.println("2nd largest: " + c);
			}
		}
		if (b > c && b > a) {
			System.out.println("Largest number: " + b);
			if (a > c) {
				System.out.println("2nd largest: " + a);
			}
			else {
				System.out.println("2nd largest: " + c);
			}
		}
		if (c > b && c > a) {
			System.out.println("Largest number: " + c);
			if (b > a) {
				System.out.println("2nd largest: " + b);
			}
			else {
				System.out.println("2nd largest: " + a);
			}
		}
	}
}
