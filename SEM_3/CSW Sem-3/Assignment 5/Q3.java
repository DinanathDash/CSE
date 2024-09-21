import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.print("Enter the positions i and j to swap (0-based indexing): ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int result = swapBits(number, i, j);
        System.out.println("Number after swapping bits at positions " + i + " and " + j + ": " + result);
        sc.close();
    }
    public static int swapBits(int number, int i, int j) {
       	int bitI = (number >> i) & 1;
      	int bitJ = (number >> j) & 1;
	    int x = bitI ^ bitJ;
	    x = (x << i) | (x << j);
    	int result = number ^ x;
        return result;
    }
}
