import java.util.Scanner;
public class Q2a  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        System.out.println("All the characters are distinct: "+hasUniqueChars(str));
        sc.close();
    }

    public static boolean hasUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
