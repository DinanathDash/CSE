public class Q37 {
	public static void main(String[] args) {
		int x = 1, y = 2;
		switch (x) {
			case 1:switch (y) {
				case 2:System.out.println( "Choice is 2");
				break;
				case 3:System.out.println( "Choice is 3");
				break;
			}
			break;
			case 4:System.out.println( "Choice is 4");
			break;
			case 5:System.out.println( "Choice is 5");
			break;
			default:System.out.println( "Choice is other than 1, 2 3, 4, or 5");
			break;
		}
	}
}
