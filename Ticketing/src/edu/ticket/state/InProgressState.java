package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.ticketPolicy.TicketTypePolicy;

public class InProgressState implements ITicketState {
    public void handle(Ticket ticket, TicketTypePolicy policy) {
        System.out.println("Working on ticket");

        String response = policy.getResponseStrategy().buildResponse(ticket);
        ticket.setResponse(response);
        System.out.println("Sending response: " + response);

        ticket.setStatus("RESOLVED");
        ticket.setState(new ResolvedState());
    }
}


