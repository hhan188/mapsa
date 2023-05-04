package Practice8_3.P5;

public class CDPlayer implements Flyable{
    @Override
    public void play() {
        System.out.println("CDPlayer play");

    }

    @Override
    public void stop() {
        System.out.println("CDPlayer stop");

    }

    @Override
    public void pause() {
        System.out.println("CDPlayer pause");

    }
}
