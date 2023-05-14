package com.ogutdeniz.structuralpatterns.decorator.socialpostxample;

public abstract class PostDecorator implements Post {
    protected Post decoratedPost;

    public PostDecorator(Post decoratedPost) {
        this.decoratedPost = decoratedPost;
    }

    public void create() {
        decoratedPost.create();
    }

    public void publish() {
        decoratedPost.publish();
    }
}
