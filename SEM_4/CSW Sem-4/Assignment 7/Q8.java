import java.io.*;

public class Q8 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the current file name:");
            String currentFileName = reader.readLine();

            File currentFile = new File(currentFileName);

            if (!currentFile.exists() || !currentFile.isFile()) {
                System.out.println("The specified current file does not exist or is not a file.");
                return;
            }

            System.out.println("Enter the new file name:");
            String newFileName = reader.readLine();

            File newFile = new File(newFileName);

            if (newFile.exists()) {
                System.out.println("A file with the specified new name already exists. Renaming failed.");
                return;
            }

            if (currentFile.renameTo(newFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
