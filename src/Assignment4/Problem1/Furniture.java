package Assignment4.Problem1;

public class Furniture extends Product
{
    private Material material;
    private double shippingCost;


    public Furniture(String productName,double price, Material material, double shippingCost) {
        super(productName);
        super.setPrice(price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return shippingCost + super.getPrice();
    }

    @Override
    public String toString() {
        return String.format("""
                Product Name : %s
                Price : $%s,
                Material : %s,
                Shipping Cost : $%.2f
                """,
                productName,getPrice(),material.name(),shippingCost
        );
    }
}
