import java.io.*;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your diary entry:");
        String entry = sc.nextLine();

        Date date = new Date();
        String currentDate = date.toString();

        String fileName = "diary.txt";

        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Warning: diary file already exists. Appending to the existing file.");
        }

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);

            fileWriter.write("Date: " + currentDate + "\n");
            fileWriter.write("Entry: " + entry + "\n");
            fileWriter.write("\n");
            fileWriter.close();

            System.out.println("Diary entry has been successfully added to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        sc.close();
    }
}
