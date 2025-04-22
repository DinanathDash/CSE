import java.util.Arrays;
import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements of Array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter elements of the array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter elements of the array b: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
		sc.close();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println("Array c: "+Arrays.toString(c));
    }
}