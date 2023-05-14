package com.ogutdeniz.structuralpatterns.bridge.messagesendingexample.formatter;

public class TextMessageFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return "Text message: " + message;
    }
}

