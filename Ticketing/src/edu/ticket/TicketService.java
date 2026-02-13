package edu.ticket;

import edu.ticket.ticketPolicy.TicketTypePolicy;
import edu.ticket.ticketPolicy.TicketTypePolicyFactory;

public class TicketService {
    private TicketTypePolicyFactory policyFactory = new TicketTypePolicyFactory();

    public void handle(Ticket ticket) {
        TicketTypePolicy policy = policyFactory.getPolicy(ticket.getType());

        while (!"CLOSED".equals(ticket.getStatus())) {
            ticket.getState().handle(ticket, policy);
        }

        System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getStatus());
    }
}
