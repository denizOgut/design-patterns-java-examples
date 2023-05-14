package com.ogutdeniz.behavioralpatterns.chainofresponsibility.tutorialexample;

public interface RequestHandler {
    void setNextHandler(RequestHandler handler);
    void handleRequest(Request request);
}
