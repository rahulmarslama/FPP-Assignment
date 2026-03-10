package Assignment6.prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args)
    {
        // a) through i) here, print after each step (use for-each)
        ArrayList<Order> orderList = new ArrayList<>();
        Order o1 = new Order("1234","Rahul Lama",44.23);
        Order o2 = (new Order("5231","Bikram Rokka",243244.20));
        Order o3 = (new Order("7659","Priya Dutta",1223.36));
        Order o4 = (new Order("2314","Abhisek Bachan",1223.36));
        Order o5 = (new Order("3802","Sharukh Khan",42434.23));
        orderList.add(o1);
        orderList.add(o2);
        orderList.add(o3);
        orderList.add(o4);
        orderList.add(o5);

        System.out.println(orderList.size());
        System.out.println(orderList);
        orderList.remove(o2);
        System.out.println(orderList.size());
        System.out.println(orderList);

        System.out.println("The order at position 1 is: "+orderList.get(1));

        Order newOrder = new Order("1244","Dylan Panta",12321.21);
        orderList.set(3,newOrder);
        System.out.println("The order at position 1 is: "+orderList.get(1));

        System.out.println("Sort by totalAmount (ascending) using a Comparator that’s consistent with equals: ");
        Collections.sort
                (orderList,Comparator.comparing(Order::getTotalAmount)
                        .thenComparing(Order::getOrderId)
                        .thenComparing(Order::getCustomerName));
        System.out.println(orderList);

        List<Order> filteredOrder = listMoreThan50(orderList);


        System.out.println("The list with more than 50 is: ");
        Collections.sort(filteredOrder,new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getCustomerName().compareTo(o2.getCustomerName());
            }
        });
        System.out.println(filteredOrder);
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        List<Order> returnList = new ArrayList<>();
        for (Order order: list)
        {
            if(order.getTotalAmount() > 50)
            {
                returnList.add(order);
            }
        }
        return returnList;
    }
}
