package com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.factory;

import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.MusicPlayerFactory;
import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.Playback;
import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.entity.LocalPlayback;

public class LocalMusicPlayerFactory implements MusicPlayerFactory {
    public Playback createPlayback() {
        return new LocalPlayback();
    }
}


