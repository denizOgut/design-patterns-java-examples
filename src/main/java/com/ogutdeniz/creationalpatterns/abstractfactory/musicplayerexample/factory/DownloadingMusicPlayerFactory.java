package com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.factory;

import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.MusicPlayerFactory;
import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.Playback;
import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.entity.DownloadingPlayback;

public class DownloadingMusicPlayerFactory implements MusicPlayerFactory {
    public Playback createPlayback() {
        return new DownloadingPlayback();
    }
}
