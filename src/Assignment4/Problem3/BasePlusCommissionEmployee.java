package Assignment4.Problem3;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary;


    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }


    @Override
    public double getPayment() {
        return baseSalary + (super.getGrossSales() * super.getCommissionRate()) ;
    }
}
