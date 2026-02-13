package edu.ticket.ticketPolicy;

import edu.ticket.Ticket;

public interface IResponseStrategy {
    String buildResponse(Ticket ticket);
}
