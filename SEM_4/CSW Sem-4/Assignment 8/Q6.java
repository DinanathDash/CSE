import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String firstString = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String secondString = sc.nextLine();
        
        String firstStringLower = firstString.toLowerCase();
        String firstStringUpper = firstString.toUpperCase();
        String secondStringLower = secondString.toLowerCase();
        String secondStringUpper = secondString.toUpperCase();
        
        boolean equalIgnoreCase = firstStringLower.equals(secondStringLower);
        
        System.out.println("First string in lowercase: " + firstStringLower);
        System.out.println("First string in uppercase: " + firstStringUpper);
        System.out.println("Second string in lowercase: " + secondStringLower);
        System.out.println("Second string in uppercase: " + secondStringUpper);
        
        if (equalIgnoreCase) {
            System.out.println("The two strings are equal (ignoring case).");
        } else {
            System.out.println("The two strings are not equal (ignoring case).");
        }
        sc.close();
    }
}
