package Practice8_3.P5;

public class MP3Player implements Flyable{
    @Override
    public void play() {
        System.out.println("MP3Player Play");

    }

    @Override
    public void stop() {
        System.out.println("MP3Player stop");

    }

    @Override
    public void pause() {
        System.out.println("MP3Player pause");

    }
}
