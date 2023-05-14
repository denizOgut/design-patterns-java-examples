package com.ogutdeniz.behavioralpatterns.chainofresponsibility.helpdeskexample;

public class GeneralSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public void handleTicket(Ticket ticket) {
        System.out.println("General support team is handling the ticket: " + ticket.getDescription());
    }
}
