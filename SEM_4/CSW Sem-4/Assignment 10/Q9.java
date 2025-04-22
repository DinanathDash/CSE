import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class BoundedBuffer {
    private final BlockingQueue<Integer> queue;

    public BoundedBuffer(int size) {
        this.queue = new ArrayBlockingQueue<>(size);
    }

    public void put(int item) throws InterruptedException {
        queue.put(item);
    }

    public int take() throws InterruptedException {
        return queue.take();
    }
}

public class Q9 {
    public static void main(String[] args) {
        final BoundedBuffer buffer = new BoundedBuffer(5);

        Runnable producer = () -> {
            int i = 0;
            try {
                while (true) {
                    buffer.put(i);
                    System.out.println("Produced: " + i);
                    i++;
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable consumer = () -> {
            try {
                while (true) {
                    int item = buffer.take();
                    System.out.println("Consumed: " + item);
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Thread producerThread1 = new Thread(producer);
        Thread producerThread2 = new Thread(producer);
        Thread consumerThread1 = new Thread(consumer);
        Thread consumerThread2 = new Thread(consumer);

        producerThread1.start();
        producerThread2.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}
