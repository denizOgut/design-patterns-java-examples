package com.ogutdeniz.structuralpatterns.bridge.mediaplayerexample;

public class AudioDecoder implements MediaDecoder {
    @Override
    public void decode(String type) {
        System.out.println("Decoding audio " + type + " file...");
    }
}

