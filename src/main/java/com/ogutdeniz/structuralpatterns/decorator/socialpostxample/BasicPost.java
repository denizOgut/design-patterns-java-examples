package com.ogutdeniz.structuralpatterns.decorator.socialpostxample;

public class BasicPost implements Post {
    private String text;

    public BasicPost(String text) {
        this.text = text;
    }

    public void create() {
        System.out.println("Creating a basic post with text: " + text);
    }

    public void publish() {
        System.out.println("Publishing a basic post with text: " + text);
    }
}
