import java.util.Scanner;
public class Assignment_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Male = "Male";
		String Female = "Female";
		String Married;
		System.out.print("What is your gender (male or female):");
		String gender = sc.nextLine();
		System.out.print("Firstname:\t");
		String name = sc.nextLine();
		System.out.print("Last Name:\t");
		String lastName = sc.nextLine();
		System.out.print("Age:\t\t");
		int age = sc.nextInt();
		
		if (gender.equalsIgnoreCase(Female) && age >= 20) {
			System.out.print("Are you married, " + name + "? (yes or no)");
			Married = sc.next();
			if (Married.equalsIgnoreCase("yes"))
				System.out.print("Then I shall call you Mrs. " + lastName + ".");
			}else{
				System.out.print("Then I shall call you " + name + " " + lastName + ".");
			
		if (gender.equalsIgnoreCase(Male) && age >= 20) 
			System.out.print("Then I shall call you Mr. " + lastName + ".");
		if (gender.equalsIgnoreCase(Male) && age < 20) 
			System.out.print("Then I shall call you " + name + " " + lastName + ".");
		sc.close();
	    }
	}
}