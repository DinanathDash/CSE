import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns of 2D-Array: ");
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.print("Enter elements of 2D-Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The elements of 2D array are:");
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print(arr[i][j] + " ");
            sum += arr[i][j];
            }
        System.out.println();
        }
        System.out.printf("The sum of elements of the 2D-Array is %d",sum);
    }
}
