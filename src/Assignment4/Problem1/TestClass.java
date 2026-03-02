package Assignment4.Problem1;

public class TestClass
{
    static void main()
    {
        Product[] products =
                {
                        new Clothing("Cropped Tshirt",200,"Uniclo",12),
                        new Clothing("Black Jeans",550,"Babal",5),
                        new Electronics("Samsung TV",2500,24,140),
                        new Electronics("Apple Watch",450,12,20),
                        new Furniture("Sofa",250,Material.Wood,25),
                        new Furniture("Chair",100,Material.Steel,10)
                };

        for (Product product: products)
        {
            System.out.println(product.toString());
        }

        System.out.printf("The sum of all products is: %.2f",sumOfAllProducts(products));

    }

    static double sumOfAllProducts(Product[] products)
    {
        double sum = 0.00;
        for (Product product: products)
        {
            sum += product.getPrice();
        }
        return sum;
    }
}
