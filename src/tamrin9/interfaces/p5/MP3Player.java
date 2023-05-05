package tamrin9.interfaces.p5;

public class MP3Player implements Playable{
    @Override
    public void play() {
        System.out.println("MP3 Player is playing ...");
    }

    @Override
    public void stop() {
        System.out.println("MP3 Player is stopped.");
    }

    @Override
    public void pause() {
        System.out.println("MP3 Player is paused.");
    }
}
