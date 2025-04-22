public class Q47 {
	public static void main(String[] args) {
		double x = 6.2;
		if(x-- >= 6.0)
			System.out.print("first ");
		if(--x >= 5.0)
			System.out.print("second ");
		if(x-- >= 4.0)
			System.out.print("third ");
		else
			System.out.print("fourth ");
	}
}
