public class Q28 {
    public static void main(String[] args) {
        try {
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.err.println("StackOverflowError: " + e.getMessage());
        }
    }

    public static void recursiveMethod(int i) {
        System.out.println("Method called with: " + i);
        recursiveMethod(i + 1);
    }
}
