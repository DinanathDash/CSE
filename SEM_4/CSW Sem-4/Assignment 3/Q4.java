class Student2 implements Comparable<Student2> {
    String name;
    int rn, totalMark;

    public Student2(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    @Override
    public int compareTo(Student2 other) {
        return Integer.compare(this.rn, other.rn);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rn=" + rn + ", totalMark=" + totalMark + "]";
    }
}

public class Q4 {
    public static void main(String[] args) {
        Student2[] students = {
            new Student2("John", 101, 85),
            new Student2("Alice", 102, 90),
            new Student2("Bob", 103, 80)
        };

        int searchRollNum = 102;
        boolean found = false;
        for (Student2 student : students) {
            if (student.rn == searchRollNum) {
                System.out.println("Student found:\n" + student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + searchRollNum + " not found.");
        }
    }
}
