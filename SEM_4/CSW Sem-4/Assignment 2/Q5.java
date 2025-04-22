class College {
    private String clgName, clgLoc;
    
    public College(String clgName, String clgLoc) {
        this.clgName = clgName;
        this.clgLoc = clgLoc;
    }
    
    public String getClgName() {
        return clgName;
    }
    
    public String getClgLoc() {
        return clgLoc;
    }
}
  
class Student {
    private int studentId;
    private String studentName;
    private College college;
    
    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }
    
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.getClgName());
        System.out.println("College Location: " + college.getClgLoc());
    }
}

public class Q5 {
    public static void main(String[] args) {
        College college1 = new College("ABC College", "City1");
        College college2 = new College("XYZ College", "City2");
        
        Student student1 = new Student(101, "John", college1);
        Student student2 = new Student(102, "Alice", college2);
        
        System.out.println("College 1:");
        System.out.println("Name: " + college1.getClgName());
        System.out.println("Location: " + college1.getClgLoc());
        
        System.out.println("\nCollege 2:");
        System.out.println("Name: " + college2.getClgName());
        System.out.println("Location: " + college2.getClgLoc());
        
        System.out.println("\nStudent 1:");
        student1.displayStudentInfo();
        
        System.out.println("\nStudent 2:");
        student2.displayStudentInfo();
    }
}
