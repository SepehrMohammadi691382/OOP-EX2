package edu.ticket.state;

import edu.ticket.Ticket;

public class ClosedState implements ITicketState {
    public void handle(Ticket ticket) {
        System.out.println("Ticket closed");
    }
}


