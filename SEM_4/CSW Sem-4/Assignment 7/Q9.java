import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();

        Path filePath = Paths.get(fileName);

        if (!Files.exists(filePath)) {
            System.out.println("The specified file does not exist.");
            return;
        }

        try {
            BasicFileAttributes fileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            FileTime lastModifiedTime = fileAttributes.lastModifiedTime();
            long fileSize = fileAttributes.size();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedLastModifiedTime = dateFormat.format(new java.util.Date(lastModifiedTime.toMillis()));

            System.out.println("File Size: " + fileSize + " bytes");
            System.out.println("Last Modified: " + formattedLastModifiedTime);

            if (fileAttributes.isDirectory()) {
                System.out.println("Type: Directory");
            } else if (fileAttributes.isRegularFile()) {
                System.out.println("Type: Regular File");
            }

            System.out.println("Other Attributes:");
            System.out.println("  isDirectory: " + fileAttributes.isDirectory());
            System.out.println("  isRegularFile: " + fileAttributes.isRegularFile());
            System.out.println("  isSymbolicLink: " + fileAttributes.isSymbolicLink());
            System.out.println("  isOther: " + fileAttributes.isOther());
            System.out.println("  creationTime: " + fileAttributes.creationTime());
            System.out.println("  lastAccessTime: " + fileAttributes.lastAccessTime());
            System.out.println("  fileKey: " + fileAttributes.fileKey());
        } catch (IOException e) {
            System.out.println("An error occurred while getting file metadata: " + e.getMessage());
        }
    }
}
