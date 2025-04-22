public class A1 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                if (j == i || j == 1 || i == 1) {
                    System.out.print(j + " ");
                } 
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
