package edu.ticket.state;

import edu.ticket.Ticket;

public class NewState implements ITicketState {
    public void handle(Ticket ticket) {
        System.out.println("Ticket created");

        String channel = ticket.getChannel();
        System.out.println("Received from " + channel);

        ticket.setStatus("ASSIGNED");
        ticket.setState(new AssignedState());
    }
}
