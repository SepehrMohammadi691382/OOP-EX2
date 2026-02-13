package edu.ticket.ticketPolicy;

import edu.ticket.Ticket;

public class GenericRoutingStrategy implements IRoutingStrategy {
    public String route(Ticket ticket) {
        return "SUPPORT";
    }
}


