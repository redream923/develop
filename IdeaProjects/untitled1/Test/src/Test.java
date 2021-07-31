import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author dpc
 * @create 2021-07-07 上午 11:13
 */
public class Test {
    public static void main(String[] args) {
        Instant timestamp = new Date().toInstant();
        LocalDateTime date  = LocalDateTime.ofInstant(
          timestamp, ZoneId.of(ZoneId.SHORT_IDS.get("PST"))
        );
        System.out.println("Date = "+date);

        Instant time = Calendar.getInstance().toInstant();
        System.out.println(time);

        ZoneId defaultZone = TimeZone.getDefault().toZoneId();
        System.out.println(defaultZone);
        
    }
}
