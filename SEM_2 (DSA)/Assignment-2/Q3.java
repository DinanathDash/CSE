import java.util.Scanner;
class Student {
    int Roll, DSA_Mark;
    String Name;
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        Roll = sc.nextInt();
        System.out.print("Enter Roll No: ");
        System.out.print("Enter Name: ");
        Name = sc.next();
        System.out.print("Enter DSA Mark: ");
        DSA_Mark = sc.nextInt();
    }
    public void showdata() {
        System.out.println("Roll No: " + Roll);
        System.out.println("Name: " + Name);
        System.out.println("DSA Mark: " + DSA_Mark);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        int maxDSA = -1, maxIndex = -1;
        for (int i = 0; i < 5; i++) {
            s[i] = new Student();
            s[i].getdata();
            if (s[i].DSA_Mark > maxDSA) { 
                maxDSA = s[i].DSA_Mark;
                maxIndex = i;
            }
        }
        System.out.println("\nDetails of all students:");
        for (int i = 0; i < 5; i++) {
            s[i].showdata();
            System.out.println();
        }
        System.out.println("\nDetails of student with highest DSA Mark:");
        s[maxIndex].showdata();
    }
}
