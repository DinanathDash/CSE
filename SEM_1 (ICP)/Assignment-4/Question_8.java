import java.util.Random;
import java.util.Scanner;
public class Question_8 {
    public static void main(String[] args) {
        Random num = new Random();
        int randomNum = num.nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess the number between 1 and 10: ");
            guess = sc.nextInt();
            if (guess > randomNum) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNum) {
                System.out.println("Too low, try again.");
            }
        } while (guess != randomNum);
        System.out.println("Good guess!");
        sc.close();
    }
}
