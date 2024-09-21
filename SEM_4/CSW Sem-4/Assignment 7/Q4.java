import java.io.File;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = sc.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        System.out.println("Files and subdirectories in " + directoryPath + ":");
        File[] filesAndDirs = directory.listFiles();
        if (filesAndDirs != null) {
            for (File fileOrDir : filesAndDirs) {
                if (fileOrDir.isDirectory()) {
                    System.out.println("[Directory] " + fileOrDir.getName());
                } else {
                    System.out.println("[File] " + fileOrDir.getName());
                }
            }
        } else {
            System.out.println("Failed to list files and subdirectories.");
        } 
    }
}
