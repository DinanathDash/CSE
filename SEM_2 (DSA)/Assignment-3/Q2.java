import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String colour[]=new String[4];
		System.out.println("Enter four colours: ");
		for(int i=0; i<colour.length; i++) {
			colour[i]=sc.nextLine();
		}	
		try {
			for(int i=0; i<colour.length; i++) {
				Integer.parseInt(colour[i]);
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Convert string to int: ");
			System.out.println(e);
		}
		System.out.print("Enter one more colour: ");
		try {
			colour[5]=sc.nextLine();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("The colours entered are: ");
		for(String colours:colour) {
			System.out.println(colours);
		}
		sc.close();
	}
}
