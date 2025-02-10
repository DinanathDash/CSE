import java.util.Scanner;
public class Question_5
{
	public static void main(String[] args) 
	{
	    double r, x, y;
	    System.out.print("Enter the radius of the hemisphere: ");
		Scanner sc = new Scanner(System.in); 
		r=sc.nextDouble();
        x=3.0*Math.PI*Math.pow(r, 2);
        y=(2.0/3.0)*Math.PI*Math.pow(r,3);
		System.out.println("The surface area of the hemisphere is "+x);
		System.out.println("The volume of the hemisphere is "+y);
		sc.close();
	}
}
