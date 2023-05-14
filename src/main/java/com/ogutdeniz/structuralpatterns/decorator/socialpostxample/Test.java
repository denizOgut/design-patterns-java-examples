package com.ogutdeniz.structuralpatterns.decorator.socialpostxample;

public class Test {
    public static void main(String[] args) {
        // Create a basic post
        Post post = new BasicPost("Hello world!");

        // Decorate the post with a photo
        post = new PhotoPost(post, "https://example.com/myphoto.jpg");

        // Decorate the post with a video
        post = new VideoPost(post, "https://example.com/myvideo.mp4");

        // Decorate the post with audio
        post = new AudioPost(post, "https://example.com/mysong.mp3");

        // Publish the fully decorated post
        post.publish();
    }
}
