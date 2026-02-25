package Assignment2.Problem2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event
{
    private String name;
    private LocalDate date;
    private LocalTime time;


    public Event(String name, LocalDate date, LocalTime time)
    {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }
}
