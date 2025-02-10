import java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer N: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        sc.close();
        
        do {
            int randomNum = (int) (Math.random() * n) + 1;
            System.out.println(randomNum);
            sum += randomNum;
            count++;
        } while (count < n);

        double average = (double) sum / n;
        System.out.println("The average value is: " + average);
    }
}
