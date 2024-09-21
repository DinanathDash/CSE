import java.io.File;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = sc.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist or is not a directory.");
            return;
        }

        System.out.println("Contents of " + directoryPath + ":");
        listFilesRecursively(directory, 0);
    }

    private static void listFilesRecursively(File directory, int depth) {
        File[] filesAndDirs = directory.listFiles();

        if (filesAndDirs != null) {
            StringBuilder indentation = new StringBuilder();
            for (int i = 0; i < depth; i++) {
                indentation.append("    ");
            }

            for (File fileOrDir : filesAndDirs) {
                System.out.println(indentation + (fileOrDir.isDirectory() ? "[Directory] " : "[File] ") + fileOrDir.getName());

                if (fileOrDir.isDirectory()) {
                    listFilesRecursively(fileOrDir, depth + 1);
                }
            }
        }
    }
}
