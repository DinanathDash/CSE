import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        sc.close();
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if(sum % 9 == 0) {
            System.out.println("The number is divisible by 9");
        } else {
            System.out.println("The number is not divisible by 9");
        }
    }
}
