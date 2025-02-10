import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n=sc.nextInt();
        sc.close();
        double sum=0.0;
        for(int i=1; i<=n; i++){
            sum += 1.0/i*i;
        }
        System.out.println("Sum of the series:"+sum);
    }
}
