package practices.practice9.interface1.exercise4;

public class Superman implements Flyable<Superman>{
    @Override
    public Superman fly() {
        return new Superman();
    }
}
