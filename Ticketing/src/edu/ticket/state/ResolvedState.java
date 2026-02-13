package edu.ticket.state;

import edu.ticket.Ticket;

public class ResolvedState implements ITicketState {
    public void handle(Ticket ticket) {
        System.out.println("Ticket resolved");

        ticket.setStatus("CLOSED");
        ticket.setState(new ClosedState());
    }
}


