package com.practice9.interfacePractice.Tamrin5;

public class MP3Player implements Playable
{

    @Override
    public void play() {
        System.out.println("MP3 Player Played");
    }

    @Override
    public void stop() {
        System.out.println("MP3 Player Stopped");
    }

    @Override
    public void pause() {
        System.out.println("MP3 Player Paused");
    }
}
