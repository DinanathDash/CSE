import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        System.out.print("Enter the number of element upto which you  want the sum: ");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt(), sum=0;
        for (int i=0; i<=n; i++) {
            sum+=i;
        }
        System.out.println("Sum of "+n+" numbers are: "+sum);
        sc.close();
    }
}