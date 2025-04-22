import java.io.*;

public class Q7 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the path of the source file:");
            String sourcePath = reader.readLine();

            File sourceFile = new File(sourcePath);

            if (!sourceFile.exists() || !sourceFile.isFile()) {
                System.out.println("The specified source file does not exist or is not a file.");
                return;
            }

            System.out.println("Enter the path of the destination file:");
            String destinationPath = reader.readLine();

            File destinationFile = new File(destinationPath);

            if (destinationFile.exists()) {
                System.out.println("The destination file already exists. Do you want to overwrite it? (yes/no)");
                String overwriteChoice = reader.readLine().toLowerCase();
                if (!overwriteChoice.equals("yes")) {
                    System.out.println("File copy operation canceled.");
                    return;
                }
            }

            try (FileReader fileReader = new FileReader(sourceFile);
                 FileWriter fileWriter = new FileWriter(destinationFile)) {
                char[] buffer = new char[1024];
                int bytesRead;
                while ((bytesRead = fileReader.read(buffer)) != -1) {
                    fileWriter.write(buffer, 0, bytesRead);
                }
                System.out.println("File copied successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while copying the file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
