package com.practice9.interfacePractice.Tamrin5;

public class CDPlayer implements Playable
{

    @Override
    public void play() {
        System.out.println("CD Player Played");
    }

    @Override
    public void stop() {
        System.out.println("CD Player Stopped");
    }

    @Override
    public void pause() {
        System.out.println("CD Player Paused");
    }
}
