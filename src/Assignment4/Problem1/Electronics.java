package Assignment4.Problem1;

public class Electronics extends Product
{
    private int warrantyInMonths;
    private double warrantyCost;


    public Electronics(String productName,double price, int warrantyInMonths, double warrantyCost)
    {
        super(productName);
        super.setPrice(price);
        this.warrantyInMonths = warrantyInMonths;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        return warrantyCost + super.getPrice();
    }

    @Override
    public String toString() {
        return String.format("""
                Product Name : %s
                Price : $%s,
                Warranty In Months : %d,
                Warranty Cost : $%.2f
                """,
                productName,getPrice(),warrantyInMonths,warrantyCost
        );
    }
}
