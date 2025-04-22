import java.util.Scanner;
public class Question_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double x=sc.nextDouble();
        double y=sc.nextDouble();
        sc.close();
		if (x > 0 && y > 0){
            System.out.println(x+","+y+" lies in First quadrant");
        }
        else if (x < 0 && y > 0){
            System.out.println(x+","+y+" lies in Second quadrant");
        }
        else if (x < 0 && y < 0){
            System.out.println(x+","+y+" lies in Third quadrant");
        }
        else if (x > 0 && y < 0){
            System.out.println(x+","+y+" lies in Fourth quadrant");
        }
        else if (x == 0 && y > 0){
            System.out.println(x+","+y+" lies at positive y axis");
        }
        else if (x == 0 && y < 0){
            System.out.println(x+","+y+" lies at negative y axis");
        }
        else if (y == 0 && x < 0){
            System.out.println(x+","+y+" lies at negative x axis");
        }
        else if (y == 0 && x > 0){
            System.out.println(x+","+y+" lies at positive x axis");
        }
        else{
            System.out.println(x+","+y+" lies at origin");
        }   
	}
}
