import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.println("\nMenu:");
        System.out.println("1. Convert to lowercase");
        System.out.println("2. Convert to uppercase");
        System.out.println("3. Search for a character/index");
        System.out.println("4. Concatenate with another string");
        System.out.println("5. Exit");

        boolean exit = false;
        while (!exit) {
            System.out.print("\nEnter your choice (1-5): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    String lowercaseString = inputString.toLowerCase();
                    System.out.println("Result: " + lowercaseString);
                    break;
                case 2:
                    String uppercaseString = inputString.toUpperCase();
                    System.out.println("Result: " + uppercaseString);
                    break;
                case 3:
                    System.out.print("Enter a character to search: ");
                    char searchChar = sc.nextLine().charAt(0);
                    int index = inputString.indexOf(searchChar);
                    if (index != -1) {
                        System.out.println("Character '" + searchChar + "' found at index: " + index);
                    } else {
                        System.out.println("Character '" + searchChar + "' not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter another string to concatenate: ");
                    String concatString = sc.nextLine();
                    String concatenatedString = inputString.concat(concatString);
                    System.out.println("Result: " + concatenatedString);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        sc.close();
    }
}
