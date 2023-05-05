package SoheylSayyah.Practice9.Interface.Exercise5;

public class CDPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("CDPlayer Played ...");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer Stopped ...");
    }

    @Override
    public void pause() {
        System.out.println("CDPlayer Paused ...");
    }
}
