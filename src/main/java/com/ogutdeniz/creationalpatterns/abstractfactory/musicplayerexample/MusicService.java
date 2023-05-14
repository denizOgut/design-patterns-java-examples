package com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample;

public class MusicService {
    private MusicPlayerFactory playerFactory;

    public MusicService(MusicPlayerFactory playerFactory) {
        this.playerFactory = playerFactory;
    }

    public void playMusic() {
        Playback playback = playerFactory.createPlayback();
        playback.play();
    }
}
