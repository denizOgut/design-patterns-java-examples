package com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.entity;

import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.Playback;

public class LocalPlayback implements Playback {
    public void play() {
        System.out.println("Local playback started.");
    }
}
