public class Q8 {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Hello, CSW2!");

        Thread thread = new Thread(task);

        thread.start();
    }
}
