import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

class PrimeNumberGenerator extends Thread {
    private final int start;
    private final int end;
    private final List<Integer> primeNumbers;
    private final ReentrantLock lock;

    public PrimeNumberGenerator(int start, int end, List<Integer> primeNumbers, ReentrantLock lock) {
        this.start = start;
        this.end = end;
        this.primeNumbers = primeNumbers;
        this.lock = lock;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                lock.lock();
                try {
                    primeNumbers.add(i);
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        int limit = 100;
        int numberOfThreads = 4;
        List<Integer> primeNumbers = new ArrayList<>();
        ReentrantLock lock = new ReentrantLock();

        int range = limit / numberOfThreads;
        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * range + 1;
            int end = (i == numberOfThreads - 1) ? limit : (i + 1) * range;
            threads[i] = new PrimeNumberGenerator(start, end, primeNumbers, lock);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        primeNumbers.sort(Integer::compareTo);
        System.out.println("Prime numbers up to " + limit + ": " + primeNumbers);
    }
}
