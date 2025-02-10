import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter person's weight in kg: ");
		double x=sc.nextDouble();
		System.out.print("Enter person's height in meter: ");
		double y=sc.nextDouble();
		double BMI=x/Math.pow(y, 2);
		sc.close();
		if(BMI<18.5) {
			System.out.println("The person is Underweight.");
		}
		else if(BMI>18.5 && BMI<24.9) {
			System.out.println("The person is Normal weight.");
		}
		else if(BMI>25.0 && BMI<29.9) {
			System.out.println("The person is Overweight.");
		}
		else {
			System.out.println("The person is Obese.");
		}
		
	}
}
