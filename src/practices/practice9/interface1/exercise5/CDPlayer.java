package practices.practice9.interface1.exercise5;

public class CDPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Cd Player is Playing");
    }

    @Override
    public void stop() {
        System.out.println("Cd Player  Stopped");
    }

    @Override
    public void pause() {
        System.out.println("Cd Player Paused");
    }
}
