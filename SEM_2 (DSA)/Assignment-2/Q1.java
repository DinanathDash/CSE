import java.util.Scanner;
class Phone {
    int area_code, exchange, number;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area code: ");
        area_code = sc.nextInt();
        System.out.print("Enter exchange code: ");
        exchange = sc.nextInt();
        System.out.print("Enter number: ");
        number = sc.nextInt();
        sc.close();
    }
    public void display() {
        System.out.println("(" + area_code + ") " + exchange + "-" + number);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.area_code = 212;
        p1.exchange = 767;
        p1.number = 8900;
        Phone p2 = new Phone();
        p2.input();
        System.out.print("My number is ");
        p1.display();
        System.out.print("Your number is ");
        p2.display();
    }
}
