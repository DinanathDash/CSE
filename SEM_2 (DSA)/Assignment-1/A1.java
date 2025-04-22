import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();
        if (a + b == c) {
        System.out.println(a + " + " + b + " = " + c);
        } 
        else if (a == b - c) {
        System.out.println(a + " = " + b + " - " + c);
        }
        else if (a * b == c) {
        System.out.println(a + " * " + b + " = " + c);
        }
        else {
        System.out.println("No arithmetic formula found.");
        }
    }
}