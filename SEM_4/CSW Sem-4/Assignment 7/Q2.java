import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        String fileName = "diary.txt";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            System.out.println("Contents of " + fileName + ":");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file \"" + fileName + "\" does not exist.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
