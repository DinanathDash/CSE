public class Q54 {
	public static final int x=4;
	public static void main(String[] args) {
		int a=10,b=5;
		switch(a<b?a:b-1){
			case 5:System.out.println("Wow");
			break;
			case 3:System.out.println("Its working");
			break;
			case x:System.out.println("Ooh...");
			break;
			default:System.out.println("Fine...");
		}
	}
}
