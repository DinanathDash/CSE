import java.util.Scanner;
public class A2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("how many lines do you want to enter");
        int n= sc.nextInt();
        String [] str;
        str= new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        sc.close();
        for(int i=n;i>=0;i--){
            System.out.println(str[i]);
        }
    }
}