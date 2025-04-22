import java.util.Scanner;
public class Q1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum1=0, sum2=0;
        sc.close();
        for (int i=1; i<a; i++){
            if(a%i==0){
                sum1+=i;
            }
        }
        for (int j=1; j<a; j++){
            if(b%j==0){
                sum2+=j;
            }
        }
        if (sum1 == b && sum2 == a) {
            System.out.println(a + " and " + b + " are amicable numbers");
        } else {
            System.out.println(a + " and " + b + " are not amicable numbers");
        }
    }
}