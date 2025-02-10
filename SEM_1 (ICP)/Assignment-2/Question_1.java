import java.util.Scanner;
public class Question_1
{
	public static void main(String[] args) 
	{
		double Celsius, Fahrenheit;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a degree in Fahrenheit: ");
		Fahrenheit=sc.nextDouble();
		Celsius=(Fahrenheit-32)*5.0/9.0;
		System.out.println(Fahrenheit+" Fahrenheit is "+Celsius+" Celsius");
		sc.close();
	}
}
