import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		sc.close();
		if(x>=5000) {
			System.out.println("Yes, Alice is following doctor's advice");
		}
		else {
			System.out.print("No, Alice is not following doctor's advice");
		}
	}

}
