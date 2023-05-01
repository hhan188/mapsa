package Prac9.Interface.P5;

public class MP3Player implements Playable{
    @Override
    public void play() {
        System.out.println("music playing");
    }

    @Override
    public void stop() {
        System.out.println("stop the music");
    }

    @Override
    public void pause() {
        System.out.println("pause the music");
    }
}
