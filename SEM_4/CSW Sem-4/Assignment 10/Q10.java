import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q10 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 5, 18, 15, 30, 45);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);

        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}
