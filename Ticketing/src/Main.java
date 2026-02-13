import edu.ticket.TicketService;
import edu.ticket.Ticket;
import edu.ticket.TicketFactory;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();
        TicketFactory ticketFactory = new TicketFactory();

        // Example 1: Bug reported from web
        Ticket ticket = ticketFactory.CreateTicket(1,"WEB", "BUG", "I see a very very BAD BUG!");
        ticketService.handle(ticket);
    }
}
