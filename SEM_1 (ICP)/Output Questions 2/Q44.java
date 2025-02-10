public class Q44 {
	public static void main(String[] args) {
		int x='a';
		switch(x){
			case 5:x+= 5;
			case 97:x+=10;
			case 98:x+=15;
			break;
			case 99:x+=20;
		}
		System.out.println(x);
	}
}
