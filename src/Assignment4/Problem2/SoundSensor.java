package Assignment4.Problem2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor
{
    private HomeLocation location;
    private LocalTime lastupdated;
    private double soundLevel;

    public SoundSensor(HomeLocation location, double soundLevel) {
        this.location = location;
        this.lastupdated = LocalTime.now();
        this.soundLevel = soundLevel;
    }

    @Override
    public String toString()
    {
        return formatSensor();
    }

    @Override
    public String getSensorType() {
        return SoundSensor.class.getSimpleName();
    }

    @Override
    public double getReading() {
        return this.soundLevel;
    }

    @Override
    public HomeLocation getLocation() {
        return this.location;
    }

    @Override
    public LocalTime getLastUpdated() {
        this.lastupdated = LocalTime.now();
        return lastupdated;    }

    @Override
    public String performAction() {
        if(this.soundLevel > 70)
        {
            return "An alert to turn on the noise cancellation.";
        }
        else
        {
            return "Sound is within normal range.";
        }
    }
}
