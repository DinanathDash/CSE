public class Q34 {
	public static void main(String[] args) {
		int x=15;
		int y=10;
		int z=5;
		if(x>y & y>z)
			if (x>z | y>x)
				if(x>y ^ z<y)
					System.out.println("Apple");
				else
					System.out.println("Orange");
			else
				System.out.println("Banana");
		else
			System.out.println("Grapes");
	}
}
