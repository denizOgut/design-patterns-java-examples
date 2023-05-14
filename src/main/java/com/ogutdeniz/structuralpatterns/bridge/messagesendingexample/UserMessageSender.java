package com.ogutdeniz.structuralpatterns.bridge.messagesendingexample;

import com.ogutdeniz.structuralpatterns.bridge.messagesendingexample.channel.MessageChannel;
import com.ogutdeniz.structuralpatterns.bridge.messagesendingexample.formatter.MessageFormatter;

public class UserMessageSender implements MessageSender {
    private MessageFormatter messageFormatter;
    private MessageChannel messageChannel;

    public UserMessageSender(MessageFormatter messageFormatter, MessageChannel messageChannel) {
        this.messageFormatter = messageFormatter;
        this.messageChannel = messageChannel;
    }

    @Override
    public void send(String message) {
        String formattedMessage = messageFormatter.format(message);
        messageChannel.sendMessage(formattedMessage);
    }
}
