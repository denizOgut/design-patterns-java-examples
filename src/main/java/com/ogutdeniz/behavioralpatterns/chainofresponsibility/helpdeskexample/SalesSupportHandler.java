package com.ogutdeniz.behavioralpatterns.chainofresponsibility.helpdeskexample;

public class SalesSupportHandler implements SupportHandler {
    private String supportedCategory;
    private SupportHandler nextHandler;

    public SalesSupportHandler(String supportedCategory) {
        this.supportedCategory = supportedCategory;
    }

    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public void handleTicket(Ticket ticket) {
        if (ticket.getCategory().equalsIgnoreCase(supportedCategory)) {
            System.out.println("Sales support team is handling the ticket: " + ticket.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleTicket(ticket);
        } else {
            System.out.println("No support team available for the ticket category: " + ticket.getCategory());
        }
    }
}

