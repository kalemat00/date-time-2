import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        //System.out.println(currentTime);

        DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd-MMMM-yy HH:mm ");
        //System.out.println(currentTime.format(dataFormat));

        System.out.println("formatted time of the current time zone : " +
                currentTime.atZone(ZonedDateTime.now().getZone()).format(dataFormat));
        System.out.println("time of the current time zone : " + currentTime.atZone(ZonedDateTime.now().getZone()));
    }
}
