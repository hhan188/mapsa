package practices.practice9.interface1.exercise4;

public class Plane implements Flyable<Plane>{
    @Override
    public Plane fly() {
        return new Plane();
    }
}
