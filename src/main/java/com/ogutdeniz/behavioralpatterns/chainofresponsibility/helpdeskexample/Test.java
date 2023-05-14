package com.ogutdeniz.behavioralpatterns.chainofresponsibility.helpdeskexample;

public class Test {
    public static void main(String[] args) {
        SupportHandler supportHandler = SupportHandlerFactory.createSupportChain();


        Ticket ticket = new Ticket("Technical", "I'm facing an issue with my computer.");


        supportHandler.handleTicket(ticket);
    }
}
