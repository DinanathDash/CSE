import java.util.Scanner;
public class Q4 {
    public static < E > void printArray( E[] inputArray ) {
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        String[] intElements = sc.nextLine().split(" ");
        Integer[] intArray = new Integer[intElements.length];
        for (int i = 0; i < intElements.length; i++) {
            intArray[i] = Integer.parseInt(intElements[i]);
        }
        System.out.print("Integer Array contains: ");
        printArray(intArray);
        System.out.print("Enter double array elements: ");
        String[] doubleElements = sc.nextLine().split(" ");
        Double[] doubleArray = new Double[doubleElements.length];
        for (int i = 0; i < doubleElements.length; i++) {
            doubleArray[i] = Double.parseDouble(doubleElements[i]);
        }
        System.out.print("Double Array contains: ");
        printArray(doubleArray);
        sc.close();
    }
}
