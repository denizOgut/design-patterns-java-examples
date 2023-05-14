package com.ogutdeniz.behavioralpatterns.chainofresponsibility.tutorialexample;

public class Request {
    private String type;

    public Request(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}


