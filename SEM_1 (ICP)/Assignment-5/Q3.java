import java.util.Scanner;
public class Q3{  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter the first number:");  
        int a=sc.nextInt();
        System.out.print("Enter the second number:");  
        int b=sc.nextInt();
        sc.close();
        int x=0; 
        for (int i=a; i<=b; i++){  
            if (i==1||i==0) 
                continue;
            x=1;
            for(int j=2; j<=i/2; ++j){
                if(i%j==0){
                    x=0;
                    break;
                }
            }
            if(x==1)  
                System.out.println("Prime numbers between"+a+" and "+b+ " are:"+i);  
        }  
    }
}