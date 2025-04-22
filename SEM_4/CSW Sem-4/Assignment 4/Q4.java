import java.util.*;

class Student {
    private String name;
    private int age, mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return name.equals(other.name) && age == other.age && Double.compare(mark, other.mark) == 0;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }
}

public class Q4 {
    public static void main(String[] args) {
        LinkedList<Student> studentsList = new LinkedList<>();

        studentsList.add(new Student("Alice", 20, 85));
        studentsList.add(new Student("Bob", 22, 78));
        studentsList.add(new Student("Charlie", 19, 92));

        System.out.println("List of students:");
        for (Student student : studentsList) {
            System.out.println(student);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student to search: ");
        String searchName = sc.nextLine();
        System.out.print("Enter the age of the student to search: ");
        int searchAge = sc.nextInt();
        System.out.print("Enter the mark of the student to search: ");
        int searchMark = sc.nextInt();
        Student searchStudentObj = new Student(searchName, searchAge, searchMark);

        if (studentsList.contains(searchStudentObj)) {
            System.out.println("Student exists in the list.");
        } else {
            System.out.println("Student does not exist in the list.");
        }

        System.out.print("Enter the name of the student to remove: ");
        String removeName = sc.next();
        System.out.print("Enter the age of the student to remove: ");
        int removeAge = sc.nextInt();
        System.out.print("Enter the mark of the student to remove: ");
        int removeMark = sc.nextInt();
        Student removeStudentObj = new Student(removeName, removeAge, removeMark);
        studentsList.remove(removeStudentObj);

        System.out.println("Number of students in the list: " + studentsList.size());

        Student student1 = new Student("Alice", 20, 85);
        Student student2 = new Student("Alice", 20, 85);
        if (student1.equals(student2)) {
            System.out.println("Student1 and Student2 share the same values.");
        } else {
            System.out.println("Student1 and Student2 do not share the same values.");
        }
        sc.close();
    }
}
