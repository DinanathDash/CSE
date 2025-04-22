import java.util.Arrays;
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements of Array: ");
        int n = sc.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        System.out.println("Enter elements of the array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter elements of the array b: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
		sc.close();
        double[] c = addMatrix(a, b);
        System.out.println("Array c: "+Arrays.toString(c));
    }

    public static double[] addMatrix(double[] a, double[] b) {
        int n = a.length;
        double[] c = new double[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }
}
