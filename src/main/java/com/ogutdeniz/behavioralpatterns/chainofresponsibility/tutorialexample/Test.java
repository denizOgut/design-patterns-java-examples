package com.ogutdeniz.behavioralpatterns.chainofresponsibility.tutorialexample;

public class Test {
    public static void main(String[] args) {
        RequestHandler handler1 = new ConcreteHandler("Handler 1");
        RequestHandler handler2 = new ConcreteHandler("Handler 2");
        RequestHandler handler3 = new ConcreteHandler("Handler 3");


        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);


        Request request = new Request("Handler 2");


        handler1.handleRequest(request);
    }
}
