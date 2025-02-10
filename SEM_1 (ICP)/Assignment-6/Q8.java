import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();
        double area = area(n, side);
        System.out.println("The area of the polygon is " + area);
    }
    public static double area(int n, double side) {
        double numerator = n * side * side;
        double denominator = 4 * Math.tan(Math.PI / n);
        return numerator / denominator;
    }
}
