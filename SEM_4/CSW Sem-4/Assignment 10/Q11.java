import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q11 {
    public static void main(String[] args) {
        String utcDateTimeString = "2024-05-18T15:30:45Z";
        Instant instant = Instant.parse(utcDateTimeString);

        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        String formattedDateTime = zonedDateTime.format(formatter);
        System.out.println("Local date and time in " + zoneId + ": " + formattedDateTime);
    }
}
