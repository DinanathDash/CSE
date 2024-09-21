import java.io.File;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the file to delete:");
        String fileName = sc.nextLine();

        File fileToDelete = new File(fileName);

        if (!fileToDelete.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        if (fileToDelete.delete()) {
            System.out.println("File \"" + fileName + "\" has been successfully deleted.");
        } else {
            System.out.println("Failed to delete the file \"" + fileName + "\".");
        }
    }
}
