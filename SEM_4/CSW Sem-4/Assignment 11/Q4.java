class EvenOddPrinter {
    private final int limit;
    private int counter = 1;
    private final Object lock = new Object();

    public EvenOddPrinter(int limit) {
        this.limit = limit;
    }

    public void printEven() {
        synchronized (lock) {
            while (counter < limit) {
                while (counter % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                if (counter <= limit) {
                    System.out.println("Even: " + counter);
                    counter++;
                    lock.notify();
                }
            }
        }
    }

    public void printOdd() {
        synchronized (lock) {
            while (counter < limit) {
                while (counter % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                if (counter <= limit) {
                    System.out.println("Odd: " + counter);
                    counter++;
                    lock.notify();
                }
            }
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        int limit = 20;
        EvenOddPrinter printer = new EvenOddPrinter(limit);

        Thread evenThread = new Thread(printer::printEven);
        Thread oddThread = new Thread(printer::printOdd);

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
