import java.util.Scanner;
public class Question_3
{
	public static void main(String[] args) 
	{
		double salary, DA, HRA, gross;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter basic salary: ");
		salary=sc.nextDouble();
		DA=0.4*salary;
		HRA=0.2*salary;
		gross=salary+DA+HRA;
		System.out.println("DA is "+DA);
		System.out.println("HRA is "+HRA);
		System.out.println("Gross Salary is "+gross);
		sc.close();
	}
}
