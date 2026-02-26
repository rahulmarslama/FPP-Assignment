package Assignment2.Problem3;

public record HotelBooking( String hotelName, int nights, double pricePerNight)
{
    public double totalCost()
    {
        return this.nights * this.pricePerNight;
    }
}
