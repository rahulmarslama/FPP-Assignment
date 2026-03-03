package Assignment4.Problem3;

public abstract class Employee
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;


    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double getPayment();

    @Override
    public String toString()
    {
        return String.format("""
                First Name: %s
                Last Name: %s
                Social Security Number: %s
                Payment: $%.2f
                """,
                this.getFirstName(), this.getLastName(),this.getSocialSecurityNumber(),
                this.getPayment()
        );
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

}
