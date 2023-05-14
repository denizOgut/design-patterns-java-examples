package com.ogutdeniz.structuralpatterns.bridge.messagesendingexample.channel;

public class SMSMessageChannel implements MessageChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS message: " + message);
    }
}
