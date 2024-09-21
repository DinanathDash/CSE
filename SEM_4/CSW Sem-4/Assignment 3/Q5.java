class Student3 implements Comparable<Student3> {
    String name;
    int rn;
    int totalMark;

    public Student3(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    @Override
    public int compareTo(Student3 other) {
        return Integer.compare(this.rn, other.rn);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rn=" + rn + ", totalMark=" + totalMark + "]";
    }
}

public class Q5 {
    public static void main(String[] args) {
        Student3[] students = {
            new Student3("John", 103, 85),
            new Student3("Alice", 101, 90),
            new Student3("Bob", 102, 80)
        };

        bubbleSort(students);

        System.out.println("Sorted students array:");
        for (Student3 student : students) {
            System.out.println(student);
        }
    }

    public static void bubbleSort(Student3[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Student3 temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
