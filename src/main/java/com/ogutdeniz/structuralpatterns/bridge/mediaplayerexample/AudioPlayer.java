package com.ogutdeniz.structuralpatterns.bridge.mediaplayerexample;

public class AudioPlayer implements MediaPlayer {
    private MediaDecoder mediaDecoder;

    public AudioPlayer(MediaDecoder mediaDecoder) {
        this.mediaDecoder = mediaDecoder;
    }

    @Override
    public void play() {
        mediaDecoder.decode("audio");
    }
}

