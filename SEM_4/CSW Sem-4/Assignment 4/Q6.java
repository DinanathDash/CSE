import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> numSet = new TreeSet<>();

        numSet.add(10);
        numSet.add(20);
        numSet.add(30);
        numSet.add(40);

        System.out.println("TreeSet of numbers: " + numSet);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchNum = sc.nextInt();

        if (numSet.contains(searchNum)) {
            System.out.println("Number " + searchNum + " exists in the TreeSet.");
        } else {
            System.out.println("Number " + searchNum + " does not exist in the TreeSet.");
        }

        System.out.print("Enter a number to remove: ");
        int removeNum = sc.nextInt();
        boolean removed = numSet.remove(removeNum);
        if (removed) {
            System.out.println("Number " + removeNum + " removed from the TreeSet.");
        } else {
            System.out.println("Number " + removeNum + " not found in the TreeSet.");
        }

        System.out.println("Updated TreeSet: " + numSet);
        sc.close();
    }
}
