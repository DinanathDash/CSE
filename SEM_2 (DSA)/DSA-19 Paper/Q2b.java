import java.util.Scanner;
class Student{
	String name;
	int mark;
	public Student(String name, int mark){
		this.name=name;
		this.mark=mark;
	}
}
class MarksOutOfBoundException extends Exception{
	public MarksOutOfBoundException(String message) {
		super(message);
	}
}
public class Q2b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of the Student: ");
		String name=sc.next();
		System.out.print("Enter mark: ");
		int mark=sc.nextInt();
		try {
			if(mark>100) {
				throw new MarksOutOfBoundException("Marks can't be greater than 100 ");
			}
			Student student=new Student(name, mark);
			System.out.print(student.name+" has got "+ student.mark);
		}
		catch(MarksOutOfBoundException e) {
			System.out.print(e);
		}
		finally {
			sc.close();
		}
	}
}
