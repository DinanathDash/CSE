public class Q58 {
	public static void main(String[] args) {
		int N = 3;
		switch(N){
			case 1:System.out.println("The number is 1.");
			break;
			case 2:
			case 4:
			case 8:System.out.println("The number is 2, 4, or 8.");
				System.out.println("(That's a power of 2!)");
			break;
			case 3:
			case 6:
			case 9:System.out.println("The number is 3, 6, or 9.");
				System.out.println("(That's a multiple of 3!)");
			break;
			case 5:System.out.println("The number is 5.");
			break;
			default:System.out.println("The number is 7 or is outside the range1 to 9.");
		}
	}
}
