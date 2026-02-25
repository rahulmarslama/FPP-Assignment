package Assignment2.Problem2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeZoneScheduler
{
    static void main(String[] args)
    {
        String eventName = IO.readln("Enter the event name: \n");
        String dateString = IO.readln("Enter the event date: (MM/dd/yyyy) \n");
        String timeString = IO.readln("Enter the event time in 24 hours: (hh:mm)\n");

        String[] splittedDate = dateString.split("/");
        LocalDate date = LocalDate.of(Integer.parseInt(splittedDate[2]),
                                      Integer.parseInt(splittedDate[0]),
                                      Integer.parseInt(splittedDate[1]));

        String[] splittedTime = timeString.split(":");
        LocalTime time = LocalTime.of(Integer.parseInt(splittedTime[0]),
                                      Integer.parseInt(splittedTime[1]));

        Event event = new Event(eventName,date,time);

        System.out.println("The day of the week is :" + date.getDayOfWeek());
        System.out.println("Leap year: " + date.isLeapYear());

        Period periodUntilEvent = Period.between(LocalDate.now(),date);
        System.out.println("Time until the event: "+periodUntilEvent.getYears()
                            +" years " + periodUntilEvent.getMonths()
                            +" months "+ periodUntilEvent.getDays()
                            +" days.");

        String formattedEventdetails = formatEventDetails(event.getDate(),event.getTime(),
                                       ZonedDateTime.now().getZone().getId());
        System.out.println(formattedEventdetails);

            String userInputTimeZone = IO.readln("Enter your time zone:");
        try
        {
            ZoneId zoneId = ZoneId.of(userInputTimeZone);
            ZonedDateTime eventInTargetZone  = ZonedDateTime.of(event.getDate(),event.getTime(),
                        ZoneId.systemDefault())
                .withZoneSameInstant(zoneId);
        System.out.println("The time of event for your time zone is: \n" +
                formatEventDetails(eventInTargetZone .toLocalDate(),eventInTargetZone .toLocalTime(),
                userInputTimeZone));
        }
        catch (Exception ex)
        {
            System.out.println("Invalid time zone.");
        }

    }

    static String formatEventDetails(LocalDate date, LocalTime time,String zoneName )
    {
        String formattedString = date.getDayOfWeek()+", " +
                                 date.getMonth() + " " + date.getDayOfMonth()+ ", "+
                                 date.getYear()+" @ "+ time.getHour()+":"+
                                 time.getMinute()+" [" + zoneName +"]";

        return formattedString;
    }
}
