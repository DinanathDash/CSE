import java.util.*;
public class Q6 { 
    public static void decToHexa(int n) { 
        char[] hexaDeciNum = new char[100]; 
        int i = 0; 
        while (n != 0) { 
            int temp = 0; 
            temp = n % 16; 
            if (temp < 10) { 
                hexaDeciNum[i] = (char)(temp + 48); 
                i++; 
            } 
            else { 
                hexaDeciNum[i] = (char)(temp + 55); 
                i++; 
            } 
            n = n / 16; 
        }  
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(hexaDeciNum[j]); 
    } 
    public static void main(String[] args) { 
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter a Decimal number: ");
        int n = sc.nextInt(); 
        System.out.print("Its hexadecimal is: ");
        decToHexa(n);
        sc.close();
    } 
} 