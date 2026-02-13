package edu.ticket;

public class TicketService {
    public void handle(Ticket ticket) {
        while (!"CLOSED".equals(ticket.getStatus())) {
            ticket.getState().handle(ticket);
        }

        System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getStatus());
    }
}
