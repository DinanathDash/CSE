package Packages.src;
public class Student {
    String name;
    int roll;
    public void input(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}
