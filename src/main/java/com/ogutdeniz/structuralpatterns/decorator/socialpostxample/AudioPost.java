package com.ogutdeniz.structuralpatterns.decorator.socialpostxample;

public class AudioPost extends PostDecorator {
    private String audioUrl;

    public AudioPost(Post decoratedPost, String audioUrl) {
        super(decoratedPost);
        this.audioUrl = audioUrl;
    }

    public void publish() {
        System.out.println("Adding audio with url: " + audioUrl + " to post.");
        decoratedPost.publish();
    }
}
