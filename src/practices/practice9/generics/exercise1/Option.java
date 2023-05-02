package practices.practice9.generics.exercise1;

public class Option<T> {
    public Option() {
    }

    private T t;

    public Option(T t) {
        this.t = t;
    }


    public boolean isExist(T t) {
        return t != null;
    }
}
