import java.util.Scanner;
public class Question_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=1+(int)(Math.random()*9);
		int x=sc.nextInt();
		System.out.println("Enter the user number:"+x);
		System.out.println("Computer guesses:"+a);
		sc.close();
		if(x==a) {
			System.out.println("You got it right");
		}
		else if(x-a==1||a-x==1){
			System.out.println("You almost got it");
		}
		else {
			System.out.print("You got it wrong");
		}
	}

}
