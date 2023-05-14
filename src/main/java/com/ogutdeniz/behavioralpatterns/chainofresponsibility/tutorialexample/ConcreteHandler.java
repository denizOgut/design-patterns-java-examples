package com.ogutdeniz.behavioralpatterns.chainofresponsibility.tutorialexample;

public class ConcreteHandler implements RequestHandler {
    private String handlerType;
    private RequestHandler nextHandler;

    public ConcreteHandler(String handlerType) {
        this.handlerType = handlerType;
    }

    public void setNextHandler(RequestHandler handler) {
        this.nextHandler = handler;
    }

    public void handleRequest(Request request) {
        if (request.getType().equals(handlerType)) {
            // Handle the request
            System.out.println("Handling request with handler: " + handlerType);
        } else if (nextHandler != null) {
            // Pass the request to the next handler
            nextHandler.handleRequest(request);
        } else {
            // Reached the end of the chain without handling the request
            System.out.println("Cannot handle the request.");
        }
    }
}
