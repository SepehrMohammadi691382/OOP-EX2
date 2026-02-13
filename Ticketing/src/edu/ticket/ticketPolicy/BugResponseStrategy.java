package edu.ticket.ticketPolicy;

import edu.ticket.Ticket;

public class BugResponseStrategy implements IResponseStrategy {
    public String buildResponse(Ticket ticket) {
        return "Thank you for reporting this bug. Our engineering team is investigating it.";
    }
}


