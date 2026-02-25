package Assignment2.Problem1;

/**
 * Problem 1
 * This program prints all those Customers whose billingAddress is located in the city of Chicago.
 */
public class Main
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer("Rahul","Lama","8765432");
        c1.setShippingAddress(new Address("1022 N 4th St","Fairfield","Iowa","55255"));
        c1.setBillingAddress(new Address("4344 S 9th St","Chicago","Michigan","54556"));
        Customer c2 = new Customer("Huy","Hoang","21312312");
        c2.setShippingAddress(new Address("234 S 6th St","Fairfield","Iowa","55255"));
        c2.setBillingAddress(new Address("1000 N 3th St","Fairfield","Iowa","55255"));
        Customer c3 = new Customer("Joao","Silva","42363453");
        c3.setShippingAddress(new Address("123 S 2th St","Fairfield","Iowa","55255"));
        c3.setBillingAddress(new Address("9224 N 9th St","Chicago","Michigan","54556"));

        Customer[] customers = new Customer[]{c1,c2,c3};

        for (Customer customer:customers)
        {
            if(customer.getBillingAddress().getCity().equals("Chicago"))
            {
                System.out.println(customer.toString());
            }
        }
    }
}
