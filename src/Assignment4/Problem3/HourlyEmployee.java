package Assignment4.Problem3;

public class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;


    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double getPayment() {
        return wage*hours;
    }
}
