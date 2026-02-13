package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.ticketPolicy.TicketTypePolicy;

public interface ITicketState {
    void handle(Ticket ticket, TicketTypePolicy policy);
}


