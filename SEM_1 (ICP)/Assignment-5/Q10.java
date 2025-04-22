import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms in the sequence(n>3): ");
        int n=sc.nextInt();
        sc.close();
        int sequence[]=new int[n];
        sequence[0]=0;
        sequence[1]=1;
        sequence[2]=1;
        for(int i=3; i<=n; i++){
            sequence[i]=sequence[i-1]+sequence[i-2]+sequence[i-3];
        }
        System.out.println("The sequence upto "+n+" term is:");
        for (int i=0; i<n; i++) {
            System.out.print(sequence[i]+" ");
        }
    }
}
