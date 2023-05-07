package practice9.interface5;

import practice9.interface5.Playable;

public class MP3Player implements Playable {
    @Override
    public void play(){
        System.out.println("mp3 is playing.");
    }

    @Override
    public void stop(){
        System.out.println("mp3 has stopped.");
    }

    @Override
    public void pause(){
        System.out.println("mp3 paused.");
    }
}
