package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.ticketPolicy.TicketTypePolicy;

public class NewState implements ITicketState {
    public void handle(Ticket ticket, TicketTypePolicy policy) {
        System.out.println("Ticket created");

        String channel = ticket.getChannel();
        System.out.println("Received from " + channel);

        ticket.setStatus("ASSIGNED");
        ticket.setState(new AssignedState());
    }
}
