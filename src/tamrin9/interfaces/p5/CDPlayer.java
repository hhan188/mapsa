package tamrin9.interfaces.p5;

public class CDPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("CD Player is playing ...");
    }

    @Override
    public void stop() {
        System.out.println("CD Player is stopped.");
    }

    @Override
    public void pause() {
        System.out.println("CD Player is paused.");
    }
}
