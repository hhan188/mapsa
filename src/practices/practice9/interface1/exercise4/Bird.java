package practices.practice9.interface1.exercise4;

public class Bird implements Flyable<Bird>{
    @Override
    public Bird fly() {
        return new Bird();
    }
}
