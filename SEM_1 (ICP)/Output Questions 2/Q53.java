public class Q53 {
	public static void main(String[] args) {
		int a=10,b=5;
		switch(a<b){
			case true: System.out.println("Wow");
			break;
			case false: System.out.println("Its working");
			break;
		}
	}
}
//Cannot switch on a value of type boolean. Only convertible int values, strings or enum variables are permitted