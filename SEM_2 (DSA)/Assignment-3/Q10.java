import java.util.Scanner;
public class Q10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String reversed = reverse(s);
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
    public static String reverse(String s) {
        if (s.isEmpty())
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
