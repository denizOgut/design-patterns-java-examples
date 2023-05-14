package com.ogutdeniz.structuralpatterns.decorator.socialpostxample;

public class VideoPost extends PostDecorator {
    private String videoUrl;

    public VideoPost(Post decoratedPost, String videoUrl) {
        super(decoratedPost);
        this.videoUrl = videoUrl;
    }

    public void publish() {
        System.out.println("Adding video with url: " + videoUrl + " to post.");
        decoratedPost.publish();
    }
}
