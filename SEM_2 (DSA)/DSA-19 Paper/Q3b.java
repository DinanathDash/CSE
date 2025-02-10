import java.util.Scanner;

class Student1 {
    int regdno;
    String name;
    double cgpa;

    Student1(int regdno, String name, double cgpa) {
        this.regdno = regdno;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getRegdno() {
        return regdno;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Q3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter registration number: ");
        int regdno = sc.nextInt();

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        Student1 student = new Student1(regdno, name, cgpa);
        System.out.println(student.getRegdno() + " " + student.getName() + " " + student.getCgpa());
        sc.close();
    }
}
