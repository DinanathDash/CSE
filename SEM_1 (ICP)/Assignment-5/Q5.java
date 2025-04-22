import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Multiplication table of ");
        int x=sc.nextInt();
        sc.close();
        for(int i=1; i<=10; i++){
            System.out.println(x+" * "+i+" = "+x*i);
        }
    }
}
