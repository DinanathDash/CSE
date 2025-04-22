import java.util.Scanner;
public class Question_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println("Enter the first number:"+x);
		System.out.println("Enter the second number:"+y);
		System.out.println("Enter the third number:"+z);
		sc.close();
		if(x<y && y<z){
			System.out.println("Increasing");
		}
		else if(x>y && y>z){
			System.out.println("Decreasing");
		}
		else{
			System.out.print("Neither increasing nor decreasing");
		}
	}

}
