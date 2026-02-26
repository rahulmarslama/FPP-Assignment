package Assignment2.Problem3;

/**
 * Travel Booker
 * This program creates and calculates three types of travel bookings.
 */
public class TravelBooker
{
    static void main(String[] args) {
        String restart = "";
        do {
            String bookingType = IO.readln("Enter F for Flight Booking\n" +
                                                   "Enter H for Hotel Booking\n" +
                                                   "Enter C for Car Rental\n");
            switch (bookingType.toUpperCase()) {
                case "F" -> {
                    String origin = IO.readln("Enter origin: \n");
                    String destination = IO.readln("Enter destination: \n");
                    double distanceKm = Double.parseDouble(IO.readln("Enter the distance in km: \n"));
                    double averageSpeed = Double.parseDouble(IO.readln("Enter the average speed in km/hr: \n"));
                    FlightBooking flightBooking = new FlightBooking(origin, destination, distanceKm);
                    double flightTime = flightBooking.computeFlightTime(averageSpeed);
                    System.out.printf("The total flight time is %.2f hr. \n", flightTime);
                }
                case "H" -> {
                    String hotelName = IO.readln("Enter the hotel name: \n");
                    int nights = Integer.parseInt(IO.readln("Enter the number of nights: \n"));
                    double pricePerNight = Double.parseDouble(IO.readln("Enter the price per night: \n"));
                    HotelBooking hotelBooking = new HotelBooking(hotelName, nights,pricePerNight);
                    double totalCost = hotelBooking.totalCost();
                    System.out.printf("The total cost for the hotel is $%.2f. \n", totalCost);
                }
                case "C" -> {
                    String carModel = IO.readln("Enter the car model: \n");
                    int days = Integer.parseInt(IO.readln("Enter the number of rental days: \n"));
                    double ratePerDay = Double.parseDouble(IO.readln("Enter the rate per day: \n"));
                    double milesPerDay = Double.parseDouble(IO.readln("Enter the milesPerDay: \n"));
                    CarRental carRental = new CarRental(carModel, days,ratePerDay, milesPerDay);
                    double totalRentalCost = carRental.totalRentalCost();
                    double totalMilesAllowed = carRental.totalMilesAllowed();
                    System.out.printf("The total rental cost is $%.2f. \n", totalRentalCost);
                    System.out.printf("The total miles allowerd %.2f miles.\n", totalMilesAllowed);
                }
                default -> System.out.println("Invalid input.");
            }
            restart = IO.readln("Do you want to continue (y/n)?");
        }
        while (restart.equalsIgnoreCase("y"));
    }
}
