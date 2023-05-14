package com.ogutdeniz.structuralpatterns.decorator.socialpostxample;

public class PhotoPost extends PostDecorator {
    private String photoUrl;

    public PhotoPost(Post decoratedPost, String photoUrl) {
        super(decoratedPost);
        this.photoUrl = photoUrl;
    }

    public void publish() {
        System.out.println("Adding photo with url: " + photoUrl + " to post.");
        decoratedPost.publish();
    }
}


