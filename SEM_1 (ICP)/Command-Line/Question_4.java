public class Question_4 
{
	public static void main(String[] args) {
		double t=Double.parseDouble(args[0]);
		System.out.println("Let t be: "+t);
		System.out.println("cos(5t)+sin(7t)= "+(Math.cos(5*t)+Math.sin(7*t)));
	}
}