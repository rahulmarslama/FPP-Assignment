package Assignment4.Problem2;

import java.time.LocalTime;

public class SensorTest
{
    static void main()
    {
        Sensor[] sensors =
                {
                        new LightSensor(HomeLocation.BedRoom,140),
                        new LightSensor(HomeLocation.Garden,22),
                        new SoundSensor(HomeLocation.Garden,77),
                        new SoundSensor(HomeLocation.BedRoom,44),
                        new TemparatureSensor(HomeLocation.BedRoom,37),
                        new TemparatureSensor(HomeLocation.Kitchen,12),
                        new TemparatureSensor(HomeLocation.Garden,22)

                };

        for (Sensor sensor: sensors)
        {
            System.out.println(sensor.toString());
        }
    }
}
