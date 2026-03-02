package Assignment4.Problem2;

import java.time.LocalTime;

public class TemparatureSensor implements Sensor
{
    private HomeLocation location;
    private LocalTime lastupdated;
    private double temperaturLevel;

    public TemparatureSensor(HomeLocation location, double temperaturLevel) {
        this.location = location;
        this.lastupdated = LocalTime.now();
        this.temperaturLevel = temperaturLevel;
    }

    @Override
    public String toString()
    {
        return formatSensor();
    }

    @Override
    public String getSensorType() {
        return TemparatureSensor.class.getSimpleName();
    }

    @Override
    public double getReading() {
        return this.temperaturLevel;
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
        if(this.temperaturLevel > 30)
        {
            return "An alert to turn on the AC.";
        }
        else if(this.temperaturLevel < 18)
        {
            return "An alert to turn on the Heater.";
        }
        else
        {
            return "Temperature is in normal range.";
        }
    }
}
