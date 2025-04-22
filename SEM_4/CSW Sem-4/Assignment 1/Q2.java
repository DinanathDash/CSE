import java.util.*;

class Employee {
    private String name;
    private int age, sal;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void displayDetails() {
        System.out.println("\nEmployee Details:" + "\nName: " + name + "\nAge: " + age + "\nSalary: " + sal);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        emp.setName(name);

        System.out.print("Enter employee age: ");
        int age = sc.nextInt();
        emp.setAge(age);

        System.out.print("Enter employee salary: ");
        int sal = sc.nextInt();
        emp.setSal(sal);

        System.out.println("Employee details set successfully.");

        emp.displayDetails();
    }
}
