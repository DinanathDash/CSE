import java.util.Scanner;
public class Question_2
{
	public static void main(String[] args) 
	{
		double km, meters, inches, feet, centimeter;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a distance in km: ");
		km=sc.nextDouble();
		meters=km*1000;
		feet=3280.8399*km;
		inches=39370.0787*km;
		centimeter=100000*km;
		System.out.println(km+" kilometers is "+meters+" meters");
		System.out.println(km+" kilometers is "+feet+" feet");
		System.out.println(km+" kilometers is "+inches+" inches");
		System.out.println(km+" kilometers is "+centimeter+" centimeter");
		sc.close();
	}

}
