package Assignment2.Problem4;

public class Pizza
{
    private PizzaType pizzaType;
    private PizzaSize pizzaSize;
    private int quantity;
    private double price;

    public Pizza(PizzaType pizzaType, PizzaSize pizzaSize, int quantity)
    {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.quantity = quantity;
    }

    private double calculatePrice()
    {
        double sizeprice = switch (this.pizzaSize)
        {
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };
        double typeprice = switch (this.pizzaType)
        {
            case VEGGIE -> 1.0;
            case PEPPERONI, BBQCHICKEN -> 2.0;
            case CHEEZE -> 1.5;
        };


        return (sizeprice+typeprice)* this.quantity;
    }

    public String printOrderSummary()
    {
        double totalPrice = this.calculatePrice();
        double taxAmount = totalPrice*0.03;

        return String.format("Pizza Order: \nSize: %s \nType: %s \nQuantity: %d \nPrice: $%.2f \n" +
                             "Tax: $%.2f \nTotal Price: $%.2f \n"
                              ,this.pizzaSize.name(),this.pizzaType.name()
                              ,this.quantity,totalPrice,taxAmount,totalPrice+taxAmount);
    }
}
