package edu.ticket;

import edu.ticket.state.ITicketState;
import edu.ticket.state.NewState;

public class Ticket {
    private int id;
    private String status = "NEW";
    private String channel;
    private String type;
    private String request;
    private String response;
    private ITicketState state;

    public Ticket(int id,String channel, String type) {
        this.id = id;
        this.channel = channel;
        this.type = type;
        this.state = new NewState();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ITicketState getState() {
        return state;
    }

    public void setState(ITicketState state) {
        this.state = state;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getId() {
        return this.id;
    }
}
