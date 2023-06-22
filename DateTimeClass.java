import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("EEEE, yyyy-MM-dd");
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(date.format(localDateTime));
        System.out.println(time.format(localDateTime));



    }
}
