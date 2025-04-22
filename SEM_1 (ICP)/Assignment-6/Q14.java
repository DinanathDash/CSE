import java.util.Scanner;

public class Q14 {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (!password.matches("[a-zA-Z0-9]+")) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();
        sc.close();
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

}
