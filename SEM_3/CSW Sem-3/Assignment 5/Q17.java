import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();
        sc.close();
        boolean isEven = isEven(number);
        System.out.println("Is the number even? " + isEven);
    }
    public static boolean isEven(int num) {
        return (num & 1) == 0;
    }
}
