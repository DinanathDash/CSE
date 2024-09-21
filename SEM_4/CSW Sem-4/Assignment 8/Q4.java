import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        System.out.print("Enter a string: ");
        text.append(scanner.nextLine());

        int choice;
        do {
            System.out.println("\nText Manipulation Menu:");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Display the current string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSubstring(scanner, text);
                    break;
                case 2:
                    removeCharacters(scanner, text);
                    break;
                case 3:
                    modifyCharacter(scanner, text);
                    break;
                case 4:
                    concatenateString(scanner, text);
                    break;
                case 5:
                    displayCurrentString(text);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
    }

    private static void addSubstring(Scanner scanner, StringBuilder text) {
        System.out.print("Enter substring to add: ");
        String substring = scanner.next();
        System.out.print("Enter position to add substring: ");
        int position = scanner.nextInt();
        text.insert(position, substring);
        displayCurrentString(text);
    }

    private static void removeCharacters(Scanner scanner, StringBuilder text) {
        System.out.print("Enter start index to remove: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index to remove: ");
        int endIndex = scanner.nextInt();
        text.delete(startIndex, endIndex);
        displayCurrentString(text);
    }

    private static void modifyCharacter(Scanner scanner, StringBuilder text) {
        System.out.print("Enter index to modify: ");
        int index = scanner.nextInt();
        System.out.print("Enter new character: ");
        char newChar = scanner.next().charAt(0);
        text.setCharAt(index, newChar);
        displayCurrentString(text);
    }

    private static void concatenateString(Scanner scanner, StringBuilder text) {
        System.out.print("Enter string to concatenate: ");
        String toConcatenate = scanner.next();
        text.append(toConcatenate);
        displayCurrentString(text);
    }

    private static void displayCurrentString(StringBuilder text) {
        System.out.println("Current string: " + text);
    }
}
