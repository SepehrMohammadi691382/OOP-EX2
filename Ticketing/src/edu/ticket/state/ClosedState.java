package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.ticketPolicy.TicketTypePolicy;

public class ClosedState implements ITicketState {
    public void handle(Ticket ticket, TicketTypePolicy policy) {
        System.out.println("Ticket closed");
    }
}


