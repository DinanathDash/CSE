import java.util.Scanner;
class Student1 {
    int rollNumber;
    String name, course;
    void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter course: ");
        course = sc.nextLine();
    }
    void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}
class Exam extends Student1 {
    int mark1, mark2, mark3;
    void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter mark 3: ");
        mark3 = sc.nextInt();
    }
    void displayResult() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
    }
}
public class Q9 {
    public static void main(String[] args) {
        Exam[] exams = new Exam[5];
        for (int i = 0; i < exams.length; i++) {
            exams[i] = new Exam();
            System.out.println("Enter details for student " + (i + 1) + ":");
            exams[i].inputStudent();
            exams[i].inputMarks();
            System.out.println();
        }
        for (int i = 0; i < exams.length; i++) {
            System.out.println("Details of student " + (i + 1) + ":");
            exams[i].displayStudent();
            exams[i].displayResult();
            System.out.println();
        }
    }
}
