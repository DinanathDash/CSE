import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base string: ");
        String baseString = sc.nextLine();
        
        System.out.print("Enter the number of times it should be concatenated: ");
        int count = sc.nextInt();
        
        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(baseString);
        }
        long endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        
        System.out.println("StringBuilder took: " + stringBuilderTime + " nanoseconds");
        System.out.println("Final length using StringBuilder: " + stringBuilder.length());
        
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            stringBuffer.append(baseString);
        }
        endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        
        System.out.println("StringBuffer took: " + stringBufferTime + " nanoseconds");
        System.out.println("Final length using StringBuffer: " + stringBuffer.length());
        
        if (stringBuilderTime < stringBufferTime) {
            System.out.println("StringBuilder was faster by " + (stringBufferTime - stringBuilderTime) + " nanoseconds");
        } else if (stringBufferTime < stringBuilderTime) {
            System.out.println("StringBuffer was faster by " + (stringBuilderTime - stringBufferTime) + " nanoseconds");
        } else {
            System.out.println("Both StringBuilder and StringBuffer took the same amount of time.");
        }
        sc.close();
    }
}
