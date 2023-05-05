package tamrin9.generics.p4;

public class Option<T> {

    private final T value;


    public Option(T value) {
        this.value = value;
    }

    public T getValue() {
        if (isPresent(value))
            return value;
        return null;
    }

    public boolean isPresent(T value) {
        return value != null;
    }
}
