import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        ArrayList<Object> objectList = new ArrayList<>();
        Runtime runtime = Runtime.getRuntime();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            objectList.add(new Object());
        }

        long endTime = System.currentTimeMillis();

        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();

        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Heap Size: " + totalMemory);
        System.out.println("Free Memory: " + freeMemory);
    }
}
