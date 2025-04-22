import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        int finalSum = 0, i, j; 
        for(i = 1; i <= n; i++){ 
            int sum = 0; 
            for(j = 1; j <= i; j++){ 
                sum += j; 
            } 
            finalSum += sum; 
        } 
        System.out.println("Sum : " + finalSum); 
    }   
}
