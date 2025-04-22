import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found: " + e.getMessage());
        }
    }
}
