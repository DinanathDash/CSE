import java.util.Scanner;
import Packages.src.Commission;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales: ");
        double sales = sc.nextDouble();
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commission = new Commission(sales);
            double result = commission.getCommission();
            System.out.println("Commission: " + result);
        }
        sc.close();
    }
}
