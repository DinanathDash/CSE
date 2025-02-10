import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        try {
            int luckyNumber =sc.nextInt();
            if (luckyNumber < 0) {
                throw new NumberFormatException("Negative numbers are not allowed.");
            }
            System.out.println("Your lucky number is: " + luckyNumber);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        finally{
            sc.close();
        }
    }
}
