package edu.ticket.ticketPolicy;

public class TicketTypePolicyFactory {

    public TicketTypePolicy getPolicy(String type) {
        if ("BUG" == type) {
            return new TicketTypePolicy(
                    new BugRoutingStrategy(),
                    new BugResponseStrategy()
            );
        }

        return new TicketTypePolicy(
                new GenericRoutingStrategy(),
                new GenericResponseStrategy()
        );
    }
}


