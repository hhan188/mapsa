package practice9.interface5;

public class CDPlayer implements Playable {
    @Override
    public void play(){
        System.out.println("cd is playing.");
    }

    @Override
    public void stop(){
        System.out.println("cd has stopped.");
    }

    @Override
    public void pause(){
        System.out.println("cd paused.");
    }

}
