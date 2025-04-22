import java.util.Scanner;
public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = sc.nextInt();
        sc.close();
        String inputString = Integer.toString(input);
        inputString = inputString.replaceAll("0", "");
        System.out.println("Input without zeros: " + inputString);
    }
}
