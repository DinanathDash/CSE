public class Q48 {
	public static void main(String[] args) {
		switch(*(3 + "I LOVE" + "ABCD" + 3)){
			case 'A':System.out.println("Apple Mac");
			break;
			case 'B':System.out.println("Windows");
			break;
			case 'C':System.out.println("Great Linux");
			break;
			default:System.out.println("All the above");
		}
	}
}
//Syntax error on token "*", delete this token
//Type mismatch: cannot convert from char to String