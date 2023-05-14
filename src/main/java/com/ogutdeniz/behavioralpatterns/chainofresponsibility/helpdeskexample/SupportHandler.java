package com.ogutdeniz.behavioralpatterns.chainofresponsibility.helpdeskexample;

public interface SupportHandler {
    void setNextHandler(SupportHandler handler);
    void handleTicket(Ticket ticket);
}
