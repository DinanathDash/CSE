import java.util.Scanner;
public class Q10 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[3][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        sc.close();
        for (int i = 0; i < m[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
        }
    }
}
