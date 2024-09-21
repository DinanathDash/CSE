import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private int counter = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        } finally {
            lock.unlock();
        }
    }

    public int getCounter() {
        return counter;
    }
}

class WorkerThread extends Thread {
    private final SharedResource resource;

    public WorkerThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment();
            try {
                Thread.sleep(100);  // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new WorkerThread(resource);
        Thread thread2 = new WorkerThread(resource);
        Thread thread3 = new WorkerThread(resource);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + resource.getCounter());
    }
}
