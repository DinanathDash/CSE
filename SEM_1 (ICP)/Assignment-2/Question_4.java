import java.util.Scanner;
public class Question_4
{
	public static void main(String[] args) 
	{
	    int a, b, c, d, e, x, sum;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter number between 0 and 1000: ");
        a=sc.nextInt();
		b=a%10;
        x=a/10;
        c=x%10;
        x=x/10;
        d=x%10;
        x=x/10;
        e=x%10;
        sum=b+c+d+e;
		System.out.println("The sum of the digits is "+sum);
        sc.close();
	}
}
