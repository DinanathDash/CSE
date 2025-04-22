interface DetailInfo {
    void display();
    void count();
}
class Person1 implements DetailInfo {
    static int maxcount;
    String name;
    Person1(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Name: " + name);
    }
    public void count() {
        int count = name.length();
        System.out.println("No. of characters in name: " + count);
        if (count > maxcount) {
            maxcount = count;
        }
    }
}
public class Q8 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("John");
        p1.display();
        p1.count();
        Person1 p2 = new Person1("Jane");
        p2.display();
        p2.count();
        System.out.println("Maximum count: " + Person1.maxcount);
    }
}
