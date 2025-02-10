class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    int Eid;
    double salary;
    Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }
    void empDisplay() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Salary: " + salary);
    }
}
public class Q7 {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 30, 12345, 50000.0);
        emp.empDisplay();
    }
}
