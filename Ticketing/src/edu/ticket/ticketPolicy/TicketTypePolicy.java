package edu.ticket.ticketPolicy;

public class TicketTypePolicy {

    private IRoutingStrategy routingStrategy;
    private IResponseStrategy responseStrategy;

    public TicketTypePolicy(IRoutingStrategy routingStrategy, IResponseStrategy responseStrategy) {
        this.routingStrategy = routingStrategy;
        this.responseStrategy = responseStrategy;
    }

    public IRoutingStrategy getRoutingStrategy() {
        return routingStrategy;
    }

    public IResponseStrategy getResponseStrategy() {
        return responseStrategy;
    }
}


