import java.util.Scanner;
public class Question_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the electricity unit: ");
		int x=sc.nextInt();
		sc.close();
		if(x<=50) {
			System.out.println("Monthly electricity bill: "+x*3);
		}
		else if(x>50 && x<=200){
			System.out.println("Monthly electricity bill: "+(50*3+(x-50)*4.8));
		}
		else if(x>200 && x<=400){
			System.out.println("Monthly electricity bill: "+(50*3+150*4.8+(x-200)*5.8));
		}
		else if(x>400){
			System.out.println("Monthly electricity bill: "+(50*3+150*4.8+200*5.8+(x-400)*6.2));
		}
	}
}
