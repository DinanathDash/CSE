import java.util.Scanner;
public class Question_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		System.out.println("Enter the user year:"+x);
		sc.close();
		if(x%400==0 || (x%4==0 && x%100!=0)) {
			System.out.println("It's a leap year");
		}
		
		else {
			System.out.print("It's not a leap year");
		}
	}

}
