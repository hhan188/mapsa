package Practice9.Generics.Four;

public class Option<T> {
    private T value;

    public Option(T value) {
        this.value = value;
    }

    public void isPresent() {
        if (value != null)
            System.out.println(true + "\n" + value);
        else System.out.println(false);
    }
}
