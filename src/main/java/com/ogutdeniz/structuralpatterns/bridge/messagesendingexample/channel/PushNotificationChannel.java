package com.ogutdeniz.structuralpatterns.bridge.messagesendingexample.channel;

public class PushNotificationChannel implements MessageChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
