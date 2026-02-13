package edu.ticket.ticketPolicy;

import edu.ticket.Ticket;

public class BugRoutingStrategy implements IRoutingStrategy {
    public String route(Ticket ticket) {
        return "ENGINEERING";
    }
}


