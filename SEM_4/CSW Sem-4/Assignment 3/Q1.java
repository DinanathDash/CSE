class Student1 {
    private String name, rollNum;
    private int age;

    public Student1(String name, String rollNum, int age) {
        this.name = name;
        this.rollNum = rollNum;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNumber(String rollNum) {
        this.rollNum = rollNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("John Doe", "12345", 20);
        Student1 student2 = new Student1("Jane Smith", "67890", 22);

        System.out.println("Student 1:" + "\nName: " + student1.getName() + "\nRoll Number: " + student1.getRollNum() + "\nAge: " + student1.getAge());

        System.out.println("\nStudent 2:" + "\nName: " + student2.getName() + "\nRoll Number: " + student2.getRollNum() + "\nAge: " + student2.getAge());
    }
}
