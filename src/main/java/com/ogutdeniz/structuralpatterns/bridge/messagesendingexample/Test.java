package com.ogutdeniz.structuralpatterns.bridge.messagesendingexample;

import com.ogutdeniz.structuralpatterns.bridge.messagesendingexample.channel.EmailMessageChannel;
import com.ogutdeniz.structuralpatterns.bridge.messagesendingexample.formatter.TextMessageFormatter;

public class Test {
    public static void main(String[] args) {
        MessageSender userMessageSender = new UserMessageSender(new TextMessageFormatter(), new EmailMessageChannel());
        userMessageSender.send("Hello, world!");
    }
}
