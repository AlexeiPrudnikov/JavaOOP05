import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logging {
    static void writeEvent(Event event, String message) {
        try (FileWriter fileWriter = new FileWriter("events.log", true)) {
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            StringBuilder sb = new StringBuilder();
            sb.append(df.format(calendar.getTime()));
            sb.append(";");
            sb.append(event);
            sb.append(";");
            sb.append(message);
            sb.append(";\n");
            fileWriter.write(sb.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
