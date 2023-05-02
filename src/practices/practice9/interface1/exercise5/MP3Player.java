package practices.practice9.interface1.exercise5;

public class MP3Player implements Playable{

    @Override
    public void play() {
        System.out.println("MP3Player Player is Playing");
    }

    @Override
    public void stop() {
        System.out.println("MP3Player Player  Stopped");
    }

    @Override
    public void pause() {
        System.out.println("MP3Player Player Paused");
    }
}
