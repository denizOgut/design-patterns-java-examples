package com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.entity;

import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.Playback;

public class StreamingPlayback implements Playback {
    public void play() {
        System.out.println("Streaming playback started.");
    }
}
