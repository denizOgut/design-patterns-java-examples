package com.ogutdeniz.structuralpatterns.bridge.mediaplayerexample;

public class VideoDecoder implements MediaDecoder {
    @Override
    public void decode(String type) {
        System.out.println("Decoding video " + type + " file...");
    }
}
