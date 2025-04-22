import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any value n: ");
        int n=sc.nextInt();
        double sum=0;
        int a[]=new int[n];
        sc.close();
        for (int i=0;i<n; i++ ){
            a[i]=1+(int)(Math.random()*n);
        }
        for(int i=1; i<=n; i++){
            sum+=a[i];
        }
        double avg=sum/n;
        System.out.print(sum+"\n"+avg);
    }
}
