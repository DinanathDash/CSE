import java.util.LinkedList;
import java.util.Queue;
public class Q2 {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("1");
        myQueue.offer("2");
        myQueue.offer("3");
        System.out.println("Queue: " + myQueue);
        String dequeuedElement = myQueue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);
        System.out.println("Queue after dequeue: " + myQueue);
    }
}
