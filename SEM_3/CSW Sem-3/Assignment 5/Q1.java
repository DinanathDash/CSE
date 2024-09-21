import java.util.Scanner;
public class Q1 {
    public static int countSetBits(int n){
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number: ");
        int i = sc.nextInt();
        System.out.println("Number of bits:" + countSetBits(i));
        sc.close();
    }
}
