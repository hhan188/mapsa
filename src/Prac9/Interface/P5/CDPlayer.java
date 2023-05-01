package Prac9.Interface.P5;

public class CDPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("playing cd");
    }

    @Override
    public void stop() {
        System.out.println("stop cd");
    }

    @Override
    public void pause() {
        System.out.println("pause cd");
    }
}
