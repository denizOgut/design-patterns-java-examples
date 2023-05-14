package com.ogutdeniz.structuralpatterns.bridge.mediaplayerexample;

public class VideoPlayer implements MediaPlayer {
    private MediaDecoder mediaDecoder;

    public VideoPlayer(MediaDecoder mediaDecoder) {
        this.mediaDecoder = mediaDecoder;
    }

    @Override
    public void play() {
        mediaDecoder.decode("video");
    }
}
