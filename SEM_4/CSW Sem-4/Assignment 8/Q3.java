import java.util.Scanner;
public class Q3 {
    private static StringBuffer text = new StringBuffer();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nText Editor Menu:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    appendText(scanner);
                    break;
                case 2:
                    insertText(scanner);
                    break;
                case 3:
                    deleteText(scanner);
                    break;
                case 4:
                    reverseText();
                    break;
                case 5:
                    replaceText(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
    }

    private static void appendText(Scanner scanner) {
        System.out.print("Enter text to append: ");
        String newText = scanner.next();
        text.append(newText);
        printCurrentState();
    }

    private static void insertText(Scanner scanner) {
        System.out.print("Enter index to insert text: ");
        int index = scanner.nextInt();
        System.out.print("Enter text to insert: ");
        String newText = scanner.next();
        text.insert(index, newText);
        printCurrentState();
    }

    private static void deleteText(Scanner scanner) {
        System.out.print("Enter start index to delete: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index to delete: ");
        int endIndex = scanner.nextInt();
        text.delete(startIndex, endIndex);
        printCurrentState();
    }

    private static void reverseText() {
        text.reverse();
        printCurrentState();
    }

    private static void replaceText(Scanner scanner) {
        System.out.print("Enter start index to replace: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index to replace: ");
        int endIndex = scanner.nextInt();
        System.out.print("Enter text to replace with: ");
        String newText = scanner.next();
        text.replace(startIndex, endIndex, newText);
        printCurrentState();
    }

    private static void printCurrentState() {
        System.out.println("Current text: " + text);
        System.out.println("Current capacity: " + text.capacity());
        System.out.println("Current length: " + text.length());
    }
}
