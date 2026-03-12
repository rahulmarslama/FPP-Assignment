package Assignment7.Problem4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem
{
    private Queue<Ticket> ticketQueue = new LinkedList<>();;
    private int nextId;


    public TicketingSystem()
    {
        ticketQueue = new LinkedList<>();
        nextId = 1;
    }

    public void addTicket(String description)
    {
        Ticket newTicket = new Ticket(nextId++,description);
        ticketQueue.add(newTicket);
        System.out.println("Ticket added with id: "+ newTicket.getId());
    }

    public void processTicket()
    {
        if(ticketQueue.isEmpty())
        {
            System.out.println("No ticket remaining to process");
            return;
        }

        System.out.println("Processing ticket...");
        Ticket ticket = ticketQueue.peek();
        System.out.println("Ticket returned with id: "+ ticket.getId());
        ticketQueue.remove();
    }

    public void viewNextTicket()
    {
        if(ticketQueue.isEmpty())
        {
            System.out.println("No ticket available");
            return;
        }
        Ticket ticket = ticketQueue.peek();
        System.out.println("The next ticket is with ticket id: "+ ticket.getId());
    }

}
