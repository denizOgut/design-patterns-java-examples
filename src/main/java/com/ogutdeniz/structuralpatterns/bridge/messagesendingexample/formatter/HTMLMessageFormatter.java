package com.ogutdeniz.structuralpatterns.bridge.messagesendingexample.formatter;

public class HTMLMessageFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return "<html><body><p>" + message + "</p></body></html>";
    }
}
