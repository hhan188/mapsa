package SoheylSayyah.Practice9.Interface.Exercise5;

public class MP3Player implements Playable{
    @Override
    public void play() {
        System.out.println("MP3Player Played ...");
    }

    @Override
    public void stop() {
        System.out.println("MP3Player Stopped ...");
    }

    @Override
    public void pause() {
        System.out.println("MP3Player Paused ...");
    }
}
