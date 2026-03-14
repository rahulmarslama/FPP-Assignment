package Assignment10.Problem1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {

        boolean retry =true;
        while(retry)
        {
            Scanner sc = new Scanner(System.in);
            try
            {
                System.out.print("Enter quantity of items to add (1-50): ");
                int quantity = sc.nextInt();
                if(quantity<1 || quantity >50)
                {
                    throw new IllegalArgumentException("Quantity entered can not be less than 1 or greater than 50.");
                }
                System.out.println("Successfully added " + quantity + " items to your cart!");
                retry = false;
            }
            catch (InputMismatchException inEx)
            {
                System.out.println("Input must be a number.");
            }
            catch (IllegalArgumentException illeEx)
            {
                System.out.println(illeEx.getMessage());
            }

        }

    }
}
