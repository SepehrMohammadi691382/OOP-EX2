package edu.ticket.ticketPolicy;

import edu.ticket.Ticket;

public class GenericResponseStrategy implements IResponseStrategy {
    public String buildResponse(Ticket ticket) {
        return "Thank you for contacting support. We will get back to you with more details.";
    }
}


