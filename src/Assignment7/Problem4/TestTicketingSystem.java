package Assignment7.Problem4;

public class TestTicketingSystem
{
    static void main()
    {
     TicketingSystem ticketingSystem = new TicketingSystem();
     ticketingSystem.addTicket("Ra One Ticket");
     ticketingSystem.addTicket("Chennai Express Ticket");
     ticketingSystem.addTicket("My Name Is Khan Ticket");
     ticketingSystem.addTicket("Don Ticket");

     ticketingSystem.processTicket();
     ticketingSystem.viewNextTicket();
     ticketingSystem.processTicket();
     ticketingSystem.viewNextTicket();
     ticketingSystem.processTicket();
     ticketingSystem.viewNextTicket();
     ticketingSystem.processTicket();
     ticketingSystem.viewNextTicket();

     ticketingSystem.viewNextTicket();;

    }
}
