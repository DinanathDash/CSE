import java.util.Scanner;
public class Question_6
{
	public static void main(String[] args) 
	{
	    double g=32.174, d, t;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the number of seconds: ");
        t=sc.nextDouble();
        d=(1.0/2)*g*Math.pow(t, 2);
		System.out.println("Distance traveled: "+d);
		sc.close();
	}
}
