package com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample;

import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.factory.DownloadingMusicPlayerFactory;
import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.factory.LocalMusicPlayerFactory;
import com.ogutdeniz.creationalpatterns.abstractfactory.musicplayerexample.factory.StreamingMusicPlayerFactory;

public class MusicPlayerTest {
    public static void main(String[] args) {
        MusicService streamingService = new MusicService(new StreamingMusicPlayerFactory());
        MusicService downloadingService = new MusicService(new DownloadingMusicPlayerFactory());
        MusicService localService = new MusicService(new LocalMusicPlayerFactory());

        streamingService.playMusic();
        downloadingService.playMusic();
        localService.playMusic();
    }
}
