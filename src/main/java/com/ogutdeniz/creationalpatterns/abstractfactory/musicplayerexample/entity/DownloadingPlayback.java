package com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.entity;

import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.Playback;

public class DownloadingPlayback implements Playback {
    public void play() {
        System.out.println("Downloading playback started.");
    }
}
