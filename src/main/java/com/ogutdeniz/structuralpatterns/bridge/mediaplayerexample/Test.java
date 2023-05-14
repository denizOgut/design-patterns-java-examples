package com.ogutdeniz.structuralpatterns.bridge.mediaplayerexample;

public class Test {
    public static void main(String[] args) {

        MediaPlayer audioPlayer = new AudioPlayer(new AudioDecoder());
        MediaPlayer videoPlayer = new VideoPlayer(new VideoDecoder());

        audioPlayer.play();
        videoPlayer.play();
    }
}
