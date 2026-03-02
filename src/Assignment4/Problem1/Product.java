package Assignment4.Problem1;

public abstract class Product
{
    protected String productName;
    private double price;

    //abstract method that is over-ridden in the child classes.
    public abstract String toString();

    public Product(String productName)
    {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
