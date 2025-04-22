public class A3 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            System.out.print(i + " ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }
    }
}
