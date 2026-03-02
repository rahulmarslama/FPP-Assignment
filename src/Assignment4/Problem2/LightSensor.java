package Assignment4.Problem2;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor
{
    private HomeLocation location;
    private LocalTime lastupdated;
    private double lightLevel;

    public LightSensor(HomeLocation location, double lightLevel) {
        this.location = location;
        this.lastupdated = LocalTime.now();
        this.lightLevel = lightLevel;
    }

    @Override
    public String toString()
    {
        return formatSensor();
    }

    @Override
    public String getSensorType() {
        return LightSensor.class.getSimpleName();
    }

    @Override
    public double getReading() {
        return this.lightLevel;
    }

    @Override
    public HomeLocation getLocation() {
        return this.location;
    }

    @Override
    public LocalTime getLastUpdated() {
        this.lastupdated = LocalTime.now();
        return lastupdated;
    }

    @Override
    public String performAction() {
        if(this.lightLevel<100)
        {
            return "An alert to turn on the light.";
        }
        else
        {
            return "Light is sufficient.";
        }
    }
}
