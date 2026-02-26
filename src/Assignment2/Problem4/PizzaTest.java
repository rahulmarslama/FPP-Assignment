package Assignment2.Problem4;

import static Assignment2.Problem4.PizzaSize.*;
import static Assignment2.Problem4.PizzaType.*;

public class PizzaTest
{
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(VEGGIE, SMALL, 2);
        Pizza pizza2 = new Pizza(PEPPERONI, MEDIUM, 1);
        Pizza pizza3 = new Pizza(BBQCHICKEN, LARGE , 2);
        System.out.println(pizza1.printOrderSummary());
        System.out.println(pizza2.printOrderSummary());
        System.out.println(pizza3.printOrderSummary());
    }
}
