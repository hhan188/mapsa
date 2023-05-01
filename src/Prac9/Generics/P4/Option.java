package Prac9.Generics.P4;

public class Option <T>{
    T value;
    Option() {}
    Option(T value) {
        this.value = value;
    }
    public T getValue() {
        if (value == null) {
            System.out.println("Empty value");
        }
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
