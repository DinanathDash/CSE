import java.io.*;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your new diary entry:");
        String newEntry = sc.nextLine();

        Date currentDate = new Date();
        String timestamp = currentDate.toString();

        String fileName = "diary.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);

            fileWriter.write("\n");
            fileWriter.write("Date: " + timestamp + "\n");
            fileWriter.write("Entry: " + newEntry + "\n");

            fileWriter.close();

            System.out.println("New diary entry has been successfully added to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        sc.close();
    }
}
