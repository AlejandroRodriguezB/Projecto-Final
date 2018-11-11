package com.iesemilidarder.base.data;

public class Flights extends Products{
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTicketKind() {
        return ticketKind;
    }

    public void setTicketKind(String ticketKind) {
        this.ticketKind = ticketKind;
    }

    private String destination;
    private String ticketKind;
}
