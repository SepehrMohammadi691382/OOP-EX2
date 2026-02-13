package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.ticketPolicy.TicketTypePolicy;

public class AssignedState implements ITicketState {
    public void handle(Ticket ticket, TicketTypePolicy policy) {
        String department = policy.getRoutingStrategy().route(ticket);
        System.out.println("Assigned to " + department);

        ticket.setStatus("IN_PROGRESS");
        ticket.setState(new InProgressState());
    }
}


