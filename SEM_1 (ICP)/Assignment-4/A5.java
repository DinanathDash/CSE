import java.util.Scanner;
public class A5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int n = sc.nextInt();
    sc.close();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      for (int j = i - 1; j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
