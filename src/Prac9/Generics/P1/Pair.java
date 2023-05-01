package Prac9.Generics.P1;

public class Pair <T, U>{
    private T one;
    private U two;

    public Pair(T one, U two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public U getTwo() {
        return two;
    }
}
