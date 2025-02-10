import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		sc.close();
		if(a>18) {
			System.out.println("You are eligible to cast your vote");
		}
	}
}
