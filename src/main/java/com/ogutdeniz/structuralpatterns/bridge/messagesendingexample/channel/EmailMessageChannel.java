package com.ogutdeniz.structuralpatterns.bridge.messagesendingexample.channel;

public class EmailMessageChannel implements MessageChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email message: " + message);
    }
}

