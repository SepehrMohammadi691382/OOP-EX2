package edu.ticket.ticketPolicy;

import edu.ticket.Ticket;

public interface IRoutingStrategy {
    String route(Ticket ticket);
}


