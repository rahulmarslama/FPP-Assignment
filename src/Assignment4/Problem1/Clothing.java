package Assignment4.Problem1;

public class Clothing extends Product
{
    private String brand;
    private double discount;


    public Clothing(String productName,double price, String brand, double discount)
    {
        super(productName);
        super.setPrice(price);
        this.brand = brand;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("""
                Product Name : %s
                Price : $%s,
                Brand : %s,
                Discount : %.2f %%
                """,
                productName,getPrice(),brand,discount

        );
    }

    @Override
    public double getPrice() {
        return super.getPrice() - discount/100*super.getPrice();
    }
}
