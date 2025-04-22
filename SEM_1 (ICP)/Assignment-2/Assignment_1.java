import java.util.Scanner;
public class Assignment_1 
{
        public static void main(String[] args)
    {  
        Scanner  sc=new Scanner(System.in);
        System.out.print("Enter the number of minutes:");
        int a=sc.nextInt();
        int c=(a%525600)/1440;
        int b=a/525600;
        System.out.print(a+" minutes is approximately "+b+" years and "+c+" days");
        sc.close();
    }
}
