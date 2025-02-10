import java.util.Scanner;
public class Question_10 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int m = sc.nextInt();	
		sc.close();
		int n = m / 10;		
		switch (n) {
		case 10:
			System.out.println("O");
			break;
		case 9:
			System.out.println("O");
			break;
		case 8:
			System.out.println("A");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		case 5:
			System.out.println("D");
			break;
		case 4:
			System.out.println("E");
			break;
		default:
			System.out.println("F");			
		}
	}
} 
