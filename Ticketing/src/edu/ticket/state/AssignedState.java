package edu.ticket.state;

import edu.ticket.Ticket;

public class AssignedState implements ITicketState {
    public void handle(Ticket ticket) {
        if (ticket.getType().equals("BUG")) {
            System.out.println("Assigned to engineering");
        } else {
            System.out.println("Assigned to support");
        }

        ticket.setStatus("IN_PROGRESS");
        ticket.setState(new InProgressState());
    }
}
