package edu.ticket.state;

import edu.ticket.Ticket;

public interface ITicketState {
    void handle(Ticket ticket);
}


