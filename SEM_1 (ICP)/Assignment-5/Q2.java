import java.util.Scanner;
public class Q2{  
    public static void main(String[] args){  
        int a, n, rev,sum=0;  
        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter the prime number:");  
        n = sc.nextInt();
        sc.close(); 
        while(n!=0){  
            rev = n%10;  
            sum = sum*10 + rev;  
            n= n/10;  
        }  
        a=0;  
        for (int j=2; j<=sum/2; j++){  
            if (sum % j == 0){  
                a = 1;  
                break;  
            }  
        }  
        if(a == 0)  
            System.out.println("Twisted Prime");  
        else  
            System.out.println("Not Twisted Prime");  
    }
}