package Assignment4.Problem2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public interface Sensor
{
    String getSensorType();
    double getReading();
    HomeLocation getLocation();
    LocalTime getLastUpdated();
    String performAction();

    default String formatSensor()
    {
        return String.format("""
                Sensor Type: %s
                Reading: %.1f
                Location: %s
                Last Updated: %s
                Action: %s
                """,this.getSensorType(),this.getReading(),this.getLocation().name(),
                this.getLastUpdated().format(DateTimeFormatter.ofPattern("hh:mm a")),
                this.performAction()
        );
    }
}
