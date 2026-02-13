package edu.ticket;

public class TicketFactory {

    public Ticket CreateTicket(int id,String channel, String type, String request){
        if (channel == "WEB"){
            return createFromWeb(id, type, request);
        }
        if (channel == "EMAIL"){
            return createFromEmail(id, type, request);
        }
        throw new IllegalArgumentException("Unsupported channel: " + channel);
    }

    private Ticket createFromWeb(int id, String type, String request) {
        Ticket ticket = new Ticket(id, "WEB", type);
        ticket.setRequest(request);
        return ticket;
    }

    private Ticket createFromEmail(int id, String type, String request) {
        Ticket ticket = new Ticket(id, "EMAIL", type);
        ticket.setRequest(request);
        return ticket;
    }
}


